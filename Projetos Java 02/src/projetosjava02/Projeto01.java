package projetosjava02;
public class Projeto01 {
    public static void main(String args[]) {
        for(int num1 = 1; num1 <= 10; num1++) {
            System.out.println("\nTabuada do " + num1 + ":\n");
            for(int num2 = 1; num2 <= 10; num2++)
                System.out.println(num1 + " × " + num2 + " = " + num1*num2);
        }
    }
}