package flexjson.factories;

import flexjson.JsonNumber;
import flexjson.ObjectBinder;
import flexjson.ObjectFactory;

import java.lang.reflect.Type;

public class NumberObjectFactory implements ObjectFactory<Number> {
    public Number instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
        JsonNumber number = (JsonNumber) value;
        if( number.isLong() ) {
            return number.longValue();
        } else {
            return number.doubleValue();
        }
    }
}
