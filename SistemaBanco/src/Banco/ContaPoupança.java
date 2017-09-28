package Banco;

/**
 *
 * @author Larissa
 */
public class ContaPoupança extends Conta{
    
    public ContaPoupança(int Conta, String Correntista) {
        super(Conta, Correntista);
    }
      
    public void Sacar(double valor){
        if(valor>Saldo){
            System.out.println("Saldo insuficiente");
        }else{
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo:"+getSaldo());
        }
    }
    
}
