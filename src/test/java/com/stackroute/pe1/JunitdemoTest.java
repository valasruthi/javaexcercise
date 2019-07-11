package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class JunitdemoTest {
    Junitdemo junitdemo;

    @Before
    public void setup() {
        System.out.println("Inside Before");
        this.junitdemo = new Junitdemo();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        junitdemo = null;
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

    @Test
    public void givenTwoStringsShouldReturnConcatedUpperStrings() {
        //act
        String actualResult = junitdemo.concatAndUpperCase("Hello", "world");
        //assert
        assertNotNull(actualResult);
        assertEquals("HELLOWORLD", actualResult);
    }

    @Test
    public void givenAStringAndShouldReturnErrorMessage() {
        // arrange
        Junitdemo junitdemo = new Junitdemo();
        //act
        String actualResult = junitdemo.concatAndUpperCase("Hello", null);
        //assert
        assertNotNull(actualResult);
        assertEquals("Null Value Not Allowed", actualResult);
    }

  @Test
    public void givenStringShouldReturnTheReverse(){
        //act
     String actualResult= junitdemo.reverseString("Hello");
     //Assert
     assertEquals("olleH",actualResult);
    }
   // @Test
   // public void givenNullShouldThrowNullPointerException(){
        //act
       // String actualResult= junitdemo.reverseString("Hello");
        //Assert
       // assertEquals("olleH",actualResult);
 //   }

    }
