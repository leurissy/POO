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
public class MilitarAeronautica extends Militar{
    
    int tempoDePatente;
    int horasDeVoo;

    public MilitarAeronautica(int tempoDePatente, int horasDeVoo, int matricula, String patente) {
        super(matricula, patente);
        this.tempoDePatente = tempoDePatente;
        this.horasDeVoo = horasDeVoo;
    }
    
    public void setTempoDePatente(int tempoDePatente) {
        this.tempoDePatente = tempoDePatente;
    }

    public void setHorasDeVoo(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public void progredir(){
        if(tempoDePatente>2 && horasDeVoo>100 && !"Tenente".equals(patente)){                   
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
