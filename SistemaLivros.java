public class SistemaLivros {
     public static void main(String[] args) {
           
            Livros livro = new Livros();
            livro.codigo = 1;
            livro.titulo = "Coraline";
            livro.autor = "Fulano";
            livro.editora = "Editora ABC";
            livro.nmrPaginas = 450;
            livro.edicao = 3;

            livro.Ler();
            livro.Cadastrar();
            livro.Localizar();


            /*Livro de Biblioteca */
            System.out.println("\nLivro de Biblioteca");
            LivroDeBiblioteca livrobiblioteca = new LivroDeBiblioteca();
            livrobiblioteca.codigo = 11;
            livrobiblioteca.titulo = "Cinderela";
            livrobiblioteca.autor = "Irmãos Grimm";
            livrobiblioteca.editora = "Editora xYz";
            livrobiblioteca.nmrPaginas = 100;
            livrobiblioteca.edicao = 7;
            livrobiblioteca.localPrateleira ="InfantilABC";
            livrobiblioteca.categoria ="Infantil";
            livrobiblioteca.prazoEntrega =10;
            livrobiblioteca.nomeQuemEmprestou ="Isadora Goedert";
             

        
            livrobiblioteca.Ler();
            livrobiblioteca.Cadastrar();
            livrobiblioteca.Localizar();
            livrobiblioteca.Alugar();
            livrobiblioteca.Devolver();

            /*Livro de Livraria */
            System.out.println("\nLivro de Livraria");
            LivroDeLivraria livrolivraria = new LivroDeLivraria();
            livrolivraria.codigo = 12;
            livrolivraria.titulo = "Patinho Feio";
            livrolivraria.autor = "Ciclano";
            livrolivraria.editora = "Editora 123";
            livrolivraria.nmrPaginas = 10;
            livrolivraria.edicao = 4;
            livrolivraria.preco = 10;
            livrolivraria.novoUsado = "Novo";
            livrolivraria.localPrateleira = "Prateleira 123";
            livrolivraria.categoria = "Intantil";

            livrolivraria.Ler();
            livrolivraria.Cadastrar();
            livrolivraria.Localizar();
            livrolivraria.Vender();
        }


}
