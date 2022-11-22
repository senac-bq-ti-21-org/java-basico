/*
Realize um programa que deverá receber de vários usuários nome, sexo, idade e deverá informar sua faixa etária seguindo: 

Jovens - Indivíduos de até 19 anos; 
Adultos - Indivíduos com idade entre 20 até 59 anos; 
Idosos - Indivíduos de 60 anos em diante. 

No final sairá "Fulano você pertence a faixa etária de: " 
*/

package projetosjava05;
import java.util.Scanner;
public class Idade {
    void clean() {
        for(int i = 0; i < 100; i++)
            System.out.println();
    }
    public static void main(String args[]) {
        Idade console = new Idade();
        Scanner scan = new Scanner(System.in);
        console.clean();
        while (true) {
            System.out.print("Escreva seu nome: ");
            String nome = scan.nextLine();
            System.out.print("Escreva seu sexo: ");
            char sexo = scan.next().charAt(0);
            System.out.print("Escreva sua idade: ");
            int idade = scan.nextInt();
            System.out.print(nome + " pertence a faixa etária de: ");
            if(idade <= 19)
                System.out.println("Jovem \n");
            if(idade >= 20 && idade <= 59)
                System.out.println("Adulto \n");
            if(idade >= 60)
                System.out.println("Idoso \n");
            scan.nextLine();
        }
    }
}
