package TriangleFunctions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void successArea() throws Exception {
        Assertions.assertEquals(TriangleAreaFunction.triangleArea(1, 2, 3), 2);
    }
    @Test
    void aIsCantBeNull() throws Exception {
        Assertions.assertEquals(TriangleAreaFunction.triangleArea(0, 2, 3), 2);
    }
    @Test
    void bIsCantBeNull() throws Exception {
        Assertions.assertEquals(TriangleAreaFunction.triangleArea(1, 0, 3), 2);
    }
    @Test
    void cIsCantBeNull() throws Exception {
        Assertions.assertEquals(TriangleAreaFunction.triangleArea(1, 2, 0), 2);
    }
    @Test
    void aIsCantBeNegative() throws Exception {
        Assertions.assertEquals(TriangleAreaFunction.triangleArea(-1, 2, 3), 2);
    }
    @Test
    void bIsCantBeNegative() throws Exception {
        Assertions.assertEquals(TriangleAreaFunction.triangleArea(1, -1, 3), 2);
    }
    @Test
    void cIsCantBeNegative() throws Exception {
        Assertions.assertEquals(TriangleAreaFunction.triangleArea(1, 2, -3), 2);
    }

}
