// Escreva um programa que imprima todos os números inteiros de 100 a 1 (em ordem decrescente). E informe a soma deles.

package projetosjava03;
public class Decresente_e_soma {
    public static void main(String args[]) {
        System.out.println("Ordem decrescente (100 a 0):");
        int x = 0;
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
            x = i + x;
        }
        System.out.println("\nSoma:\n" + x + " ");
    }
}