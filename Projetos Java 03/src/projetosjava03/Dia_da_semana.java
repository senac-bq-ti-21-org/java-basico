// Escreva um programa que leia um número inteiro de 1 a 7 e informe o dia da semana correspondente,
// sendo domingo o dia de número 1. Se o número não corresponder a um dia da semana, mostre uma mensagem de erro.

package projetosjava03;
import java.util.Scanner;
public class Dia_da_semana {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Informe o número do dia da semana.");
        int num = scan.nextInt();
        switch (num) {
            case 1 -> System.out.println("Domingo.");
            case 2 -> System.out.println("Segunda.");
            case 3 -> System.out.println("Terça.");
            case 4 -> System.out.println("Quarta.");
            case 5 -> System.out.println("Quinta.");
            case 6 -> System.out.println("Sexta.");
            case 7 -> System.out.println("Sábado.");
            default -> System.out.println("Dia inválido.");
        }
    }
}