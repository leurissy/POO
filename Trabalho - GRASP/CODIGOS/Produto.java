package grasp;

public abstract class Produto {
    
    private String nome;
    private float preco;
    
    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;        
    }
    
    public float getPreco() {
        return this.preco;
    }
    
    public void setPreco(float novo_preco) {
        this.preco = novo_preco;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public abstract String getExtra();
    
}
