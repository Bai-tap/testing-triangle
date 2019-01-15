public class TestingTriangle {
    public static void main(String[] args) {

    }

    public static String isTriangle(double a, double b, double c) {
        String isTriangle = "";
        String isRightTriangle;
        if (a > 0 && b > 0 && c > 0) {
            if ((a + b > c) || (a + c > b) || (b + c > a) || (a - b < c) || (a - c < b) ||
                    (b - a < c) || (b - c < a) || (c - a < b) || (c - b < a)) {
                isTriangle = "Is a triangle";
                if (a == b && b == c) {
                    isRightTriangle = "Is a right triangle";
                    return isRightTriangle;
                }
            }
        } else {
            isTriangle = "Not a triangle";
        }

        return isTriangle;
    }
}
