package chapter8_optional.l2_challenges.c09_piglatinsentence;

import org.junit.Assert;
import org.junit.Test;

public class PigLatinSentenceTest {
    PigLatinSentence pls = new PigLatinSentence();

    /**
     * "apple banana pear" converted to pig latin should be "ppleaay ananabay earpay"
     */
    @Test
    public void pigLatinSentence1(){
        String input = "apple banana pear";
        String expected = "ppleaay ananabay earpay";
        String actual = pls.returnPigLatinSentence(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * "zebra shark penguin" converted to pig latin should be "ebrazay harksay enguinpay".
     */
    @Test
    public void pigLatinSentence2(){
        String input = "zebra shark penguin";
        String expected = "ebrazay harksay enguinpay";
        String actual = pls.returnPigLatinSentence(input);
        Assert.assertEquals(expected, actual);
    }
}
