import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nomes nomes = new Nomes();
        Scanner s = new Scanner(System.in);

        System.out.println("Digite nomes e sexo separados por vírgula(,)");
        System.out.println("Exemplo: Guilherme-M,Tamires-F,...");

        String listaNomes = s.next();

        List<String> listaDeNomes = new ArrayList<>(List.of(listaNomes.split(",")));

        System.out.println(nomes.separarNomesFemininos(listaDeNomes));
    }
}