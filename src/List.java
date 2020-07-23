import java.util.Calendar;
import java.util.GregorianCalendar;

public class List {

    private Book[] booklist = new Book[100];
    int k = 0; //счётчик

    public void addBook(Book n) {

        booklist[k++] = n;
    }

//    public void listOut(Book[] booklist) {
//        for (Book m : booklist) {
//
//            System.out.print("id " + m.getId() + ", ");
//            System.out.print("название " + m.getTitle() + ", ");
//            System.out.print("Автор " + m.getWriter() + ", ");
//            System.out.print("Издательство " + m.getPublishinghouse() + ", ");
//            System.out.print("Год издания " + m.getDate().get(Calendar.YEAR) + "." + m.getDate().get(Calendar.MONTH) + "." + m.getDate().get(Calendar.DAY_OF_MONTH));
//            System.out.print("Количество страниц " + m.getPages() + ", ");
//            System.out.print("Цена " + m.getPrice() + ", ");
//            System.out.print("Тип переплёта  " + m.getBinding_tipe() + ".");
//            System.out.println();
//        }
//
//    }

    public void listOutByWriter(String writer) {
        for (Book m : booklist) {
            if (m != null) {
                if (writer.equalsIgnoreCase(m.getWriter())) {
                    System.out.print("id " + m.getId() + ", ");
                    System.out.print("название " + m.getTitle() + ", ");
                    System.out.print("Автор " + m.getWriter() + ", ");
                    System.out.print("Издательство " + m.getPublishinghouse() + ", ");
                    System.out.print("Год издания " + m.getDate().get(Calendar.YEAR) + "." + m.getDate().get(Calendar.MONTH) + "." + m.getDate().get(Calendar.DAY_OF_MONTH));
                    System.out.print("Количество страниц " + m.getPages() + ", ");
                    System.out.print("Цена " + m.getPrice() + ", ");
                    System.out.print("Тип переплёта  " + m.getBinding_tipe() + ".");
                    System.out.println();
                }
            }
        }
    }

    public void listOutByPublishinghouse(String publishinghouse) {
        for (Book m : booklist) {
            if (m != null) {
                if (publishinghouse.equalsIgnoreCase(m.getPublishinghouse())) {
                    System.out.print("id " + m.getId() + ", ");
                    System.out.print("название " + m.getTitle() + ", ");
                    System.out.print("Автор " + m.getWriter() + ", ");
                    System.out.print("Издательство " + m.getPublishinghouse() + ", ");
                    System.out.print("Год издания " + m.getDate().get(Calendar.YEAR) + "." + m.getDate().get(Calendar.MONTH) + "." + m.getDate().get(Calendar.DAY_OF_MONTH));
                    System.out.print("Количество страниц " + m.getPages() + ", ");
                    System.out.print("Цена " + m.getPrice() + ", ");
                    System.out.print("Тип переплёта  " + m.getBinding_tipe() + ".");
                    System.out.println();

                }
            }
        }
    }

    public void listOutByDate(GregorianCalendar year) {
        for (Book m : booklist) {

            if (m != null) {

                if (m.getDate().get(Calendar.YEAR) > year.get(Calendar.YEAR)) {
                    System.out.print("id " + m.getId() + ", ");
                    System.out.print("название " + m.getTitle() + ", ");
                    System.out.print("Автор " + m.getWriter() + ", ");
                    System.out.print("Издательство " + m.getPublishinghouse() + ", ");
                    System.out.print("Год издания " + m.getDate().get(Calendar.YEAR) + "." + m.getDate().get(Calendar.MONTH) + "." + m.getDate().get(Calendar.DAY_OF_MONTH));
                    System.out.print("Количество страниц " + m.getPages() + ", ");
                    System.out.print("Цена " + m.getPrice() + ", ");
                    System.out.print("Тип переплёта  " + m.getBinding_tipe() + ".");
                    System.out.println();
                }
            }
        }
    }
}

