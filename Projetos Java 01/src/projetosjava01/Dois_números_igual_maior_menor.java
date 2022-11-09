// Ler 2 valores e imprimir uma das três mensagens a seguir: "Números iguais" caso os números sejam iguais,
// "Primeiro é maior" caso o primeiro seja maior que o segundo, "Segundo é maior" caso o segundo seja maior que o primeiro.

package projetosjava01;
import java.util.Scanner;
public class Dois_números_igual_maior_menor {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Infoeme 2 números.");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1 > num2)
            System.out.println("O 1° número é maior.");
        if(num1 < num2)
            System.out.println("O 2° número é maior.");
        if(num1 == num2)
            System.out.println("Ambos são número iguais.");
    }
}