/*
Realize uma pesquisa e faça um programa que receba um numero e eleve ao numero desejado pelo usuário.
*/

package projetosjava06;
import java.util.Scanner;
public class Potencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Base:      ");
        double base = scan.nextDouble();
        System.out.print("Expoente:  ");
        double expoente = scan.nextDouble();
        System.out.println("====================\n" + Math.pow(base, expoente));
    }
}
