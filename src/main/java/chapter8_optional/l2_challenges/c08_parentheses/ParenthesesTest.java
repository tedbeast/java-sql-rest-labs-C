package chapter8_optional.l2_challenges.c08_parentheses;

import org.junit.Assert;
import org.junit.Test;

public class ParenthesesTest {
    Parentheses p = new Parentheses();
    @Test
    public void parenthesesTest1(){
        String s = "(())";
        boolean target = true;
        Assert.assertEquals(target, p.checkParentheses(s));
    }
    @Test
    public void parenthesesTest2(){
        String s = "()()";
        boolean target = true;
        Assert.assertEquals(target, p.checkParentheses(s));
    }
    @Test
    public void parenthesesTest3(){
        String s = "(()())";
        boolean target = true;
        Assert.assertEquals(target, p.checkParentheses(s));
    }
    @Test
    public void parenthesesTest4(){
        String s = "";
        boolean target = true;
        Assert.assertEquals(target, p.checkParentheses(s));
    }
    @Test
    public void parenthesesTest5(){
        String s = ")(";
        boolean target = false;
        Assert.assertEquals(target, p.checkParentheses(s));
    }
    @Test
    public void parenthesesTest6(){
        String s = "((";
        boolean target = false;
        Assert.assertEquals(target, p.checkParentheses(s));
    }
    @Test
    public void parenthesesTest7(){
        String s = "())(()";
        boolean target = false;
        Assert.assertEquals(target, p.checkParentheses(s));
    }
}
