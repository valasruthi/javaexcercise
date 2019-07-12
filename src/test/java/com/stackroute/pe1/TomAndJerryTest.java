package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TomAndJerryTest {

    @Test
    public void givenAStringAndShouldReturnEven() {
        TomAndJerry tomAndJerry =new TomAndJerry();
        String actualResult = tomAndJerry. tomAndJerry(21);
     //   assertNotNull(actualResult);
        assertEquals("jerry", actualResult);
    }
    @Test
    public void givenAStringAndShouldReturnOdd() {
        TomAndJerry tomAndJerry = new TomAndJerry();
        String actualResult = tomAndJerry.tomAndJerry(24);
        assertNotNull(actualResult);
    }
    @Test
    public void givenAStringAndShouldReturnNotInRange() {
        TomAndJerry tomAndJerry = new TomAndJerry();
        String actualResult = tomAndJerry.tomAndJerry(18);
        assertNotNull(actualResult);
    }
}