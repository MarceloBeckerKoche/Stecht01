/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.Scanner;

/**
 *
 * @author 182120036
 */
public class calculoimc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leia = new Scanner(System.in);//equivale ao leia do portugol
        float peso, alt, imc; 
        String classificacao;
        
        System.out.println("CALCULO IMC");//equivale ao escreva do portugol
        System.out.print("Informe o peso: ");
        peso = leia.nextFloat();
        System.out.print("Informe a altura: ");
        alt = leia.nextFloat();
        imc = (peso / alt )/alt;
        System.out.println("IMC: " + imc );
        if(imc <= 18.5){
            classificacao = "Abaixo do peso!";
        }else if(imc <= 24.9){
            classificacao = "Peso ideal!";
        }else if(imc <= 29.9){
            classificacao = "Levemente acima do peso!";
        }else if(imc <= 34.9){
            classificacao = "OBesidade Grau I";
        }else if(imc <= 39.9){
            classificacao = "OBesidade Grau II";
        }else{
            classificacao = "Obesidade Grau III";
        }
        System.out.println("\nSua classificação é: " + classificacao);
    }
    
}

