public class Livros {
    //Atributos
    protected int codigo;
    public String titulo;
    public String autor;
    public String editora;
    public int nmrPaginas;
    public int edicao;
    

    //metodos
    public  int getCodigo(){
        /*if (usuario == true){
            return codigo
        }
        else {return 0}  // utilizaria para autenticar um usuário, por exeplo, se ele tiver um cadasto etc */
        return codigo;
    }

    public void setCodigo(int valor){
        codigo = valor;
    }

    public void Ler(){
        System.out.println("Estou lendo...");
    }

    public void Cadastrar(){
        System.out.println("Estou cadastrando...");
    }

    public void Localizar(){
        System.out.println("Estou procurando...");
    }
}
