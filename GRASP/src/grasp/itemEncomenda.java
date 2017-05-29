package grasp;

public class itemEncomenda {
    
    private Produto item;
    private int quantidade;
    
    public void setSalgado(String nome, float preco, int qty, String recheio) {
        this.item = new Salgado(nome, preco, recheio);
        this.quantidade = qty;
    }
    public void setDoce(String nome, float preco, int qty, String cobertura) {
        this.item = new Doce(nome, preco, cobertura);
        this.quantidade = qty;
    }
    
    public float Subtotal() {
        return this.item.getPreco() * this.quantidade;
    }
    
    public void AlterarPreco(String nome, float novo_preco) {
        this.item.setPreco(novo_preco);
    }
    
    public String getNome() {
        return this.item.getNome();
    }
    
    public String getItemPreco() {
        System.out.print(this.item.getNome() + "\n");
        return String.format("%s - %.2f - x%d", this.item.getNome(), this.item.getPreco(), this.quantidade);
    }
    
}
