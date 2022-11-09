package projetosjava02;
import java.util.Scanner;
public class Projeto03 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de notas a serem digitadas:");
        int qtd = scan.nextInt();
        float nota[] = new float[qtd];
        for (int i = 0; i < nota.length; i++) {
            System.out.println("Digite a nota do aluno " + (i+1));
            nota[i] = scan.nextFloat();
        }
        for (int i = 0; i < nota.length; i++)
            System.out.println("Nota do aluno " + (i+1) + " foi " + nota[i]);
    }
}