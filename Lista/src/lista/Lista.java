package lista;
import java.util.ArrayList;
public class Lista {
    public static void main(String args[]) {
        String aula1 = "Modelando a classe Aula", aula2 = "Conhecendo mais de listas", aula3 = "Trabalhando com Cursos e Sets";
        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1); // ADICIONANDO STRING AULA 1 AO ARRAY
        aulas.add(aula2); // ADICIONANDO STRING AULA 2 AO ARRAY
        aulas.add(aula3); // ADICIONANDO STRING AULA 3 AO ARRAY        
        System.out.println(aulas);
        aulas.remove(0); // REMOVENDO POSIÇÃO 0 DO ARRAY
        System.out.println(aulas);
        for (String receber : aulas) // IMPRIMIR ARRAY ATRÁVES DO FOR
            System.out.println("Aula: " + receber);
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);
        /*
        Você pode usar esse mesmo método para percorrer a lista toda, Para isso,
        precisamos saber quantos elementos temos nessa lista.
        Nesse caso, utilizamos o método size para limitar o nosso for:
        */
        for (int i = 0; i < aulas.size(); i++)
            System.out.println("Aula : " + aulas.get(i));
    }
}
