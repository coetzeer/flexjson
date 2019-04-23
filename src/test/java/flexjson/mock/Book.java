package flexjson.mock;

public class Book extends Periodical {

    private String isbn;

    protected Book() {
        super();
    }

    public Book(String isbn, String name, int pages) {
        super(name, pages);
        this.isbn = isbn;
    }

    @Override
    public String getID() {
        return isbn;
    }

    @Override
    public void setID(String id) {
        isbn = id;
    }

    public String getType() {
        return "book";
    }

    public void setID(Integer id) {
        isbn = Integer.toString( id );
    }

    public boolean isA() {
        return false;
    }
}
