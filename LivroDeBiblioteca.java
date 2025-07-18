public class LivroDeBiblioteca extends Livros { // extends indica que LivroDeBiblioteca herda as caracteristicas de
                                                // Livros
    // Atributos
    private String localPrateleira;
    private String categoria;
    private int prazoEntrega;
    private String nomeQuemEmprestou;

    LivroDeBiblioteca(){
    // metodo construtor FILHO    
    }
    // metodo construtor FILHO com parâmetros
    LivroDeBiblioteca(int codigo, String titulo, String autor, String editora, int nmrPaginas, int edicao,
            String localPrateliera, String categoria, int prazoEntrega, String nomeQuemEmprestou) {
        super(codigo, titulo, autor, editora, nmrPaginas, edicao); // acesso ao metodo construtor PAI (livros)
        this.localPrateleira = localPrateliera;
        this.categoria = categoria;
        this.prazoEntrega = prazoEntrega;
        this.nomeQuemEmprestou = nomeQuemEmprestou;
    }

    public String getLocalPrateleira() {
        return localPrateleira;
    }

    public void setLocalPrateleira(String localPrateleira) {
        this.localPrateleira = localPrateleira;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(int prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public String getNomeQuemEmprestou() {
        return nomeQuemEmprestou;
    }

    public void setNomeQuemEmprestou(String nomeQuemEmprestou) {
        this.nomeQuemEmprestou = nomeQuemEmprestou;
    }

    public void Alugar() {
        System.out.println("Estou alugando...");
    }

    public void Devolver() {
        System.out.println("Estou devolvendo...");
    }
    @Override //altera o metodo da classe pai (polimorfismo)
    public void Localizar() {
        System.out.println("Estou procurando um livro da biblioteca...");
    }
}
