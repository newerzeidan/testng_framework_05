package testng_knowledge;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Assertions {

    @Test
    public void test1(){
        Assert.assertTrue(true);
        Assert.assertTrue(1 == 1);
        Assert.assertTrue(65 > 45);
        Assert.assertTrue(10 <= 10);
        Assert.assertTrue(3 + 5 < 2 * 10);
    }

    @Test
    public void test2(){
        Assert.assertFalse(false);
        Assert.assertFalse(3 > 5);
    }

    @Test
    public void test3(){
    Assert.assertEquals("hello", "Hello");
    Assert.assertNotEquals("hello", "Hello");
    }

    @Test
    public void assertionMessages(){
        Assert.assertTrue(true, "This validation FAILED");
    }
    @Test
    public void login(){
        Assert.fail("This test fails due to BUG: 123ABC");
    }
}