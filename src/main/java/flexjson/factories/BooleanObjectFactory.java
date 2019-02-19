package flexjson.factories;

import flexjson.ObjectFactory;
import flexjson.ObjectBinder;

import java.lang.reflect.Type;

public class BooleanObjectFactory implements ObjectFactory<Boolean> {
    public Boolean instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
        return (Boolean)value;
    }
}
