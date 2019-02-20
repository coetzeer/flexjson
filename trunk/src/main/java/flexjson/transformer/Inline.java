package flexjson.transformer;

public interface Inline {

    /**
     * CAUTION: THIS IS FOR ADVANCED FEATURES
     *
     * If you want your transformer to handle writing of the property
     * name and the value have it implement this interface. This will
     * flag FlexJSON to not generate property names for this Transform.
     * @return Whether or not the Transformer wants to handle both writing the property name AND the value.
     */
    public Boolean isInline();

}
