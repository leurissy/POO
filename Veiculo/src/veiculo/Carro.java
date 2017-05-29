package veiculo;

/**
 *
 * @author Larissa
 */
public class Carro extends Veiculo{
    private int numPortas;
    private boolean temArCon ;

    public Carro(int numPortas, boolean temArCon, String marca, String placa, double velocidade, int marcha) {
        super(marca, placa, velocidade, marcha);
        this.numPortas = numPortas;
        this.temArCon = temArCon;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void setTemArCon(boolean temArCon) {
        this.temArCon = temArCon;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public boolean isTemArCon() {
        return temArCon;
    }
    
    
}
