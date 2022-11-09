/*
Uma PulverizaÁ„o de pulverizaÁ„o utiliza avi„o para pulverizar lavouras. Os custos de pulverizaÁ„o dependem do tipo de praga e da ·rea a ser contratada conforme a tabela:

Tipo 1 - ervas daninhas R$ 50,00 por acre;
Tipo 2 - gafanhotos R$ 100,00 por acre;
Tipo 3 - broca R$ 150,00 por acre;
Tipo 4 - todos acima R$ 250,00 por acre.

Se a ·rea a ser pulverizada for superior a 1000 acres, o fazendeiro tem um desconto de 5%.
Em adiÁ„o,qualquer fazendeiro cujo custo for maior do que R$ 750,00 tem um desconto de 10% sobre o valor que ultrapassar os R$ 750,00.
Caso ambos os descontos se aplicam o da ·rea È calculado antes. Fazer um algoritmo que leia: o tipo de pulverizaÁ„o (1 a 4) e ·rea a ser pulverizada, e imprima o valor a ser pago.
*/

package projetosjava03;
import java.util.Scanner;
public class PulverizaÁ„o {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);
        double area, total[] = new double[4];
        int tipo;
        String repetir;
        System.out.print("""
                         Tipos:
                         Tipo 1 - ervas daninhas R$ 50,00 por acre;
                         Tipo 2 - gafanhotos R$ 100,00 por acre;
                         Tipo 3 - broca R$ 150,00 por acre;
                         Tipo 4 - todos acima R$ 250,00 por acre.
                         
                         """);
        do {
            System.out.println("Escolha o tipo:");
            tipo = scan.nextInt();
            if (tipo >= 1 && tipo <= 4) {
                System.out.println("Informe a ·rea:");
                area = scan.nextDouble();
                switch (tipo) {
                    case 1 -> total[1] = 50.0 * area;
                    case 2 -> total[2] = 100.0 * area;
                    case 3 -> total[3] = 150.0 * area;
                    case 4 -> total[4] = 250.0 * area;
                }
                if (area >= 0) {
                    System.out.println("------------------------------------------");
                    System.out.println("Valor do tipo " + tipo + " (SEM desconto): " + total[tipo]);
                    if (area >= 1000) {
                        total[tipo] -= 0.05 * total[tipo];
                    }
                    if (total[tipo] >= 750.0) {
                        total[tipo] -= 0.1 * total[tipo];
                        System.out.println("Valor do tipo " + tipo + " (COM desconto): " + total[tipo]);
                    }
                }
                else
                    System.out.println("\n¡rea invalida.");
            }
            else
                System.out.println("\nTipo invalido.");
            System.out.println("------------------------------------------");
            System.out.println("Repetir? (s/n)");
            repetir = scan.next();
            repetir = repetir.toLowerCase();
            System.out.println("==========================================");
        } while (!"nao".equals(repetir) && !"n".equals(repetir) && !"n„o".equals(repetir));
        for(int i = 1; i < total.length; i++)
            total[0] += total[i];
        System.out.println("Valor TOTAL (COM desconto): " + total[0]);
    }
}