/*
Realize um programa que receba informações de vários usuários e informe seus IMC bem como sua classificação. Seguindo: 

O IMC é calculado dividindo o peso pela altura elevada ao quadrado. Ou seja, de forma mais simples, você multiplica sua altura por ela mesma e depois divide seu peso pelo resultado da última conta.  
*/

package projetosjava05;
import java.util.Scanner;
public class IMC {
    void clean() {
        for(int i = 0; i < 100; i++)
            System.out.println();
    }
    public static void main(String args[]) {
        Idade console = new Idade();
        Scanner scan = new Scanner(System.in);
        console.clean();
        String nome;
        float peso, altura, imc;
        System.out.print("\nEscreva o número de pessoas: ");
        int num = scan.nextInt();
        for(int i = 0; i < num; i++) {
            scan.nextLine();
            System.out.print("\nEscreva seu nome: ");
            nome = scan.nextLine();
            System.out.print("Escreva seu peso: ");
            peso = scan.nextFloat();
            System.out.print("Escreva sua altura: ");
            altura = scan.nextFloat();
            imc = peso / (altura * altura);
            System.out.println(nome + " tem um IMC de: " + imc);
            if(imc < 18.5)
                System.out.println("E classificado como abixo do normal.");
            if(imc >= 18.5 && imc < 25)
                System.out.println("E classificado como normal.");
            if(imc >= 25 && imc < 30)
                System.out.println("E classificado como excesso.");
            if(imc >= 30 && imc < 35)
                System.out.println("E classificado como obesidade nivel I.");
            if(imc >= 35 && imc < 40)
                System.out.println("E classificado como obesidade nivel II.");
            if(imc >= 40)
                System.out.println("E classificado como obesidade nivel III.");
        }
    }
}
