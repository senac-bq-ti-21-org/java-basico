/*
Crie um programa que informe o tamanho de uma palavra digitada pelo usuário.
*/

package projetosjava06;
import java.util.Scanner;
public class Numero_de_letras {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Escreva uma palavra: ");
        String palavra = scan.nextLine();
        System.out.println("Quantidade de letras: " + palavra.length());
    }
}
