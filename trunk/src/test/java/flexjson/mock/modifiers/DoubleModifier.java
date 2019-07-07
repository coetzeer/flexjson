package flexjson.mock.modifiers;

public class DoubleModifier extends AbstractModifier<Double> {

    protected DoubleModifier() {
    }

    public DoubleModifier(Double aLimit) {
        setLimit( aLimit );
    }
}
