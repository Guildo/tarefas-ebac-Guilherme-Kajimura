import java.util.Scanner;
import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira a 1ª nota: ");
        int nota1 = ler.nextInt();

        System.out.print("Insira a 2ª nota: ");
        int nota2 = ler.nextInt();

        System.out.print("Insira a 3ª nota: ");
        int nota3 = ler.nextInt();

        System.out.print("Insira a 4ª nota: ");
        int nota4 = ler.nextInt();

        double media = (double) (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println(STR."Media: \{media}");

        if (media >= 7) {
            System.out.println("Status: APROVADO");
        } else if (media >= 5) {
            System.out.println("Status: RECUPERAÇÃO");
        } else {
            System.out.println("Status: REPROVADO");
        }
    }
}