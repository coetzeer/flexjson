package flexjson.mock;

public class Magazine extends Periodical {

    private String issn;

    public Magazine(String issn, String name, int pages) {
        super(name, pages);
        this.issn = issn;
    }

    protected Magazine() {
        super();
    }

    public String getID() {
        return issn;
    }

    public void setID(String id) {
        this.issn = id;
    }

    public String getType() {
        return "magazine";
    }
}
