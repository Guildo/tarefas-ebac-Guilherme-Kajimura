import dominio.Automovel;
import dominio.Corolla;
import dominio.Civic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Automovel> automovels = new ArrayList<>();
        automovels.add(new Corolla("Corolla", "Toyota", 100));
        automovels.add(new Civic("Civic", "Honda", 130));
        imprimirCarros(automovels);
    }

    public static void imprimirCarros(List<? extends Automovel> lista) {
        for (Automovel automovel : lista) {
            System.out.println("Modelo: " + automovel.getModelo());
            System.out.println("Marca: " + automovel.getMarca());
            System.out.println("Cavalos: " + automovel.getCavalos() + "\n");
        }
    }
}