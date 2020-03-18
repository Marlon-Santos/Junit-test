package br.com.gft.unitTest.servicos;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FixMethodOrderTest {
    public static int count = 0;

    @Test
    public void test1() {
        count++;
        System.out.println(count);
    }

    @Test
    public void test2() {
        MatcherAssert.assertThat(count, CoreMatchers.equalTo(1));
    }

}
