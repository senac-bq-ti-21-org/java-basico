// Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.

package projetosjava01;
import java.util.Scanner;
public class Nome_de_2_times {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);
        String time1, time2;
        for(int i = 0; i < 100; i++)
            System.out.println();
        int gol_t1, gol_t2;
        System.out.println("Nome do 1° time:");
        time1 = scan.nextLine();
        System.out.println("Quantidade de gol(s) do 1° time:");
        gol_t1 = scan.nextInt();
        for(int i = 0; i < 100; i++)
            System.out.println();
        System.out.println("Nome do 2° time:");
        scan.nextLine();
        time2 = scan.nextLine();
        System.out.println("Quantidade de gol(s) do 2° time:");
        gol_t2 = scan.nextInt();
        for(int i = 0; i < 100; i++)
            System.out.println();
        if(gol_t1 > gol_t2)
            System.out.println(time1 + " venceu com " + gol_t1 + " gol(s), contra " + time2 + " que marcou " + gol_t2 + " gol(s).");
        if(gol_t1 < gol_t2)
            System.out.println(time2 + " venceu com " + gol_t2 + " gol(s), contra " + time1 + " que marcou " + gol_t1 + " gol(s).");
        if(gol_t1 == gol_t2)
            System.out.println(time1 + " empatou com " + time2 + ", com ambos fazendo " + gol_t1 + " gol(s).");
    }
}