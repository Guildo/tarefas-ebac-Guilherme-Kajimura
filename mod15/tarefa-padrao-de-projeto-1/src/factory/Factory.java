package factory;

public abstract class Factory {

    public Carro criar(String notaSolicitada) {
        Carro carro = recuperarCarro(notaSolicitada);
        carro = prepararCarro(carro);
        return carro;
    }
    private Carro prepararCarro(Carro carro){
        carro.limpar();
        carro.revisaoMecanico();
        carro.abastecer();
        return carro;
    }
    abstract Carro recuperarCarro(String notaSolicitada);
}
