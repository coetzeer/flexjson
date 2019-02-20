package flexjson.factories;

import flexjson.JSONException;
import flexjson.ObjectBinder;
import flexjson.ObjectFactory;

import java.lang.reflect.Type;
import java.util.Map;

public class DefinedMappingObjectFactory<T> implements ObjectFactory<T> {

    private Class<T> definedClass;

    public DefinedMappingObjectFactory(Class<T> clazz) {
        this.definedClass = clazz;
    }

    public T instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
        try {
            T result = definedClass.newInstance();
            return context.bindIntoObject((Map) value, result, definedClass);
        } catch( InstantiationException ex ) {
            throw new JSONException( context.getCurrentPath() + ": Could not instantiate: " + definedClass.getName(), ex );
        } catch (IllegalAccessException ex) {
            throw new JSONException(context.getCurrentPath() + ": Illegal access to " + definedClass.getName(), ex);
        }
    }
}
