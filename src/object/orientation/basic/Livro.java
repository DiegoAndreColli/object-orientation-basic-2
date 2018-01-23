package object.orientation.basic;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author User
 */
class Livro {
    String ISBN;
    Autor autor;
    Biblioteca biblioteca;
    List<Capitulo> capitulos;

    Livro() {
        capitulos = Arrays.asList(
            new Capitulo(this, 1),
            new Capitulo(this, 2),
            new Capitulo(this, 3));
    }

}