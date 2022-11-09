/*
Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas:

F = C * 1.8 + 32; 
K = C + 273.15; 
Re = C * 0.8; 
Ra = C * 1.8 + 32 + 459.67.

O PROGRAMA DEVE INFORMAR SOMENTE A CONVERSÃO QUE O USUÁRIO ESCOLHER.
*/

package projetosjava04;
import java.util.Scanner;
public class Temperatura {
    void clean() {
        for(int i = 0; i < 100; i++)
            System.out.println();
    }
    public static void main(String args[]) {
        Temperatura console = new Temperatura();
        Scanner scan = new Scanner(System.in);
        console.clean();
        System.out.print("Digite a temperatura (em °C): ");
        float temp = scan.nextFloat();
        System.out.print("Coverter para (K, Re, Ra, F): ");
        String tipo = scan.next();
        System.out.println();
        switch (tipo) {
            case "k" -> System.out.println("Temperatura em °K: " + temp * 1.8 + 32);
            case "re" -> System.out.println("Temperatura em °Re: " + temp + 273.15);
            case "ra" -> System.out.println("Temperatura em °Ra: " + temp * 0.8);
            case "f" -> System.out.println("Temperatura em °F: " + temp * 1.8 + 32 + 459.67);
            default -> System.out.println("Formato invalido.");
        }
    }
}
