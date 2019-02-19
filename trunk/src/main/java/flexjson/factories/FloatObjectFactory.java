package flexjson.factories;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;

import java.lang.reflect.Type;

public class FloatObjectFactory implements ObjectFactory<Float> {
    public Float instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
        if (value instanceof Number) {
            return ((Number) value).floatValue();
        } else {
            try {
                return Float.parseFloat(value.toString());
            } catch (Exception e) {
                throw context.cannotConvertValueToTargetType(value, Float.class);
            }
        }
    }
}
