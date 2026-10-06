// Interface
interface Playable {
    void play();
}

// Abstract Class
abstract class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    abstract void role();

    void greet() {
        System.out.println("Hello, I am " + name);
    }
}

// Inheritance + Encapsulation
class Student extends Person implements Playable {

    private int marks;

    // Constructor
    Student(String name, int marks) {
        super(name);
        this.marks = marks;
    }

    // Getter
    public int getMarks() {
        return marks;
    }

    // Setter
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Method Overriding
    @Override
    void role() {
        System.out.println(name + " is a Student");
    }

    // Interface Method
    @Override
    public void play() {
        System.out.println(name + " is playing Cricket");
    }

    // Method Overloading
    void study() {
        System.out.println(name + " is studying");
    }

    void study(int hours) {
        System.out.println(name + " studied for " + hours + " hours");
    }
}

public class Main {

    public static void main(String[] args) {

        // Object Creation
        Student s1 = new Student("Rahul", 85);

        // Abstract Class Method
        s1.greet();

        // Overridden Method
        s1.role();

        // Encapsulation
        System.out.println("Marks = " + s1.getMarks()
