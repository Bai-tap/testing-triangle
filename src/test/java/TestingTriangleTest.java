import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestingTriangleTest {
    @Test
    public void edgeALessThanZero() {
        double a = -1;
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
        double c = 3;

        String actual = TestingTriangle.isTriangle(a, b, c);
        String expected = "Not a triangle";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void edgeCLessThanZero() {
        double a = 1;
        double b = 2;
        double c = -1;

        String actual = TestingTriangle.isTriangle(a, b, c);
        String expected = "Not a triangle";

        Assert.assertEquals(actual, expected);
    }


}
