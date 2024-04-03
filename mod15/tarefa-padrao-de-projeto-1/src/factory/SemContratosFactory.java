package factory;

import factory.modelos.contrato.Corolla;
import factory.modelos.semContrato.Brasilia;

public class SemContratosFactory extends Factory{
    @Override
    Carro recuperarCarro(String notaSolicitada) {
        return switch (notaSolicitada) {
            case "A" -> new Brasilia(60, "Gasolina", "amarelo");
            case "B" -> new Brasilia(56, "álcool", "branco");
            default -> null;
        };
    }
}
