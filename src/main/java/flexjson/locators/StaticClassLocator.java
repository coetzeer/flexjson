package flexjson.locators;

import flexjson.ClassLocator;
import flexjson.Path;
import flexjson.ObjectBinder;

import java.lang.reflect.Modifier;
import java.util.Map;

/**
 * Simple implementation for translating an object path to a single class.
 * Normally you would not use this class directly and use the
 * {@link flexjson.JSONDeserializer#use(String, Class)} method
 * instead.
 */
public class StaticClassLocator implements ClassLocator {
    private Class target;

    public StaticClassLocator(Class clazz) {
        target = clazz;
        if( target.isInterface() || Modifier.isAbstract(target.getModifiers()) ) throw new IllegalArgumentException("Either use @JSONTypeHierarchy annotation or use a TypeLocator to specify the concrete class to use.");
    }

    public Class locate(ObjectBinder context, Path currentPath) {
        return target;
    }
}
