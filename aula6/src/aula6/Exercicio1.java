package aula6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class Exercicio1 {

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("banana");
        frutas.add("uva");
        frutas.add("manga");
        frutas.add("goiaba");
        frutas.add("uva"); 
        frutas.add("ameixa");
        
        System.out.println(frutas);
        
        if (frutas.contains("uva")) {
            System.out.println("uva está na lista");
        } else {
            System.out.println("uva não está na lista");
        }
        
        int totalUnicos = elementos_unicos(frutas);
        System.out.println("O número de frutas únicas é: " + totalUnicos);
    }

   
    public static int elementos_unicos(ArrayList<String> lista) {
        return new HashSet<>(lista).size();
      
    }
    ArrayList<String> listaA = new ArrayList<>(Arrays.asList("Maça", "Uva","Pera","Manga"));
    ArrayList<String> listaB = new ArrayList<>(Arrays.asList("Laranja", "Uva","Manga","Limão"));
    
}