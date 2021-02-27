package com.mycom.mymod;

import org.junit.*;

import static org.hamcrest.Matchers.is;

public class DemoTest {

    @Before
    public void beforeTest(){
        System.out.println("exc before every test");
    }

    @After
    public void afterTest(){
        System.out.println("exc after every test");
    }

    @Test
    public void testNameComparision(){
        Assert.assertEquals("John", "John");

        Assert.assertThat(666, is(666));
    }
    @Test
    @Ignore
    public void testSalaryComparision(){
        Assert.assertEquals(66656.67, 777.9);
    }

    @BeforeClass
    public static void beforeClassTest(){
        System.out.println("exc before class all test");
    }

    @AfterClass
    public static void afterClassTest(){
        System.out.println("exc after class all test");
    }
}
