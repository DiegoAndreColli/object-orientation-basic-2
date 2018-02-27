package object.orientation.basic;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Creates Library */
        Library library = new Library();
        library.name = "Saint Library";
        /* Creates Authors */
        Author fiodor = new Author();
        fiodor.name = "Fiódor Dostoiévski";
        Author aristoteles = new Author();
        aristoteles.name = "Aristóteles";
        /* Creates Books */
        Book book1 = new Book();
        book1.author = fiodor;
        book1.ISBN = "978-3-16-148410";
        Book book2 = new Book();
        book2.author = aristoteles;
        book2.ISBN = "789-3-61-123456";
        /* Put the books in the library */
        library.books = Arrays.asList(book1, book2);
        /* Shows Library Books */
        System.out.println("Collection of: " + library.name);
        for (Book book : library.books) {
            System.out.println(book.ISBN + " " + book.author.name);

        }
    }

}
