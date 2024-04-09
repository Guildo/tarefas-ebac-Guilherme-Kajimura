import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite nomes e sexo separados por vírgula(,)");
        System.out.println("Exemplo: Guilherme-M,Tamires-F,...");

        String nomes = s.next();

        List<String> listaDeNomes = new ArrayList<>(List.of(nomes.split(",")));

        ArrayList<String> listaFeminina = listaDeNomes.stream()
                .filter(nome -> nome.contains("-F"))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(listaFeminina);
    }
}