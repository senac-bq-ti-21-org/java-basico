/*
Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:

a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
*/

package projetosjava04;
import java.util.Scanner;
public class Altura {
    void clean() {
        for(int i = 0; i < 100; i++)
            System.out.println();
    }
    public static void main(String args[]) {
        Altura console = new Altura();
        Scanner scan = new Scanner(System.in);
        console.clean();
        String nMaior = "", nMenor = "", nome[] = new String[3];
        char sexo[] = new char[10];
        double aMaior = 0, aMenor = 0, tHomem = 0, altura[] = new double[10];
        int homem = 0, mulher = 0;
        for(int i = 0; i < nome.length ; i++) {
            System.out.print("Nome: ");
            nome[i] = scan.nextLine();
            System.out.print("Sexo (F/M): ");
            sexo[i] = scan.next().charAt(0);
            System.out.print("Altura: ");
            altura[i] = scan.nextDouble();
            scan.nextLine();
            console.clean();
        }
        for(int i = 0; i < nome.length; i++) {
            if(i == 0) {
                aMaior = altura[i];
                aMenor = altura[i];
            }
            if(altura[i] > aMaior) {
                aMaior = altura[i];
                nMaior = nome[i];
            }
            if(altura[i] < aMenor) {
                aMenor = altura[i];
                nMenor = nome[i];
            }
            if(sexo[i] == 'm'){
                homem++;
                tHomem = tHomem + altura[i];
            }
            if(sexo[i] == 'f')
                mulher++;
        }
        System.out.println("Maior altura: " + aMaior + " de " + nMaior);
        System.out.println("Menor altura: " + aMenor + " de " + nMenor);
        System.out.println("Média de homens: " + tHomem / homem);
        System.out.println("Número de mulheres: " + mulher);
    }
}
