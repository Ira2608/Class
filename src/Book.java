import java.util.GregorianCalendar;

public class Book {

    private int id;
    private String title;
    private String writer;
    private String publishinghouse;
    private GregorianCalendar date;
    private int pages;
    private int price;
    private String binding_tipe;

    //конструктор

    public Book(int id, String title, String writer, String publishinghouse, GregorianCalendar date, int pages,
                        int price, String binding_tipe) {

        this.id = id;
        this.title = title;
        this.writer = writer;
        this.publishinghouse = publishinghouse;
        this.date = date;
        this.pages = pages;
        this.price = price;
        this.binding_tipe = binding_tipe;
    }

    // сеттеры и геттеры
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublishinghouse() {
        return publishinghouse;
    }

    public void setPublishinghouse(String publishinghouse) {
        this.publishinghouse = publishinghouse;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBinding_tipe() {
        return binding_tipe;
    }

    public void setBinding_tipe(String binding_tipe) {
        this.binding_tipe = binding_tipe;
    }

}
