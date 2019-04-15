package mago.examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * With Jupiter just @Test annotation is needed and class name MUST end with "Test"
 */

class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    /**
     * Test case: Sumar
     */
    @Test
    public void test_sumar() {
    	assertEquals(9, this.calculadora.sumar(5, 4), "Testing SUMAR");
    }

    /**
     * Test case: Restar
     */
    @Test
    public void test_restar() {
    	assertEquals(4, this.calculadora.restar(8, 4), "Testing RESTAR");
    }

    /**
     * Test case: Multiplicar
     */
    @Test
    public void test_multiplicar() {
    	assertEquals(28, this.calculadora.multiplicar(14, 2), "Testing MULTIPLICAR");
    }

    /**
     * Test case: Dividir
     */
    @Test
    public void test_dividir() {
    	assertEquals(3, this.calculadora.divisionEntera(18, 6), "Testing DIVIDIR");
    }

    /**
     * Test case: Dividision (restpo
     */
    @Test
    public void test_restoDivision() {
    	assertEquals(1, this.calculadora.restoDivisionEntera(17, 4), "Testing DIVIDIR (rest)");
    }


}
