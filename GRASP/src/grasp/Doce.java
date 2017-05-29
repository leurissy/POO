package grasp;

public class Doce extends Produto {
    
    private String cobertura;
    
    public Doce(String nome, float preco, String cobertura) {
        super(nome, preco);
        this.cobertura = cobertura;
    }
    
    @Override
    public String getExtra() {
        return cobertura;
    }
    
}
