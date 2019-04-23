package flexjson.mock;

import flexjson.JSONTypeHierarchy;
import flexjson.TypeMapping;

@JSONTypeHierarchy(typeFieldName = "type", typeMappings = {
        @TypeMapping(value = "book", type = Book.class),
        @TypeMapping(value = "magazine", type = Magazine.class)
})
public abstract class Periodical {

    private String name;

    private Number pages;

    protected Periodical() {}

    protected Periodical(String name, int pages) {
        this.name = name;
        this.pages = pages;
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

    public Number getPages() {
        return pages;
    }

    public void setPages(Number pages) {
        this.pages = pages;
    }
}
