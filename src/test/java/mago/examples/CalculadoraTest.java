package mago.examples;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/* ****************
 * 1) Create the Test suite (static)
 * 2) Create constructor
 * 3) Implement tests
 * *************/

/**
 * Create the class extending from TestCase
 */
public class CalculadoraTest extends TestCase {

    private Calculadora calculadora = new Calculadora();

    /**
     * Create the suite.
     * @return
     */
    public static Test suite(){
        return new TestSuite( CalculadoraTest.class );
    }

    /**
     * Constructor
     * @param testName
     */
    public CalculadoraTest(String testName) {
        // call super constructor with given testName
        super(testName);
    }


    /**
     * Test case: Sumar
     */
    public void test_sumar() {
        assertEquals("Testing SUMAR", 9, this.calculadora.sumar(5, 4));
    }

    /**
     * Test case: Restar
     */
    public void test_restar() {
        assertEquals("Testing RESTAR", 4, this.calculadora.restar(8, 4));
    }

    /**
     * Test case: Multiplicar
     */
    public void test_multiplicar() {
        assertEquals("Testing MULTIPLICAR", 28, this.calculadora.multiplicar(14, 2));
    }

    /**
     * Test case: Dividir
     */
    public void test_dividir() {
        assertEquals("Testing DIVIDIR", 3, this.calculadora.divisionEntera(18, 6));
    }

    /**
     * Test case: Dividision (restpo
     */
    public void test_restoDivision() {
        assertEquals("Testing DIVIDIR (rest)", 1, this.calculadora.restoDivisionEntera(17, 4));
    }


}
