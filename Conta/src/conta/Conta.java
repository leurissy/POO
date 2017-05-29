package conta;

/**
 *
 * @author Larissa
 */
public class Conta {

    public int numConta;
    protected boolean tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public Conta(int numConta, boolean tipo, String dono, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }
    
    public boolean isTipo() {
        return tipo;
    }
    
    public void abrirConta(){
        status = true;
        if(tipo==true){
            saldo = saldo + 50;
        }else{
            saldo = saldo + 150;
        }
        System.out.println("Conta aberta com sucesso! \nO saldo atual eh:"+saldo);
    }
    
    public void sacar(double valor){
        if(status == true){
            if(saldo>=0 && (saldo-valor)>=0){
                saldo = saldo - valor;
                System.out.println("Saque efetuado com sucesso! \nO saldo atual eh:"+saldo);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Por favor abra sua conta primeiramente!");
        }
    }
    
    public void depositar(double valor){
        if(status == true){
            saldo = saldo + valor;
            System.out.println("Deposito efetuado com sucesso! \nO saldo atual eh:"+saldo);
        }else{
            System.out.println("Por favor abra sua conta primeiramente!");
        }
    }
    
    public void fecharConta(){
        if(saldo>0){
            System.out.println("Conta tem dinheiro \nPor favor saque o valor "+saldo+" reais para encerrar conta \n");
        }else if(saldo<0){
            System.out.println("Não é possivel encerrar conta, conta em debito\nPor favor deposite "+saldo*-1+" reais para encerrar conta");
        }else{
            status = false;
            System.out.println("Conta fechada com sucesso! \n");
        }
    }
    
    public void pagarMensal(){
        if(tipo == true){
            saldo = saldo - 12;
            System.out.println("Pagamento da mensalidade efetuado com sucesso! \nO saldo atual eh:"+saldo);
        }else{
            saldo = saldo - 8;
            System.out.println("Pagamento da mensalidade efetuado com sucesso! \nO saldo atual eh:"+saldo);
        }
    }   
}
