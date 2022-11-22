/*
Entrar com um número e verificar se ele é um número primo.
*/

package projetosjava04;
import java.util.Scanner;
public class Primo {
    void clean() {
        for(int i = 0; i < 100; i++)
            System.out.println();
    }
    public static void main(String args[]) {
        Primo console = new Primo();
        Scanner scan = new Scanner(System.in);
        int num, divisivel = 2;
        boolean primo = true;
        console.clean();
        System.out.print("Digite um número: ");
        num = scan.nextInt();
        for (var i = 2; i < num; i++) {
            if (num % i == 0) {
                divisivel++;
                primo = false;
            }
        }
        for (var i = -2; i > num; i--) {
            if (num % i == 0) {
                divisivel++;
                primo = false;
            }
        }
        if (primo == true && num != 1 && num != 0) {
            System.out.println("O número é primo.");
        }
        else {
            if(num != 0 && num != 1)
                System.out.println("O número não é primo, sendo divisivel por " + divisivel + " números:");
            else
                System.out.println("O número não é primo, sendo divisivel por " + num + " números sendo eles:");
            for (var i = 1; i <= num; i++)
                if (num % i == 0)
                    System.out.println("Divisivel por: " + i);
            for (var i = -1; i >= num; i--)
                if (num % i == 0)
                    System.out.println("Divisivel por: " + i);
        }
    }
}
