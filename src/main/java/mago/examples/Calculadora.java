package mago.examples;

public class Calculadora implements ICalculadora{

    public int sumar(int a, int b){
        return a + b;
    }

    public int restar(int a, int b){
        return a - b;
    }

    public int divisionEntera(int dividendo, int divisor){
        return dividendo / divisor;
    }

    public int restoDivisionEntera(int dividendo, int divisor){
        return dividendo % divisor;
    }

    public int multiplicar(int a, int b){
        return a * b;
    }


}