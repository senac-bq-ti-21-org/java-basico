// Escreva um programa que imprima números de 3 em 3 de 1 até 100.

package projetosjava03;
public class Três_em_três {
    public static void main(String args[]) {
        System.out.println("Ordem crescente (de 3 em 3):");
        for (int i = 1; i <= 99; i++) {
            System.out.println(i + " ");
            i++;
            i++;
        }
    }
}