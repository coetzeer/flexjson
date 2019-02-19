package flexjson.factories;

import flexjson.ObjectFactory;
import flexjson.ObjectBinder;

import java.lang.reflect.Type;

public class StringObjectFactory implements ObjectFactory<String> {
    public String instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
        return value.toString();
    }
}
