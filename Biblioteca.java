import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nome;

    // Agregação
    private List<Livro> livros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void imprimirLivros() {

        System.out.println("Biblioteca: " + nome);

        for (Livro livro : livros) {
            System.out.println("----------------------");
            System.out.println(livro);
        }
    }
}