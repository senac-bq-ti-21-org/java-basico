// Escreva um programa que imprima números de 2 em 2 de 1 até 100.

package projetosjava03;
public class Dois_em_dois {
    public static void main(String args[]) {
        System.out.println("Ordem crescente (de 2 em 2):");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " ");
            i++;
        }
    }
}