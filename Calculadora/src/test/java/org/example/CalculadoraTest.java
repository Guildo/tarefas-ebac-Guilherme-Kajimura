package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class CalculadoraTest {

    final Calculadora calculadora = new Calculadora();

    @Test
    public void testAdicionar() {
        int resultado = calculadora.adicionar(40, 5);

        assertEquals(45, resultado);
    }

    @Test
    public void testSubtrair() {
        int resultado = calculadora.subtrair(40, 5);

        assertEquals(35, resultado);
    }

    @Test
    public void testMultiplicar() {
        int resultado = calculadora.multiplicar(3, 5);

        assertEquals(15, resultado);
    }

    @Test
    public void testDividir_HappyPath() throws InvalidInputException {
        int resultado = calculadora.dividir(40, 5);

        assertEquals(8, resultado);
    }

    @Test
    public void testDividir_SadPath() {
        InvalidInputException exception = assertThrows(InvalidInputException.class, () -> {
            calculadora.dividir(5, 0);
        });

        assertEquals("Não é possível dividir por 0", exception.getMessage());
    }
}
