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
            System.out.println("Codigo do Livro: " +livro.getCodigo());
            System.out.println("Titulo: "+livro.getTitulo());
            System.out.println("Autor: "+livro.getAutor());
            System.out.println("Editora: "+livro.getEditora());
            
            /*Livro de Biblioteca */
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
            livrobiblioteca.setPrazoEntrega(10);;
            livrobiblioteca.setNomeQuemEmprestou("Isadora Goedert");

        
            livrobiblioteca.Ler();
            livrobiblioteca.Cadastrar();
            livrobiblioteca.Localizar();
            livrobiblioteca.Alugar();
            livrobiblioteca.Devolver();
            System.out.println("Codigo do Livro Biblioteca: " +livrobiblioteca.getCodigo());
            System.out.println("Titulo: "+livrobiblioteca.getTitulo());
            System.out.println("Autor: "+livrobiblioteca.getAutor());
            System.out.println("Editora: "+livrobiblioteca.getEditora());
            System.out.println("Local da Prateleira: "+livrobiblioteca.getLocalPrateleira());
            System.out.println("Categoria: "+livrobiblioteca.getCategoria());
            System.out.println("Prazo de entrega: "+livrobiblioteca.getPrazoEntrega());
            System.out.println("Nome de quem emprestou: "+livrobiblioteca.getNomeQuemEmprestou());

            /*Livro de Livraria */
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
            
            
            System.out.println("Codigo do Livro Livraria: " +livrolivraria.getCodigo());
            System.out.println("Codigo do Livro: " +livrolivraria.getCodigo());
            System.out.println("Titulo: "+livrolivraria.getTitulo());
            System.out.println("Autor: "+livrolivraria.getAutor());
            System.out.println("Editora: "+livrolivraria.getEditora());
            System.out.println("Preço: "+livrolivraria.getPreco());
            System.out.println("Qualidade: "+livrolivraria.getNovoUsado());
            System.out.println("Local da Prateleira: "+livrolivraria.getLocalPrateleira());
            System.out.println("Categoria: "+livrolivraria.getCategoria());
            
        }


}
