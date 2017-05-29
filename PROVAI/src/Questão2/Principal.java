/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão2;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Principal {
    
    public static void main(String[] args){
        
        int i;
        
        Militar m[];
        m = new Militar[9];

                    System.out.println("Inseridos Militares Aeronautica\n");
                    MilitarAeronautica MA1 = new MilitarAeronautica(2, 200, 120, "Soldado");
                    MilitarAeronautica MA2 = new MilitarAeronautica(4, 200, 121, "Cabo");
                    MilitarAeronautica MA3 = new MilitarAeronautica(4, 200, 123, "Cabo");
                    m[0] = MA1;
                    m[1] = MA2;
                    m[2] = MA3;

                    System.out.println("Inseridos Militares Marinha\n");
                    MilitarMarinha MM1 = new MilitarMarinha(0,444,"Soldado");
                    MilitarMarinha MM2 = new MilitarMarinha(1,443,"Soldado");
                    MilitarMarinha MM3 = new MilitarMarinha(15,410,"Tenente");

                    m[3] = MM1;
                    m[4] = MM2;
                    m[5] = MM3;

                    System.out.println("Inseridos Militares Exercito\n");
                    MilitarExercito ME1 = new MilitarExercito(1,false,331,"Soldado");
                    MilitarExercito ME2 = new MilitarExercito(1,true,332,"Soldado");
                    MilitarExercito ME3 = new MilitarExercito(3,true,333,"Soldado");

                    m[6] = ME1;
                    m[7] = ME2;
                    m[8] = ME3;

                    System.out.println("Militares :\n");
                    for(i=0; i<9; i++){
                        m[i].imprimirDados();
                    }

                    System.out.println("Militares Aeronautica Progredir\n");
                    for(i=0; i<3; i++){
                        m[i].progredir();
                    }

                    System.out.println("Militares Marinha Progredir\n");
                    for(i=3; i<6; i++){
                        m[i].progredir();
                    }

                    System.out.println("Militares Exercito Progredir\n");
                    for(i=6; i<9; i++){
                        m[i].progredir();
        }

    }
}
