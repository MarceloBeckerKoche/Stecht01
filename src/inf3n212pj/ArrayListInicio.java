/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 180504052
 */
public class ArrayListInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner (System.in);
        ArrayList <String> nomes = new ArrayList <>();
        System.out.println("Array esta vazio"+ nomes.isEmpty());
        System.out.println("quantos registros"+nomes.size());

        nomes.add ("jair");
        System.out.println("Depois de add valor ");
        System.out.println("Array esta vazio ?"+ nomes.isEmpty());
        System.out.println("Quantos registros:" + nomes.size());
        
        System.out.print("Digite um nome:");
        nomes.add(leia.next());
        System.out.println("Depois de add valor");
        System.out.println("Array esta vazio?"+nomes.isEmpty());
        System.out.println("Nomes:" + nomes.toString());
        
        nomes.add(0,"Filispino");
        nomes.add(leia.next());
        System.out.println("Depois de add valor");
        System.out.println("Array esta vazio?"+nomes.isEmpty());
        System.out.println("Nomes:" + nomes.toString());
        
        nomes.add(3,"juvenal");
        System.out.println("Depois de add valor");
        System.out.println("Array esta vazio?"+nomes.isEmpty());
        System.out.println("Nomes:" + nomes.toString());
        
        System.out.println("Index de jair "+ nomes.indexOf(" jair "));
        nomes.remove("jair");
        System.out.println(nomes.toString() + "Nomes:");
        
        nomes.add("Andre");
        nomes.add ("Silvano");
        nomes.add ("Bagre");
        nomes.add ("Godzila");
        
        System.out.println("Depois de add valor");
        System.out.println("Array esta vazio?"+nomes.isEmpty());
        System.out.println("Nomes:" + nomes.toString());
        Collections.sort(nomes);
        System.out.println("Array ordenado");
        System.out.println("Nomes:"+ nomes.toString());
        
        
        
        
        
    }
    
}
