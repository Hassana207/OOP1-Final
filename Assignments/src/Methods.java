public class Methods {

    // method to return the sum of two numbers
    public static int calculateSum(int firstValue , int secondValue ){
        return  firstValue + secondValue ;

    }

    // method to return multiplication of  two values
    public  static int multiply (int firstValue , int secondValue){
        return firstValue * secondValue ;
    }


    // method to return multiplication of three values
    public  static int multiply (int firstValue , int secondValue, int thirdValue){
        return firstValue * secondValue * thirdValue ;
    }

    //method to return the maximum value in an array
    public static int findMax(int[] array) {
        // Initialize maxValue to the first element of the array
        int maxValue = array[0];

        // Loop through my array to compare each element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                // Update maximum Value if a larger number is found
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    // Recursive method to return string in reverse order
    public static String reverseString(String strings, int index) {
        // Base case: if index is less than 0
        if (index < 0) {
            // returning empty string as base case
            return "";
        }


        // Returning the character at the current index using charAt method
        // charAt methods return the value at the specified index
        // then method recursively call itself with the next index (index - 1),
        return strings.charAt(index) +  reverseString(strings, index - 1) ;


    }




}
