/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.Scanner;

/**
 *
 * @author 180504052
 */
public class notasescolaresvetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        float notas[] = new float[5];
        System.out.println("Notas Escolares");
        for (int i = 0; i < 4; i++) {//para do portugol
            //laco "do" para garantir que a nota esteja entre 0 e 10
            do {//faca enquanto do portugol
                System.out.print("Digite a " + (i + 1) + " nota:");
                notas[1] = leiaFloat();
                if (validaNota(notas[i])){//"||" pipe é or "&&" é and
                    System.out.println("Nota invalida");
                }
            } while(validaNota(notas[i]));
            notas[4] += notas[i];
        }//fim do for

        notas[4] = notas[4] / 4;
        System.out.print(
                "Sua media foi de" + notas[4]);
        if (notas[4] >= 7) {
            System.out.println(", parabens voce aprovou.");
        } else {
            System.out.println(",infelizmente voce nao aprovou.");
        }
    }
    public static boolean validaNota(float nota){
        return nota <0|| nota >10;
    }//fim do validaNota
    
    public static float leiaFloat(){
    try{
        Scanner leia = new Scanner(System.in);
    return leia.nextFloat();
    }catch(NumberFormatException e){
     System.out.println("Erro:" +e.getMessage());
     System.out.print("Tente novamente:");
     return leiaFloat();
    }
    }//fim do leiaFloat
    
}
  
