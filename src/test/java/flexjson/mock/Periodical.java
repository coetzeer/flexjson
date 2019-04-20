package flexjson.mock;

import flexjson.JSONTypeHierarchy;
import flexjson.TypeMapping;

@JSONTypeHierarchy(typeFieldName = "type", typeMappings = {
        @TypeMapping(value = "book", type = Book.class),
        @TypeMapping(value = "magazine", type = Magazine.class)
})
public abstract class Periodical {

    private String name;

    protected Periodical() {}

    protected Periodical(String name) {
        this.name = name;
    }

    public abstract String getID();

    public abstract void setID( String id );

    public abstract String getType();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
