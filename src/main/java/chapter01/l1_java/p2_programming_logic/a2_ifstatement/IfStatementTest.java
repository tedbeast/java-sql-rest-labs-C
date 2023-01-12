package chapter01.l1_java.p2_programming_logic.a2_ifstatement;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class IfStatementTest {
    static IfStatement is;
    @BeforeClass
    public static void setUp(){
        is = new IfStatement();
    }

    /**
     * If bool is true, then ifExample is expected to return inputA.
     */
    @Test
    public void ifStatementTest1(){
        boolean bool = true;
        int x = 0;
        int y = 1;
        int expected = 0;
        int actual = is.ifExample(bool, x, y);
        Assert.assertEquals(expected, actual);
    }
    /**
     * If bool is false, then ifExample is expected to return inputB.
     */
    @Test
    public void ifStatementTest2(){
        boolean bool = false;
        int x = 0;
        int y = 1;
        int expected = 1;
        int actual = is.ifExample(bool, x, y);
        Assert.assertEquals(expected, actual);
    }
}
