
// Student class to instantiate all student informations
public class Student {
    private String name;
    private int age;
    private String studentID;
    // static field (shared by all instances of the student  class) with default value
    private static String universityName = "Tech University";

    //Default constructor
    public Student(){}

    //constructor initialising student details
    public  Student(String name,int age,String studentID){
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    //getters and setters method

    //getter method to get student name
    public String getName() {
        return name;
    }
   //setter method to set student name
    public void setName(String name) {
        this.name = name;
    }

    // getter method to get student age
    public int getAge() {
        return age;
    }

    //setter method to set student age
    public void setAge(int age) {
        this.age = age;
    }

    //getter method to get student id
    public String getStudentID() {
        return studentID;
    }

    //setter method to set student id
    public void setStudentID(String studentId) {
        this.studentID = studentId;
    }


    // method to change university name  default value
    public static void changeUniversityName(String changedName){
        universityName = changedName;
    }

    // method to display student's details including name , age , student iD , and university name
    public  void displayDetails(){
        System.out.println("Student's name:" + getName());
        System.out.println("student's age:" + getAge());
        System.out.println("student's ID:"+ getStudentID());
        System.out.println("changed university name:" + universityName);

    }


}
