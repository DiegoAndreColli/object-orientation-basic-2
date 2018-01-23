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
        
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.nome = "Saint Library";
        
        Autor fiodor = new Autor();
        fiodor.nome = "Fiódor Dostoiévski";
        
        Autor aristoteles = new Autor();
        aristoteles.nome = "Aristóteles";
                
        Livro livro1 = new Livro();
        livro1.autor = fiodor;
        livro1.ISBN = "978-3-16-148410";
        
        Livro livro2 = new Livro();
        livro2.autor = aristoteles;
        livro2.ISBN = "789-3-61-123456";
        
        biblioteca.livros = Arrays.asList(livro1, livro2);
        
        System.out.println("Acervo da: "+biblioteca.nome);
        for (Livro livro : biblioteca.livros) {
            System.out.println(livro.ISBN+" "+livro.autor.nome);
        }
        
    }
    
}
