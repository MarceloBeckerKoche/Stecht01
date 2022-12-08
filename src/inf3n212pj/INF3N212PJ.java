/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;
//area de import que equivale ao inclua do portugol

import java.util.Scanner;

/**
 *
 * @author 180504052
 */
public class INF3N212PJ {//equivale ao programa portugol

    
//equivale a area de declaracao de variavel global
    public static void main(String[] args) {//equivale a funcao inicial no portugol   
        //TODO  code
        //equivale a area de declaracao de variavel local
        Scanner leia=new Scanner(System.in);//equivale ao leia do portugol
        float nota1,nota2,nota3,nota4,media;
        System.out.println ("--Notas Escolares--");//equivale ao escreva do portugol
        System.out.print("informe a 1 nota:");
        nota1=leia.nextFloat();
        System.out.print("informe a 2 nota:");
        nota2=leia.nextFloat();
        System.out.print("informe a 3 nota:");
        nota3=leia.nextFloat();
        System.out.print("informe 4 nota:");
        nota4=leia.nextFloat();
        media=(nota1+nota2+nota3+nota4)/4;
        System.out.println("Sua media foi de :"+ media);
        System.out.printf ("Sua media foi de:%2f",media);
        

        
        
    }
}