package mago.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * With JUnit4 just @Test annotation is needed and class name MUST end with "Test"
 */

public class Calculadora_JUnit4Test{

    private Calculadora calculadora = new Calculadora();

    /**
     * Test case: Sumar
     */
    @Test
    public void test_sumar() {
        assertEquals("Testing SUMAR", 9, this.calculadora.sumar(5, 4));
    }

    /**
     * Test case: Restar
     */
    @Test
    public void test_restar() {
        assertEquals("Testing RESTAR", 4, this.calculadora.restar(8, 4));
    }

    /**
     * Test case: Multiplicar
     */
    @Test
    public void test_multiplicar() {
        assertEquals("Testing MULTIPLICAR", 28, this.calculadora.multiplicar(14, 2));
    }

    /**
     * Test case: Dividir
     */
    @Test
    public void test_dividir() {
        assertEquals("Testing DIVIDIR", 3, this.calculadora.divisionEntera(18, 6));
    }

    /**
     * Test case: Dividision (restpo
     */
    @Test
    public void test_restoDivision() {
        assertEquals("Testing DIVIDIR (rest)", 1, this.calculadora.restoDivisionEntera(17, 4));
    }


}
