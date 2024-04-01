import java.util.*;

public class Main {
    public static void main(String[] args) {
        ListaNomesSexo();
    }

    public static void ListaNomesSexo() {
        Scanner s = new Scanner(System.in);
        Map<Character, List<String>> nomesDivididos = new HashMap<>();

        System.out.println("Digite nomes e sexo separados por vírgula(,)");
        System.out.println("Exemplo: Guilherme-M,Tamires-F,...");

        String nomes = s.next();

        List<String> listaDeNomes = new ArrayList<>(List.of(nomes.split(",")));

        List<String> listaMasculina = criarListaMasculina(listaDeNomes);
        List<String> listaFeminina = criarListaFeminina(listaDeNomes);

        nomesDivididos.put('M', listaMasculina);
        nomesDivididos.put('F', listaFeminina);

        imprimirNomes(nomesDivididos);
    }

    public static List<String> criarListaMasculina(List<String> listaCompleta) {
        List<String> listaMasculina = new ArrayList<>();
        for (String nomeSexo: listaCompleta) {
            if (nomeSexo.contains("-M")) {
                listaMasculina.add(nomeSexo);
            }
        }

        return listaMasculina;
    }

    public static List<String> criarListaFeminina(List<String> listaCompleta) {
        List<String> listaFeminina = new ArrayList<>();
        for (String nomeSexo: listaCompleta) {
            if (nomeSexo.contains("-F")) {
                listaFeminina.add(nomeSexo);
            }
        }

        return listaFeminina;
    }

    private static void imprimirNomes(Map<Character, List<String>> nomesDivididos) {
        System.out.println("Nomes masculinos:");
        nomesDivididos.get('M').forEach(System.out::println);
        System.out.println();
        System.out.println("Nomes femininos:");
        nomesDivididos.get('F').forEach(System.out::println);
    }
}