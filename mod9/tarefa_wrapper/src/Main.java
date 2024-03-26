import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");

        Integer intWrapper = ler.nextInt();

        System.out.println("Valor da variável Wrapper: " + intWrapper);
    }
}