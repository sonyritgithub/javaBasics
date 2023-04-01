public class overloading {

    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a square
    public static float calculateArea(float sideLength) {
        return sideLength * sideLength;
    }

    public static void main(String[] args) {
        double circleArea = calculateArea(5.0);
        double rectangleArea = calculateArea(4.0, 6.0);
        double squareArea = calculateArea(3.0);

        System.out.println("Area of circle: " + circleArea);
        System.out.println("Area of rectangle: " + rectangleArea);
        System.out.println("Area of square: " + squareArea);
    }
}


