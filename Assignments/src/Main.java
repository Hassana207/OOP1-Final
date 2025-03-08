import  java.util.Scanner ;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter first number");
        int firstValue = scanner.nextInt();

        System.out.println("Enter second number");
        int secondValue = scanner.nextInt();

        int result = Methods.calculateSum(firstValue,secondValue);
        System.out.println("sum" + " " + result);
        }

}