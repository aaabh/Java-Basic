package Contructor;

public class MainClassP5 {
    public static void main(String[] args) {
        Person p1 = new Person(21);
        System.out.println(p1.age);

        Person p2 = new Person(23);
        System.out.println(p2.age);

        Person p3 = new Person(22);
        System.out.println(p3.age);
    }
}
class Person{
    int age ;
    Person(int arg){
        age = arg;
    }
}
