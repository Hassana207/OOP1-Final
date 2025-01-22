package org.dc.oop1.objects;

public class Exploreobjects {
    public static void main (String[] args){
        Student s1 = new Student();
        s1.setFirstName("hassan");
        s1.setLastName("ayinde");

        System.out.println("firstname is "+ s1.getFirstName());
        System.out.println("firstname is "+ s1.getLastName());

        Student s2 = new Student ("1", "hassan", "smth", 1);


    }
}
