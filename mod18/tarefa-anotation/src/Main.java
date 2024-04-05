public class Main {
    public static void main(String[] args) {
        testeAnotacao();
    }

    @Tabela(value = "Tabela de teste")
    public static void testeAnotacao() {
        System.out.println("Testando anotação");
    }
}