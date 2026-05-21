public class ProgramaAssociacao {

    public static void main(String[] args) {

        // Criando autores
        Autor autor1 = new Autor("Machado de Assis", "Brasileiro");

        // Criando livros
        Livro livro1 = new Livro("Dom Casmurro", autor1);

        // Criando capítulos
        Capitulo cap1 = new Capitulo(1, "Do Título");
        Capitulo cap2 = new Capitulo(2, "Do Princípio");

        // Adicionando capítulos ao livro
        livro1.adicionarCapitulo(cap1);
        livro1.adicionarCapitulo(cap2);

        // Criando biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Adicionando livro à biblioteca
        biblioteca.adicionarLivro(livro1);

        // Imprimindo dados
        biblioteca.imprimirLivros();
    }
}