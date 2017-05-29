package aulaexcecao;

public class AulaExcecao {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 0;
        int array[] = new int[10];
        
        try{
            
            //array[-1] = 10;
            //float r = a/b;
            try{
                 float r = MyException.dividir(a,b);
                 System.out.println(r);
            }catch (MyException e){
                 System.out.println(e.getMessage()); 
            }
            
        }catch (ArithmeticException e){
            
            System.err.println("Não é possível dividir por zero!");
        }catch (IndexOutOfBoundsException e ){
        
            System.out.println("Não é possível acessar a posição desejada.");    
        } finally{
            
            System.out.println("Bloco finalizando,sempre será executado!");
        }
    }
    
}
