package Contructor;

public class MainClassCO12 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student('J');
    }
}
class Student{
    Student(){
        System.out.println("Personal");
        System.out.println("Academic");
    }
    Student(char c){
        System.out.println("Personal");
        System.out.println("Academic");
        System.out.println("Experience");
    }
}
