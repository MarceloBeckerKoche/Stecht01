/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;
import static inf3n212pj.notasescolaresvetor.leiaFloat;
import java.util.Scanner;

/**
 *
 * @author 180504052
 */
public class notasescolarvetormatriz {

    //declaracao global
    static Scanner leia = new Scanner(System.in);
    static String alunos[];
    static float notas[][];
    static int nAlunos, nNotas, contAlunos;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(": Sistema de notas:.");
        System.out.print("Informe o numero de alunos");
        nAlunos = (int) leiaFloat();
        System.out.print("quantas notas de aluno:");
        nNotas = (int) leiaFloat();
        //inicializar vetor e matriz de aluno e notas
        alunos = new String[nAlunos];
        notas = new float[nAlunos][nNotas + 1];
        int opM;
        do {
            menu();
            opM = (int) leiaFloat();
            switch (opM) {//escolha do portugol
                case 1:
                    InserirAlunoNotas();
                    break;
                case 2:
                    ImprimirAlunoNotas();
                    break;
                case 0:
                    System.out.println("Aplicacao encerrada pelo usuario");
                    break;
                default:

                    System.out.println(" Opcao invalida, tente novamente");
                    break;
            }
        } while (opM != 0);

    }

    public static void menu() {

        System.out.println("1-Inserir Alunos e notas");
        System.out.println("2 -imprimir Alunos e notas");
        System.out.println("0- Sair");
        System.out.print("Digite aqui: ");
    }

    public static float leiaFloat() {
        try {
            Scanner leia = new Scanner(System.in);
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "Erro: ");
            System.out.println("Corrija o valor inserido: ");
            return leiaFloat();
        }
    }//fim do leia float

    private static void InserirAlunoNotas() {
        if (contAlunos < nAlunos) {
            System.out.print("Informe nome do aluno");
            alunos[contAlunos] = leia.next();
            for (int i = 0; i < nNotas; i++) {
                System.out.print("Informe a "+(i+1)+"ª nota: ");
                notas[contAlunos][i]=leiaFloat();
                notas[contAlunos][nNotas]+= notas[contAlunos][i];
            }
            notas[contAlunos][nNotas] = notas[contAlunos][nNotas] / nNotas;
            contAlunos++;
        } else {
            System.out.println("N é possivel mais digitar alunos"
                    + "\nNum. maximo de posicoes obtidos.");

        }
    }

    private static void ImprimirAlunoNotas() {
        for (int i = 0; i < contAlunos; i++) {
            System.out.printf(alunos[i]+ "sua media foi %.2f",notas[i][nNotas]);
            if (notas[i][nNotas]>=7){
                System.out.println("\n voce aprovou ");
            }else{
                System.out.println("\n voce nao aprovou ");
                
            }
            
        }
    }
}
