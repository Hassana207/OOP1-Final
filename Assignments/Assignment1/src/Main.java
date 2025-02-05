
public class Main {
    public static void main(String[] args) {

        //instantiating two student objects
        Student student1 = new Student("Hassan",20,"hassan.ayinde12");
        Student student2 = new Student("Nadhir",20,"nadhir.rahman13");

     // updating student 2 name using setter method
        student2.setName("Trinity");

        //calling displayDetails method to print student details
        student1.displayDetails();
        student2.displayDetails();

        //calling changeUniversityName method to change university name
        Student.changeUniversityName("Durham college");

        // Verifying if university name changed
        student1.displayDetails();
        student2.displayDetails();


    }
}