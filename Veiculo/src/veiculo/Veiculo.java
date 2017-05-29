package veiculo;

/**
 *
 * @author Larissa
 */
public class Veiculo {

    private String marca;
    private String placa;

    public Veiculo(String marca, String placa, double velocidade, int marcha) {
        this.marca = marca;
        this.placa = placa;
        this.velocidade = velocidade;
        this.marcha = marcha;
    }
    private double velocidade;
    private int marcha;

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
  
}
