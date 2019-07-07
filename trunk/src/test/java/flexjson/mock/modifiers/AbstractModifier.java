package flexjson.mock.modifiers;

public abstract class AbstractModifier<T> {

    private T limit;

    public T getLimit() {
        return limit;
    }

    public void setLimit(T limit) {
        this.limit = limit;
    }
}
