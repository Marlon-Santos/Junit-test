package br.com.gft.unitTest.servicos;

import br.com.gft.unitTest.exceptions.CalculatorExcepetion;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    public static Calculator calculator = new Calculator();
    public Double x = 51.00;
    public Double y = 9.00;

    @Test
    public void plus() {
        Double result = calculator.plus(x, y);
        MatcherAssert.assertThat(result, CoreMatchers.equalTo(60.00));
    }

    @Test
    public void minus() {
        Double result = calculator.minius(x, y);
        MatcherAssert.assertThat(result, CoreMatchers.equalTo(42.00));
    }

    @Test
    public void multiply() {
        Double result = calculator.multiply(x, y);
        MatcherAssert.assertThat(result, CoreMatchers.equalTo(459.00));
    }

    @Test
    public void division() {
        try {
            Double result = calculator.division(x, 0.00);
            MatcherAssert.assertThat(result, CoreMatchers.is(5.666666666666667));
            Assert.fail();
        } catch (CalculatorExcepetion e) {
            e.getStackTrace();
            MatcherAssert.assertThat(e.getMessage(),CoreMatchers.equalTo("not zero here"));
        }
    }
}
