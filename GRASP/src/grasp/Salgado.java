package grasp;

public class Salgado extends Produto {
    
    private String recheio;
    
    public Salgado(String nome, float preco, String recheio) {
        super(nome, preco);
        this.recheio = recheio;
    }
    
    @Override
    public String getExtra() {
        return recheio;
    }
    
}
