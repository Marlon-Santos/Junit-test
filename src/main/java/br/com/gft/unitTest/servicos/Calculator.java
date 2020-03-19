package br.com.gft.unitTest.servicos;

import br.com.gft.unitTest.exceptions.CalculatorExcepetion;

public class Calculator {
    public Double plus(Double x, Double y) {
        return x + y;
    }

    public Double minius(Double x, Double y) {
        return x - y;
    }

    public Double multiply(Double x, Double y) {
        return x * y;
    }

    public Double division(Double x, Double y) throws CalculatorExcepetion {
        if(y==0){
            throw new CalculatorExcepetion("not zero here");
        }
        return x / y;
    }
}
