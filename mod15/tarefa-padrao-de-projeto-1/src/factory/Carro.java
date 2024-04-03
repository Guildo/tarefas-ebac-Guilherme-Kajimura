package factory;

public abstract class Carro {

    private final int cavalos;
    private final String combustivel;
    private final String cor;

    public Carro(int cavalos, String combustivel, String cor) {
        this.cavalos = cavalos;
        this.combustivel = combustivel;
        this.cor = cor;
    }

    public void ligarMotor(){
        System.out.println("O motor a " + combustivel + " foi ligado, e está pronto para usar seus " + cavalos + " cavalos.\n" );
    }
    public void limpar(){
        System.out.println("O automovel modelo " + getClass().getSimpleName() + " foi lavado, e a cor " + cor.toLowerCase() + " está brilhando");
    }
    public void revisaoMecanico(){
        System.out.println("O automovel modelo " + getClass().getSimpleName() + " passou pela revisão do mecânico.");
    }
    public void abastecer(){
        System.out.println("O automovel modelo " + getClass().getSimpleName() + " está sendo abastecido com " + combustivel.toLowerCase());
    }
}
