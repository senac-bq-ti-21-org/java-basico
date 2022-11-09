package matematica.e.string;
public class String_metodos {
    public static void main(String[] args) {
        String casamento, marido = "Kaio", esposa = "Iza ";
        casamento = marido + " & " + esposa;
        System.out.println(casamento);
        System.out.println(casamento.toUpperCase()); // Frase em maiúscula.
        System.out.println(esposa.length()); // Quantidade de letras em esposa.
        System.out.println(marido.charAt(2)); // Caractere da pos. 2 de marido.
        System.out.println(casamento.subSequence(1, 8)); // Subsequencia de 1 a 8.
        System.out.println(esposa.trim()); // Remove os espaços do inicio e fim.
        System.out.println(casamento.replaceAll("Iza", "Patricia")); // Substitui o texto.
    }
}
