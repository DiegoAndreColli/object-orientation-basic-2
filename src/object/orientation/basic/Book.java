package object.orientation.basic;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author User
 */
class Book {
    String ISBN;
    Author author;
    Library library ;
    List<Chapter> chapters;

    Book() {
        chapters = Arrays.asList(
            new Chapter(this, 2),
            new Chapter(this, 2),
            new Chapter(this, 3));
    }
}