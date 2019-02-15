package flexjson;

public class DeferredInstantiation<T> {

    protected Class<? extends T> clazz;
    protected T instantiated;

    public DeferredInstantiation() {
    }

    public DeferredInstantiation(Class<? extends T> clazz) {
        this.clazz = clazz;
    }

    public synchronized T get() throws IllegalAccessException, InstantiationException {
        if( instantiated == null ) {
            instantiated = instantiate();
        }
        return instantiated;
    }

    protected T instantiate() throws InstantiationException, IllegalAccessException {
        return clazz.newInstance();
    }
}
