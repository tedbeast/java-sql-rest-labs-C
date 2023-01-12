package chapter08_optional.l1_java.p1_reflection.a2_fieldreflection;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

public class FieldReflectionTest {
    FieldReflection fr = new FieldReflection();
    @Test
    public void FieldReflectionTest1() throws NoSuchFieldException {
        Field[] expected = new Field[2];
        expected[0] = FieldReflection.class.getField("field1");
        expected[1] = FieldReflection.class.getField("field2");
        Field[] actual = fr.getMyFields();
        Assert.assertArrayEquals(expected, actual);
    }
}
