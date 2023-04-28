package chapter8_optional.l1_java.p1_streams.a2_StreamsMap;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareAllTest {
    public static SquareAll raw;
    @BeforeClass
    public static void setUp(){
        raw = new SquareAll();
    }

    /**
     * {1, 2, 3, 4} with squared values is {1, 4, 9, 16}
     */
    @Test
    public void rawTest1(){
        Integer[] nums = {1,2,3,4};
        Integer[] target = {1,4,9,16};
        List<Integer> numsAL = new ArrayList<>(Arrays.asList(nums));
        List<Integer> targetAL = new ArrayList<>(Arrays.asList(target));
        Assert.assertEquals(raw.square(numsAL), targetAL);
    }

    /**
     * {16, 4, 2, 8} with squared values is {256, 16, 4, 64}
     */
    @Test
    public void rawTest2(){
        Integer[] nums = {16, 4, 2, 8};
        Integer[] target = {256, 16, 4, 64};
        List<Integer> numsAL = new ArrayList<>(Arrays.asList(nums));
        List<Integer> targetAL = new ArrayList<>(Arrays.asList(target));
        Assert.assertEquals(raw.square(numsAL), targetAL);
    }
}
