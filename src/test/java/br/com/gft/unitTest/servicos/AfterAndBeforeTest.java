package br.com.gft.unitTest.servicos;

import org.junit.*;

public class AfterAndBeforeTest {

    private static int cont = 0;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("antes de instancia a classe");
    }

    @Before
    public void before() {
        cont ++;
        System.out.println("before: " + cont);

    }

    @Test
    public void test() {
        System.out.println("current value: " + cont);
    }

    @Test
    public void test1() {
        System.out.println("current value1: " + cont);
    }

    @After
    public void after() {
        cont ++;
        System.out.println("after: " + cont);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("depois de matar a classe");
    }
}
