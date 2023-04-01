/*Write a program to find factorial of list of number reading input as command line argument. */
public class Factorial {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Factorial: No Command Line argument passed.");
            return;
        }
        // [2,3,4,5]
        for (String arg : args) { // arg="4"
            try {
                int num = Integer.parseInt(arg);// arg=3
                int factorial = 1; // n=4
                for (int i = 1; i <= num; i++) { // fact=1 fact=1*=1 fact=1*2=2 fact=2*3=6 fact=6*4=24 i++=5
                    factorial *= i;
                }
                System.out.println("The factorial of " + num + " is : " + factorial);
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument: " + arg);
            }
        }

    }

}
