package empregado;

/**
 *
 * @author Larissa
 */
public class Empregado {

    private String nome;
    private double salario;
    private int ano;
    
    public Empregado(String nome, double salario, int ano) {
        this.nome = nome;
        this.salario = salario;
        this.ano = ano;
    }
    
    public String getNome(){
       return nome; 
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void aumentarSalario(double aumento){
        salario = salario + aumento;
    }
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void mostrarDados(){
        System.out.println("Nome: "+nome+"\nSalario: "+salario+"\nAno: "+ano);
    }
}
