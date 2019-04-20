package flexjson.factories;

import flexjson.*;

import java.lang.reflect.Type;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class BeanObjectFactory implements ObjectFactory {

    public Object instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
        try {
            Object target = instantiate( resolveHierarchy( context, (Map)value, targetClass ) );
            return context.bindIntoObject( (Map)value, target, targetType );
        } catch (InstantiationException e) {
            throw new JSONException(context.getCurrentPath() + ":There was an exception trying to instantiate an instance of " + targetClass.getName(), e );
        } catch (IllegalAccessException e) {
            throw new JSONException(context.getCurrentPath() + ":There was an exception trying to instantiate an instance of " + targetClass.getName(), e );
        } catch (InvocationTargetException e) {
            throw new JSONException(context.getCurrentPath() + ":There was an exception trying to instantiate an instance of " + targetClass.getName(), e );
        } catch (NoSuchMethodException e) {
            throw new JSONException(context.getCurrentPath() + ": " + targetClass.getName() + " lacks a no argument constructor.  Flexjson will instantiate any protected, private, or public no-arg constructor.", e );
        }
    }

    private Class resolveHierarchy(ObjectBinder context, Map value, Class targetClass) {
        JSONTypeHierarchy hierarchy = (JSONTypeHierarchy)targetClass.getAnnotation( JSONTypeHierarchy.class );
        if( hierarchy != null ) {
            String typeFieldName = hierarchy.typeFieldName();
            Object typeValue = value.get(typeFieldName);
            for( TypeMapping mapping : hierarchy.typeMappings() ) {
                if( mapping.value().equals(typeValue) ) {
                    return mapping.type();
                }
            }
            throw new JSONException( context.getCurrentPath() +  ": Unrecognized type " + typeValue + " for type hierarchy for " + targetClass.getCanonicalName() );
        } else {
            return targetClass;
        }
    }

    protected Object instantiate( Class clazz ) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible( true );
        return constructor.newInstance();
    }
}
