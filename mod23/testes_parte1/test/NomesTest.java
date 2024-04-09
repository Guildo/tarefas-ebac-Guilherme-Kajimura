import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NomesTest {

    @Test
    public void testeListaNomesFemininos() {
        Nomes nomes = new Nomes();

        List<String> listaDeNomes = new ArrayList<>(List.of("Gui-M,Tata-F,Gigi-M,Lika-F,Shimura-M,Naty-F".split(",")));

        ArrayList<String> nomesFemininos = nomes.separarNomesFemininos(listaDeNomes);

        Assert.assertEquals(0, nomesFemininos.stream().filter(nome -> nome.contains("-M")).count());
    }
}
