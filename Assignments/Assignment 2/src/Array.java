import java.util.Arrays;

public class Array {
    public static void displayArray(int [] array ){
        System.out.println("Arrays element:" + Arrays.toString(array));
    }

    // method to display largest number
    public static void largestElement(int [] array){
        //initialising our largest number to be first element
        int  largest = array[0] ;
        //looping through our array and compare with our initialised
        // largest number to get our largest number
        for (int i=1; i < array.length ; i++){
            if(array[i] > largest){
                largest = array [i];
            }
        }
        System.out.println("Largest Number:" + largest);
    }

// method to display of smallest number
    public static void smallestElement(int [] array){
        //initialising our smallest number to be first element
        int  smallest = array[0] ;
        //looping through our array and compare with our initialised
        // largest number to get our smallest number
        for (int i=1; i < array.length ; i++){
            if(array[i]< smallest){
                smallest = array[i];
            }
        }
        System.out.println("Smallest Number:" + smallest);
    }

    public static void sumOfElement(int [] array){
        int sum = 0;
        for(int i =0 ; i < array.length;i++){
            sum += array[i];
        }
        System.out.println("Sum:" + sum);
    }




}

