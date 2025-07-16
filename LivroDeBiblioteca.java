public class LivroDeBiblioteca extends Livros { //extends indica que LivroDeBiblioteca herda as caracteristicas de Livros
    //Atributos
    public String localPrateleira;
    public String categoria;
    public int prazoEntrega;
    public String nomeQuemEmprestou;

    public void Alugar(){
        System.out.println("Estou alugando...");
    }

    public void Devolver(){
        System.out.println("Estou devolvendo...");
    }
}
