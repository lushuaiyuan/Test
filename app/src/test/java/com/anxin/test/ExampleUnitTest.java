package com.anxin.test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void ceshi(){
        com.anxin.mylibrary.Test test = new com.anxin.mylibrary.Test();
        System.out.print( test.addition(1, 2));
    }
}