package com.codility.tasks.spring.healthcheck;

import datastructure.codility.spring.healthcheck.Inverter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;

/**
 * @author piksel
 */

public class InverterTest {

    @InjectMocks
    private Inverter inverter;

    @Test(expected = NullPointerException.class)
    public void shouldInvert() {
        Inverter.invert(null);

        Assert.fail("given String is null");
    }
    @Test
    public void shouldInvertReturnOriginalStringWhenGivenStringHasSingleCharacter() {
        String actual = Inverter.invert("a");

        Assert.assertEquals(actual, "a");
    }
    @Test
    public void shouldInvertReturnEmptyStringWhenGivenStringIsEmpty() {
        String actual = Inverter.invert("");

        Assert.assertEquals(actual, "");
    }
    @Test
    public void shouldInvertGivenStringWhenStringIsLonger() {
        String actual = Inverter.invert("testing");

        Assert.assertEquals(actual, "gnitset");
    }
    @Test
    public void shouldInvertGivenStringWhenGivenStringContainsSpace() {
        String actual = Inverter.invert("cba gnitset");

        Assert.assertEquals(actual, "testing abc");
    }
    @Test
    public void shouldInvertGivenStringWhenGivenStringContainsSpecialCharacters() {
        String actual = Inverter.invert("test m$ second abc");

        Assert.assertEquals(actual, "cba dnoces $m tset");
    }
    @Test
    public void shouldInvertGivenStringWhenGivenStringContainsOnlyDigits() {
        String actual = Inverter.invert("123 645 789");

        Assert.assertEquals(actual, "987 546 321");
    }

}