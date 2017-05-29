/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão2;

/**
 *
 * @author aluno
 */
public class MilitarExercito extends Militar{
    
    int guerras;
    boolean vitoria;

    public MilitarExercito(int guerras, boolean vitoria, int matricula, String patente) {
        super(matricula, patente);
        this.guerras = guerras;
        this.vitoria = vitoria;
    }
    
    public void setGuerras(int guerras) {
        this.guerras = guerras;
    }

    public void setVitoria(boolean vitoria) {
        this.vitoria = vitoria;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    @Override
    public void progredir(){
        if(guerras>0 && vitoria==true && !"Tenente".equals(patente)){
            System.out.println("Militar "+matricula+" está habilitado a progredir na carreira!\n");
                if(null != patente)switch (patente) {
                case "Soldado":
                    patente = "Cabo";
                    System.out.println("Militar "+matricula+" subiu de patente!\n");
                    break;
                case "Cabo":
                    patente = "Tenente";
                    System.out.println("Militar "+matricula+" subiu de patente!\n");
                    break;
            }
            imprimirDados();
        }else{
            System.out.println("Militar "+matricula+" não está habilitado a progredir na carreira!\n");
        }
    }
}
