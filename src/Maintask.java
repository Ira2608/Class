import java.util.GregorianCalendar;

public class Maintask {

    public static void main(String[] args) {
        //create books
        Book[] boo = new Book[3];
        boo[0] = new Book(1,"ko ko", "Fill", "First", new GregorianCalendar(2010, 7, 8), 45, 90, "Some");
        boo[1] = new Book(2, "ga ga", "Jack", "Second", new GregorianCalendar(2015, 1, 6), 160,150,"Any");
        boo[2] = new Book(3, "te te", "Nick", "therd", new GregorianCalendar(2017,6,9),200,360, "None");
        //creat listik
        List l = new List();
        for (Book k: boo) {
            l.addBook(k);
        }
        System.out.println("список книг заданного автора ");
        l.listOutByWriter("Jack");
        System.out.println("список книг, выпущенных заданным издательством ");
        l.listOutByPublishinghouse("first");
        System.out.println("Cписок книг, выпущенных после заданного года ");
        l.listOutByDate(new GregorianCalendar(2016,5,9));
    }
}
