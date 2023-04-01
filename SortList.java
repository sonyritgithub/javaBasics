/*Write a program to sort list of elements in ascending and descending order and show the exception handling.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();// numbers=[]
        numbers.add(5);// numbers=[5]
        numbers.add(2);// numbers=[5,2]
        numbers.add(9);// numbers=[5,2,9]
        numbers.add(1);// numbers=[5,2,9,1]
        numbers.add(7);// numbers=[5,2,9,1,7]

        try {
            // Sort the list in ascending order
            Collections.sort(numbers);
            System.out.println("Ascending order: " + numbers);// numbers=[1,2,5,7,9]

            // Sort the list in descending order
            Collections.sort(numbers, Collections.reverseOrder());// numbers=[9,7,5,2,1]
            System.out.println("Descending order: " + numbers);

            // index out of bounds                                             0 1 2 3 4
            System.out.println("num at index 7:" + numbers.get(7));// numbers=[9,7,5,2,1] //index value must be given
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
