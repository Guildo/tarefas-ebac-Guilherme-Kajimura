import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TabelaCarros tc = new TabelaCarros();
        Tabela tabCar = tc.getClass().getAnnotation(Tabela.class);
        System.out.println(tabCar.value());

        TabelaNomes tn = new TabelaNomes();
        Tabela tabNom = tn.getClass().getAnnotation(Tabela.class);
        System.out.println(tabNom.value());
    }
}