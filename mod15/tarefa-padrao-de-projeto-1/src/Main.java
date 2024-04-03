import factory.*;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("B", true);
        Factory factory = getFactory(cliente1);
        Carro carro1 = factory.criar(cliente1.getNotaSolicitada());
        carro1.ligarMotor();

        Cliente cliente2 = new Cliente("A", false);
        factory = getFactory(cliente2);
        Carro carro2 = factory.criar(cliente2.getNotaSolicitada());
        carro2.ligarMotor();
    }

    private static Factory getFactory(Cliente cliente) {
        if (cliente.temContratoEmpresa()) {
            return new ContratosFactory();
        } else {
            return new SemContratosFactory();
        }
    }

}