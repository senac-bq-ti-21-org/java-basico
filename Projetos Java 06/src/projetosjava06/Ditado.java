/*
Programa que altere a string:
"De grão em grão, a vaca enche o papo"

1.Vaca para galinha;
2.Informar o caractere da 6 posição;
3.Informar o tamanho da frase;
4.Mostrar a substring 4 a 8.
*/

package projetosjava06;
public class Ditado {
    public static void main(String[] args) {
        String frase = "De grão em grão, a vaca enche o papo";
        System.out.println(frase.replaceAll("vaca", "galinha"));
        System.out.println(frase.charAt(5));
        System.out.println(frase.length());
        System.out.println(frase.subSequence(3, 7));
    }
}
