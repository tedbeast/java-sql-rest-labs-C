package chapter8_optional.l1_java.p2_reflection.a1_classreflection;

import org.junit.Assert;
import org.junit.Test;

public class ClassReflectionTest {
    ClassReflection cr = new ClassReflection();
    @Test
    public void getClassTest1(){
        Class cl = cr.getMyClass();
        Assert.assertEquals(cl, ClassReflection.class);
    }
}
