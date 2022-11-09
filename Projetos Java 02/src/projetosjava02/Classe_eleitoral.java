// Faça um programa que dada a idade de uma pessoa verifique sua classe eleitoral:
// * menor que 16 anos não pode votar;
// * com 16 ou 17 anos ou mais que 65 anos, votar é facultativo;
// * entre 18 e 65 anos (inclusive), votar é obrigatório.

package projetosjava02;
import java.util.Scanner;
public class Classe_eleitoral {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();
        if(idade < 16)
            System.out.println("Você não pode votar.");
        if(idade == 16 || idade == 17 || idade > 65)
            System.out.println("Votar é facultativo.");
        if(idade >= 18 && idade <= 65)
            System.out.println("Você deve votar.");
    }
}