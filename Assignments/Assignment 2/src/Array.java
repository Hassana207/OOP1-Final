import java.util.Arrays;

public class Array {
    public static void displayArray(int [] array ){
        System.out.println("Arrays element:" + Arrays.toString(array));
    }
    public static void largestElement(int [] array){
        int  largest = array[0] ;
        for (int i=0; i < array.length ; i++){
            if(array[i]> 0){
                largest = array [i];
            }
            else{
                break;
            }
        }
        System.out.println("Largest Number:" + largest);
    }
}

