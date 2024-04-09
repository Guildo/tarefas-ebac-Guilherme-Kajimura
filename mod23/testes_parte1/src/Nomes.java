import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Nomes {

    public ArrayList<String> separarNomesFemininos(List<String> listaDeNomes) {
        return listaDeNomes.stream()
                .filter(nome -> nome.contains("-F"))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
