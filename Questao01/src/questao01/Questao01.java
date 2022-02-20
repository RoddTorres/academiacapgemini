package questao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Rodrigo Torres de Souza 
 * Academia Capgemini
 */
public class Questao01 {

    /**
    * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando 
    * o caractere * e espaços. A base e altura da escada devem ser iguais ao 
    * valor de n. A última linha não deve conter nenhum espaço.
    */
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        List<String> degraus = new ArrayList<>();
        System.out.print("Número de degraus que a seguinte escada terá? ");
        int numDegraus = sc.nextInt();

        for (int i = 0; i < numDegraus; i++) {
            degraus.add(" ".repeat(numDegraus - i) + "*".repeat(i + 1));
        }

        for (String d : degraus) {
            System.out.println(d);
        }
        
        sc.close();
    }

}
