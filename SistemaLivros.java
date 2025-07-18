public class SistemaLivros {
    public static void main(String[] args) {

        Livros livro = new Livros();
        livro.setCodigo(01);
        livro.setTitulo("Coraline");
        livro.setAutor("Fulano");
        livro.setEditora("Editora ABC");
        livro.setNmrPaginas(450);
        livro.setEdicao(2);

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();
        String mensagem = "\nCódigo: " + livro.getCodigo() +
                "\nTítulo: " + livro.getTitulo() +
                "\nAutor: " + livro.getAutor() +
                "\nEditora: " + livro.getEditora() +
                "\nNumero de Páginas: " + livro.getNmrPaginas() +
                "\nEdiçao: " + livro.getEdicao();

        System.out.println("\nLivro" + mensagem);

        System.out.println("Codigo do Livro: " + livro.getCodigo());
        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Editora: " + livro.getEditora());

        /* Livro de Biblioteca */
        System.out.println("\nLivro de Biblioteca");
        LivroDeBiblioteca livrobiblioteca = new LivroDeBiblioteca();
        livrobiblioteca.codigo = 02;
        livrobiblioteca.setTitulo("Cinderela");
        livrobiblioteca.setAutor("Irmãos Grimm");
        livrobiblioteca.setEditora("Editora xYz");
        livrobiblioteca.setNmrPaginas(100);
        livrobiblioteca.setEdicao(5);
        livrobiblioteca.setLocalPrateleira("InfantilABC");
        livrobiblioteca.setCategoria("Infantil");
        livrobiblioteca.setPrazoEntrega(10);
        ;
        livrobiblioteca.setNomeQuemEmprestou("Isadora Goedert");

        livrobiblioteca.Ler();
        livrobiblioteca.Cadastrar();
        livrobiblioteca.Localizar();
        livrobiblioteca.Alugar();
        livrobiblioteca.Devolver();

        mensagem = "\nCódigo: " + livrobiblioteca.getCodigo() +
                "\nTítulo: " + livrobiblioteca.getTitulo() +
                "\nAutor: " + livrobiblioteca.getAutor() +
                "\nEditora: " + livrobiblioteca.getEditora() +
                "\nNumero de Páginas: " + livrobiblioteca.getNmrPaginas() +
                "\nEdiçao: " + livrobiblioteca.getEdicao() +
                "\nLocal: " + livrobiblioteca.getLocalPrateleira() +
                "\nCategoria: " + livrobiblioteca.getCategoria() +
                "\nPrazo: " + livrobiblioteca.getPrazoEntrega() +
                "\nNome de Quem Emprestou: " + livrobiblioteca.getNomeQuemEmprestou();

        System.out.println("\nLivro de Biblioteca: " + mensagem);

        /* Livro de Livraria */
        System.out.println("\nLivro de Livraria");
        LivroDeLivraria livrolivraria = new LivroDeLivraria();
        livrolivraria.setCodigo(21);
        livrolivraria.setTitulo("Patinho Feio");
        livrolivraria.setAutor("Ciclano");
        livrolivraria.setEditora("Editora 123");
        livrolivraria.setNmrPaginas(10);
        livrolivraria.setEdicao(8);
        livrolivraria.setPreco(10.99);
        livrolivraria.setNovoUsado(false);
        livrolivraria.setLocalPrateleira("Prateleira 123");
        livrolivraria.setCategoria("Intantil");

        livrolivraria.Ler();
        livrolivraria.Cadastrar();
        livrolivraria.Localizar();
        livrolivraria.Vender();

        mensagem = "\nCodigo: " + livrolivraria.getCodigo() +
                "\nTitulo: " + livrolivraria.getTitulo() +
                "\nAutor: " + livrolivraria.getAutor() +
                "\nEditora: " + livrolivraria.getEditora() +
                "\nNumero de Páginas: " + livrolivraria.getNmrPaginas() +
                "\nEdicao: " + livrolivraria.getEdicao() +
                "\nLocal: " + livrolivraria.getLocalPrateleira() +
                "\nCategoria: " + livrolivraria.getCategoria() +
                "\nEh novo?: " + livrolivraria.getNovoUsado() +
                "\nPreco: R$" + livrolivraria.getPreco();

        System.out.println("\nLivro de Livraria: " + mensagem);

        // metodo construtor com parâmetros
        Livros livro2 = new Livros(99, "titanic");
        System.out.println("\nLivro 2: " + livro2.getTitulo());

        // metodo construtor com todos os parâmetros
        Livros livro3 = new Livros(1, "A pequena sereia", "Ciclano de Tal", "Dark Side", 500, 1);

        LivroDeBiblioteca livroBiblioteca2 = new LivroDeBiblioteca(3, "BTK", "Roy Wenzl", "Dark Side", 680, 2, "Andar 2", "biografia", 5,
                "Isadora");
        System.out.println("Codigo: "+livroBiblioteca2.getCodigo()+"\nTitulo: "+livroBiblioteca2.getTitulo()+"\nAutor: "+livroBiblioteca2.getAutor());

    }

}
