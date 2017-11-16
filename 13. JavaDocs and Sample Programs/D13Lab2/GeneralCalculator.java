/**
 * A simple representation of a general calulator
 * This is a general maths utility class.
 * Day 13: Lab 2 - Task 1
 * 
 * @author: Tadhg Deeney
 * @author: 17186226
 * @version: 13/09/2017
 */
public class GeneralCalculator{

    public static void main (String [] args){
    
        int x = 8;
        int y = 2;
        
        int result = addTwoNumbers (x,y);
        System.out.println("Two numbers added --> " + result);
        
        result = substractTwoNumbers(x,y);
        System.out.println("Two numbers subtracted --> " + result);
        
        result = calculateModByTen(x, y);
        System.out.println("Modulus multiplied --> "+ result);

    
    } // end of main
    /**
         * Calculates the addition of a to b
         * Usage: int result = addTwoNumbers(8,3);
         * @param a is an integer
         * @param b is an integer
         * @return int result calculates the answer a + b
         */
    public static int addTwoNumbers(int a, int b){ 
    
        int result = a+b; 
        return result;
    } 
    /**
         * Calculates the subtraction of b from a
         * Usage: int result = subtractTwoNumbers(8,3);
         * @param a is an integer
         * @param b is an integer
         * @return int result calculates the answer a - b
         */
    public static int substractTwoNumbers(int a, int b){
    
        int result = a-b;
        return result;
    }   
    /**
         * Calculates the multiplication of a and b
         * Usage: int result = multiplyTwoNumbers(8,3);
         * @param a is an integer
         * @param b is an integer
         * @return int result calculates the answer a * b
         */
    public static int multiplyTwoNumbers(int a, int b){
    
        int result = a * b;
        return result;
    }
    /**
     * Calculates the Modulus of n1 by n2 and multiplies the answer by ten
     * Usage: int x = calculateModByTen(8,3);
     * @param n1 is an integer
     * @param n2 is an integer
     * @return int result calculates the answer of n1 % n2 * 10
     */
    public static int calculateModByTen(int n1, int n2)
    {
        int result = 0;
        result = (n1%n2)*10;
        return result;
    }


} // end of class