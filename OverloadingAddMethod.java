public class OverloadingAddMethod {
    
    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 10;
        double double1 = 2.5;
        double double2 = 3.7;
        
        int sum1 = add(num1, num2);
        System.out.println("Sum of two integers: " + sum1);
        
        double sum2 = add(num1, double1);
        System.out.println("Sum of an integer and a double: " + sum2);
        
        double sum3 = add(double1, double2);
        System.out.println("Sum of two doubles: " + sum3);
        
    }
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static double add(int a, double b) {
        return a + b;
    }
    
    public static double add(double a, double b) {
        return a + b;
    }
}
