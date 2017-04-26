package com.wandercosta.stringgenerator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class to test the {@link StringGenerator}.
 *
 * @author Wander Costa (www.wandercosta.com)
 * @version 1.0
 */
public class StringGeneratorTest {

    private final StringGenerator GENERATOR = new StringGenerator();

    @Test
    public void shouldGenerate() {
        assertEquals(1, GENERATOR.generate(1).length());
        assertEquals(2, GENERATOR.generate(2).length());
        assertEquals(3, GENERATOR.generate(3).length());
        assertEquals(4, GENERATOR.generate(4).length());
        assertEquals(5, GENERATOR.generate(5).length());
        assertEquals(10, GENERATOR.generate(10).length());
        assertEquals(100, GENERATOR.generate(100).length());
        assertEquals(1000, GENERATOR.generate(1000).length());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldFalToGenerateWithLenght0() {
        GENERATOR.generate(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldFalToGenerateWithLenghtNegative1() {
        GENERATOR.generate(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldFalToGenerateWithLenghtNegative1000() {
        GENERATOR.generate(-1000);
    }

}
