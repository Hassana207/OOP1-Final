import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //initialising my variable for my input
        int numberOfElement;
        Scanner scanner = new Scanner (System.in);
//while loop to implement number of arrays from user
        while (true){
            System.out.println("Please the the number of elements in an array (maximum 20):");
               numberOfElement = scanner.nextInt();

//if and else condition to check user input is not more than 20
                if (numberOfElement > 20){
                    System.out.println("please number of elements must not be more than 20");
                }
                else{
                    break;}
        }

      int [] array = new int[numberOfElement];
        System.out.println("Enter" +  numberOfElement +  "numbers");
        //for loop to collect and store array number of elements
        for (int i=0;i<array.length;i++){
            int arrayElement =scanner.nextInt();
            array[i] = arrayElement;
        }
        Array.displayArray(array);
        Array.largestElement(array);

    }
}