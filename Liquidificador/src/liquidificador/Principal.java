package liquidificador;

/**
 *
 * @author Larissa
 */
public class Principal {
    public static void main (String[] args){
        
        Liquidificador L1 = new Liquidificador(0);
        
        System.out.println("VELOCIDADE: "+L1.obterVelocidade()); 
        L1.aumentarVelocidade();
        System.out.println("VELOCIDADE: "+L1.obterVelocidade()); 
        L1.aumentarVelocidade();
        System.out.println("VELOCIDADE: "+L1.obterVelocidade()); 
        L1.diminuirVelocidade();
        System.out.println("VELOCIDADE: "+L1.obterVelocidade()); 
        L1.diminuirVelocidade();
        System.out.println("VELOCIDADE: "+L1.obterVelocidade()); 
        
        
    }
}
