import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaNomes();
        ListaNomesSexo();
    }

    public static void ListaNomes() {

        Scanner s = new Scanner(System.in);
        System.out.print("Digite nomes separados por vírgula(,): ");

        String nomes = s.next();

        List<String> listaDeNomes = new ArrayList<>(List.of(nomes.split(",")));

        Collections.sort(listaDeNomes);

        System.out.println(listaDeNomes);
    }

    public static void ListaNomesSexo() {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite nomes e sexo separados por vírgula(,): ");

        String nomes = s.next();

        List<String> listaDeNomes = new ArrayList<>(List.of(nomes.split(",")));

        List<String> listaMasculina = new ArrayList<>();
        List<String> listaFeminina = new ArrayList<>();

        for (String nomeSexo: listaDeNomes) {
            if (nomeSexo.contains("-M")) {
                listaMasculina.add(nomeSexo);
            } else {
                listaFeminina.add(nomeSexo);
            }
        }

        System.out.println(STR."Lista Masculina: \{listaMasculina}");
        System.out.println(STR."Lista Feminina: \{listaFeminina}");
    }
}