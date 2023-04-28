package chapter8_optional.l1_java.p1_streams.a1_StreamsFilter;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterZeroesTest {
    FilterZeroes fz = new FilterZeroes();

    /**
     * {1, 2, 3, 4, 5} with all zeroes removed should produce {1, 2, 3, 4, 5}.
     */
    @Test
    public void filterZeroesNoZeroesTest(){
        Integer[] nums = {1, 2, 3, 4, 5};
        Integer[] target = {1, 2, 3, 4, 5};
        List<Integer> numsAL = new ArrayList<>(Arrays.asList(nums));
        List<Integer> targetAL = new ArrayList<>(Arrays.asList(target));
        Assert.assertEquals(targetAL, fz.filter(numsAL));
    }

    /**
     * {1, 0, 2, 3, 0, 4, 5} with all zeroes removed should produce {1, 2, 3, 4, 5}.
     */
    @Test
    public void filterZeroesTest1(){
        Integer[] nums = {1, 0, 2, 3, 0, 4, 5};
        Integer[] target = {1, 2, 3, 4, 5};
        List<Integer> numsAL = new ArrayList<>(Arrays.asList(nums));
        List<Integer> targetAL = new ArrayList<>(Arrays.asList(target));
        Assert.assertEquals(targetAL, fz.filter(numsAL));
    }

    /**
     * {6, 0, 4, 0, 2} with all zeroes removed should produce {6, 0, 4, 0, 2}.
     */
    @Test
    public void filterZeroesTest2(){
        Integer[] nums = {6, 0, 4, 0, 2};
        Integer[] target = {6, 4, 2};
        List<Integer> numsAL = new ArrayList<>(Arrays.asList(nums));
        List<Integer> targetAL = new ArrayList<>(Arrays.asList(target));
        Assert.assertEquals(targetAL, fz.filter(numsAL));
    }

    /**
     * {6, 4, 2, 0, 0, 0} with all zeroes removed should produce {6, 4, 2}.
     */
    @Test
    public void filterZeroesTest3(){
        Integer[] nums = {6, 4, 2, 0, 0, 0};
        Integer[] target = {6, 4, 2};
        List<Integer> numsAL = new ArrayList<>(Arrays.asList(nums));
        List<Integer> targetAL = new ArrayList<>(Arrays.asList(target));
        Assert.assertEquals(targetAL, fz.filter(numsAL));
    }
}
