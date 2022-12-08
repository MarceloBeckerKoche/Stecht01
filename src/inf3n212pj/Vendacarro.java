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
public class Vendacarro {
    /** Enunciado
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Todo code application  logic here
    Scanner leia=new Scanner (System.in);
    float custoFabrica,valorDistribuidor,imposto,valorConsumidor;
    System.out.println ("Sistema de venda veicular");
    System.out.println ("Informe o custoFabrica");
    custoFabrica=leia.nextFloat();
    valorDistribuidor =custoFabrica*0.28f;
    imposto=custoFabrica*0.45f;
    valorConsumidor=custoFabrica+valorDistribuidor+imposto;
    System.out.printf("ValorConsumidor:%2f\n",valorConsumidor); 
        
        
    }
    
}
