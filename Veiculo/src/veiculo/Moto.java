package veiculo;

/**
 *
 * @author Larissa
 */
public class Moto extends Veiculo{
    
    private String tamanho;

    public Moto(String tamanho, String marca, String placa, double velocidade, int marcha) {
        super(marca, placa, velocidade, marcha);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
}
