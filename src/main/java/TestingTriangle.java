public class TestingTriangle {
    public static void main(String[] args) {

    }

    public static String isTriangle(double a, double b, double c) {
        String isTriangle = "Not a triangle";
        if (a > 0 && b > 0 && c > 0) {
            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                isTriangle = "Is a triangle";
                if (a == b || b == c || a == c) {
                    isTriangle = "Is a isosceles triangle";
                    if (a == b && b == c) {
                       isTriangle = "Is a equilateral triangle";
                        return isTriangle;
                    }
                }
            }
        }
        return isTriangle;
    }
}
