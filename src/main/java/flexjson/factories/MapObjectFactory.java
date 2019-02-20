package flexjson.factories;

import flexjson.ObjectFactory;
import flexjson.ObjectBinder;

import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import java.util.Map;
import java.util.HashMap;

public class MapObjectFactory implements ObjectFactory<Map> {
    public Map instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
        if( targetType != null ) {
            if( targetType instanceof ParameterizedType ) {
                ParameterizedType ptype = (ParameterizedType) targetType;
                Type keyType = ptype.getActualTypeArguments()[0];
                Type valueType = ptype.getActualTypeArguments()[1];
                return context.bindIntoMap( (Map)value, createMapImpl(),
                        keyType == Object.class ? null : keyType,
                        valueType == Object.class ? null : valueType,
                        context.getValueObjectFactory() );
            }
        }
        return context.bindIntoMap( (Map)value, createMapImpl(), null, null, context.getValueObjectFactory() );
    }

    protected HashMap<Object, Object> createMapImpl() {
        return new HashMap<Object,Object>();
    }
}
