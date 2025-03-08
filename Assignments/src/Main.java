
import  java.util.Scanner ;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

       // prompting user to enter first value
        System.out.println("Enter first number:");
        int firstValue = scanner.nextInt();

        // prompting user to enter second value
        System.out.println("Enter second number:");
        int secondValue = scanner.nextInt();

        // called calculateSum method and displayed result
        int sum = Methods.calculateSum(firstValue,secondValue);
        System.out.println("sum:" + " " + sum);

        // called multiply method that returns Product of two numbers and passed
        // two argument then displayed result
        int productOfTwo = Methods.multiply(12,10);
        System.out.println("Product of two numbers:" + " " + productOfTwo);

        // called multiply method that returns Product of three numbers been called and
        // passed three argument then displayed result
        int productOfThree = Methods.multiply(15,12,11);
        System.out.println("Product of three numbers: " + " " + productOfThree);

        System.out.println("Enter size of Arrays:");
        int numbers = scanner.nextInt();

        //initialising array size
        int [] array = new int[numbers];
        System.out.println("Enter Arrays");
        //for loop to collect and store array number of elements
        for (int i=0;i<array.length;i++){
            int arrayElement =scanner.nextInt();
             array[i] = arrayElement;
        }

        //called findMax method and displayed largestValue
        int largestValue = Methods.findMax(array);
        System.out.println("Maximum value:"+ " " + largestValue);


        scanner.nextLine();


         // prompting user to enter a string
        System.out.println("Enter a string:");
        String strings = scanner.nextLine();


        // Called the reverseString method that return string in reverse order
        // and passed strings and its length as argument and also minus string
        // length minus by 1 because highest index is always length - 1
        String reversedString = Methods.reverseString(strings, strings.length() - 1);
        System.out.println("Reversed string: " + " " + reversedString);
        }


}