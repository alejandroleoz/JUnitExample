package mago.examples;

public interface ICalculadora {

    /**
     * Suma de los valores pasados como parametros
     * @param a
     * @param b
     * @return a + b
     */
    public int sumar(int a, int b);

    /**
     * Resta los valores pasados como parametros
     * @param a
     * @param b
     * @return a - b
     */
    public int restar(int a, int b);

    /**
     * Devuelve el resultado de la division entera entre los parametros
     * @param dividendo
     * @param divisor
     * @return dividendo/divisor
     */
    public int divisionEntera(int dividendo, int divisor);

    /**
     * Devuelve el resto de una division entera entre los parametros
     * @param dividendo
     * @param divisor
     * @return
     */
    public int restoDivisionEntera(int dividendo, int divisor);

    /**
     * Multiplica los factores pasados como parametros
     * @param a
     * @param b
     * @return a * b
     */
    public int multiplicar(int a, int b);


}
