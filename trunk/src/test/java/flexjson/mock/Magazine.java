package flexjson.mock;

public class Magazine extends Periodical {

    private String issn;

    public Magazine(String issn, String name) {
        super(name);
        this.issn = issn;
    }

    protected Magazine() {
        super();
    }

    public Magazine(String name) {
        super(name);
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
