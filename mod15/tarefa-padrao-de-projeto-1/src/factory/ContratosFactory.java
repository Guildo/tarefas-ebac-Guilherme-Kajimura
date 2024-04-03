package factory;


import factory.modelos.contrato.Corolla;

public class ContratosFactory extends Factory {
    @Override
    Carro recuperarCarro(String notaSolicitada) {
        return switch (notaSolicitada) {
            case "A" -> new Corolla(200, "gasolina", "branco");
            case "B" -> new Corolla(133, "álcool", "cinza");
            default -> null;
        };
    }
}
