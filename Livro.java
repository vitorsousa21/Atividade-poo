import java.util.ArrayList;
import java.util.List;

public class Livro {

    private String titulo;
    private Autor autor;

    private List<Capitulo> capitulos;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.capitulos = new ArrayList<>();
    }

    public void adicionarCapitulo(Capitulo capitulo) {
        capitulos.add(capitulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    @Override
    public String toString() {

        String dados = "Livro: " + titulo + "\n";
        dados += autor + "\n";

        dados += "Capítulos:\n";

        for (Capitulo c : capitulos) {
            dados += c + "\n";
        }

        return dados;
    }
}