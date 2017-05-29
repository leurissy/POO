package Banco;

/**
 *
 * @author Larissa
 */
public class Conta extends Banco{
    
    int Conta;
    String Correntista;
    double Saldo;

    public Conta(int Conta, String Correntista) {
        this.Conta = Conta;
        this.Correntista = Correntista;
        this.Saldo = 200;
    }

    public void setConta(int Conta) {
        this.Conta = Conta;
    }

    public void setCorrentista(String Correntista) {
        this.Correntista = Correntista;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
    public int getConta() {
        return Conta;
    }

    public String getCorrentista() {
        return Correntista;
    }

    public double getSaldo() {
        return Saldo;
    }

    @Override
    public int getAgencia() {
        return Agencia;
    }

    public void Sacar(double Valor){
        System.out.println("Saque efetuado com sucesso");
        System.out.println("Saldo:"+getSaldo());
    }
    
}
