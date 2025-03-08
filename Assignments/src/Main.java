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
        int result = Methods.calculateSum(firstValue,secondValue);
        System.out.println("sum:" + " " + result);

        // called multiply method that returns Product of two numbers been called and
        // displayed output
        int output = Methods.multiply(12,10);
        System.out.println("Product of two numbers:" + " " + output);

        // called multiply method that returns Product of three numbers been called and
        // displayed product
        int product = Methods.multiply(15,12,11);
        System.out.println("Product of three numbers: " + " " + product);
        }

}