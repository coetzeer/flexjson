package flexjson.mock.modifiers;

public class IntegerModifier extends AbstractModifier<Integer> {

    protected IntegerModifier() {
    }

    public IntegerModifier(Integer aLimit) {
        setLimit( aLimit );
    }
}
