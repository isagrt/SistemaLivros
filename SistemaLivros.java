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
        }
}
