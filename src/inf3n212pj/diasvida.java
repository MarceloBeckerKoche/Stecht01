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
public class diasvida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner (System.in);
        int idade,diasvida;
        System.out.println ("calculo de dias de vida");
        System.out.print("Digite sua idade:");
        idade=leia.nextInt();
        diasvida=idade*365;
        System.out.println ("voce ja viveu"+diasvida+"dias de vida aproximadamente");
        
        LocalDate dtNasc, dtAtual=LocalDate.now();
        Dateformat df = new;
    }

  
