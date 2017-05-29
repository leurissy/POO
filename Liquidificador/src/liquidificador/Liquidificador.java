package liquidificador;
/**
 *
 * @author Larissa
 */
public class Liquidificador {

    int velocidade; 

    public Liquidificador(int velocidade) {
        this.velocidade = velocidade;
    }

    
    public void aumentarVelocidade(){
        if(velocidade ==0){
            velocidade = 1;
        }else{
            velocidade = 2;
        }
    }
    
    public void diminuirVelocidade(){
        if(velocidade ==2){
            velocidade = 1;
        }else{
            velocidade = 0;
        }
    }
    
    public int obterVelocidade(){
        return velocidade;
    }
}
