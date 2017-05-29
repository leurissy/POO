package veiculo;

/**
 *
 * @author Larissa
 */
public class Cota {
    
    private double posx;
    private double posy;
    private double altura;

    public Cota(double posx, double posy, double altura) {
        this.posx = posx;
        this.posy = posy;
        this.altura = altura;
    }

    public double getPosx() {
        return posx;
    }

    public double getPosy() {
        return posy;
    }

    public double getAltura() {
        return altura;
    }

    public void setPosx(double posx) {
        this.posx = posx;
    }

    public void setPosy(double posy) {
        this.posy = posy;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
