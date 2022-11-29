package ru.samsung.itschool.mdev.myapplication;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    Calc calc;

    @Before
    public void init() {
        calc = new Calc();
    }

    @Test
    public void testSum1() {
        Assert.assertEquals(3, calc.sum(1,2));
    }

    @Test
    public void testSum2() {
        Assert.assertEquals(4, calc.sum(2,2));
    }

    @Test(expected = NullPointerException.class)
    public void testSum3() {
        String res = null;
        Assert.assertTrue(calc.printMessage(res));
    }

    @After
    public void after() {
        calc = null;
    }

}