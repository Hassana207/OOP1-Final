import java.util.Arrays;

public class Array {
    //method to display our array elements enterd by user
    public static void displayArray(int [] array ){
        System.out.println("Arrays element:");
        //loop through each element and print
        for (int arr : array) {
            System.out.print(" " + arr);
        }
        System.out.println(); // Move to a new line after printing the array

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

    // method to get the sum of our array element
    public static void sumOfElement(int [] array){
        //initialise the sum to 0
        int sum = 0;
        //loop through our array and add all element to our initialise sum to get the sum
        for(int i =0 ; i < array.length;i++){
            sum += array[i];
        }
        System.out.println("Sum:" + sum);
    }

    //method to get the average of our array
    public static void averageOfElement(int [] array){
        double sum = 0;
        //loop through our array and add all element to our initialise sum to get sum
        for(int i =0 ; i < array.length;i++){
            sum += array[i];
        }
        // average is equal to  the sum of our array divided by array length
        double average =  sum / array.length;
        System.out.println("Average:" + average);


    }

    // method to search a number in our array
    public static void searchElement(int [] array, int number ){
        //initialise our boolean to false not yet found
        boolean found = false;
        //loop through our array if the number entered by the user is
        //in the array found equal to true and break out of for loop
        for (int i =0 ; i < array.length;i++){
            if(array[i]==number){
                System.out.println(number  +" " +"is found in the array");
                found = true;
                break;
            }
        }
        // if not found Number not found in the array printed
        if (!found){
            System.out.println("Number not found in the array");
        }
    }

    //This is the type of method of sorting array in ascending order
    //in which the largest unsorted number is bubbled to  the end at each pass
    //The outer loop from the first element to the second to the last because the
    //largest element are positioned at the end and the inner loop compares element
    //with element at its front if bigger swap and swap till the largset element
    // is position at the end
    public static void bubbleSort(int[] array) {
        int count = array.length;
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (array[j] > array [j + 1]) {
                    int swap = array [j]; // Order is wrong!
                    array [j] = array [j + 1]; // Swap them.
                    array [j + 1] = swap;
                }
            }
        }
        System.out.println("sorted array:");
        for (int arr:array){
            System.out.print(arr + " ");
        }
    }




}

