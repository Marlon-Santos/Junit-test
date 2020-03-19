package br.com.gft.unitTest.servicos;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@RunWith(Suite.class)
@Suite.SuiteClasses({
        AfterAndBeforeTest.class,
        AssertTest.class,
        AssumptionTest.class,
        CalculatorTest.class,
        DiscountTest.class,
        ErrorColectorTest.class,
        FixMethodOrderTest.class,
        LocacaoServiceExceptionTest.class,
        LocacaoService.class,
        MatcherAssertTest.class
})
public class SuiteTest {

}
