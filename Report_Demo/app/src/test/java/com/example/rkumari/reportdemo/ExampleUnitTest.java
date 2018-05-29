package com.example.rkumari.reportdemo;

import org.testng.annotations.Test;

import org.testng.Assert;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        Assert.assertEquals(4, 2 + 2);
    }



    @Test
    public void addition_isWrong() throws Exception {
        Assert.assertEquals(4, 2 + 1);
    }
}