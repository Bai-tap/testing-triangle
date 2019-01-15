import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestingTriangleTest {
    @Test
    public void edgeALessThanZero() {
        double a = -1.9;
        double b = 2;
        double c = 3;

        String actual = TestingTriangle.isTriangle(a, b, c);
        String expected = "Not a triangle";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void edgeBLessThanZero() {
        double a = 1;
        double b = -1;
        double c = 3.1;

        String actual = TestingTriangle.isTriangle(a, b, c);
        String expected = "Not a triangle";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void edgeCLessThanZero() {
        double a = 1;
        double b = 2.3;
        double c = -1;

        String actual = TestingTriangle.isTriangle(a, b, c);
        String expected = "Not a triangle";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void allEdgeLessThanZero() {
        double a = -1;
        double b = -2;
        double c = -1;

        String actual = TestingTriangle.isTriangle(a, b, c);
        String expected = "Not a triangle";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void isATriangle() {
        double a = 3;
        double b = 2;
        double c = 4;

        String actual = TestingTriangle.isTriangle(a, b, c);
        String expected = "Is a triangle";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void sumTwoEdgesLessThanTheOtherV1() {
        double a = 1;
        double b = 2;
        double c = 4;

        String actual = TestingTriangle.isTriangle(a, b, c);
        String expected = "Not a triangle";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void sumTwoEdgesLessThanTheOtherV2() {
        double a = 5.6;
        double b = 2.3;
        double c = 2.1;

        String actual = TestingTriangle.isTriangle(a, b, c);
        String expected = "Not a triangle";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void isAIsoscelesTriangle() {
        double a = 3.4;
        double b = 3.4;
        double c = 6;

        String actual = TestingTriangle.isTriangle(a, b, c);
        String expected = "Is a isosceles triangle";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void isAEquilateralTriangle() {
        double a = 3.4;
        double b = 3.4;
        double c = 3.4;

        String actual = TestingTriangle.isTriangle(a, b, c);
        String expected = "Is a equilateral triangle";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void anEdgeEqualZero() {
        double a = 0;
        double b = 3.4;
        double c = 3.4;

        String actual = TestingTriangle.isTriangle(a, b, c);
        String expected = "Not a triangle";

        Assert.assertEquals(actual, expected);
    }
}
