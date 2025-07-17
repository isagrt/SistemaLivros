public class Livros {
    // Atributos
    protected int codigo;
    private String titulo;
    private String autor;
    private String editora;
    private int nmrPaginas;
    private int edicao;

    // metodos

    //metodo construtor >> não é necessario, pois o programa ja entende que o metodo construtor é este. Mas serve para construir seus obejto com valores default.
    Livros(){
        this.codigo = 0;
        this.titulo = "Nenhum titulo";
        this.autor = " ";
        this.editora = " ";
        this.nmrPaginas = 0;
        this.edicao = 0;
    }

    // Codigo
    public int getCodigo() {
        /*
         * if (usuario == true){
         * return codigo
         * }
         * else {return 0} // utilizaria para autenticar um usuário, por exeplo, se ele
         * tiver um cadasto etc
         */
        return codigo;
    }

    public void setCodigo(int valor) {
        codigo = valor; // this.codigo = codigo; >> uma boa pratica para quando a variável tem o mesmo
                        // nome que a classe.
    }

    // titulo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // autor
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // editora
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    // numero de paginas
    public int getNmrPaginas() {
        return nmrPaginas;
    }

    public void setNmrPaginas(int nmrPaginas) {
        this.nmrPaginas = nmrPaginas;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public void Ler() {
        System.out.println("Estou lendo...");
    }

    public void Cadastrar() {
        System.out.println("Estou cadastrando...");
    }

    public void Localizar() {
        System.out.println("Estou procurando...");
    }
}
