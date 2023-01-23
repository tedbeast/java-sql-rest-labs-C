package chapter0.l2_challenges.c1_add;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddTest {
    static Add a;
    @Before
    public void setUp(){
        a = new Add();
    }

    /**
     * If addNumbers is passed in 1 and 2, it should return 3.
     */
    @Test
    public void addTest1(){
        int input1 = 1;
        int input2 = 2;
        int expected = 3;
        int actual = a.addNumbers(input1, input2);
        Assert.assertEquals(expected, actual);
    }

    /**
     * If addNumbers is passed in 3 and 4, it should return 7.
     */
    @Test
    public void addTest2(){
        int input1 = 3;
        int input2 = 4;
        int expected = 7;
        int actual = a.addNumbers(input1, input2);
        Assert.assertEquals(expected, actual);
    }
}
