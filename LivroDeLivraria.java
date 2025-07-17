public class LivroDeLivraria extends Livros{
    private Double preco;
    private boolean novoUsado;
    private String localPrateleira;
    private String categoria;

    public Double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public boolean getNovoUsado(){
        return novoUsado;
    }
    public void setNovoUsado(boolean novoUsado){
        this.novoUsado = novoUsado;
    }
    public String getLocalPrateleira(){
        return localPrateleira;
    }
    public void setLocalPrateleira(String localPrateleira){
        this.localPrateleira = localPrateleira;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public void Vender(){
        System.out.println("Estou vendendo...");
    }
}
