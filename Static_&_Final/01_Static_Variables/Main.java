public class Main {
    public static void main(String[] args) {
        Student s1Student = new Student("Shehzad", 20 );
        s1Student.displayInfo();

        Student s2Student = new Student("Ali", 22);
        s2Student.displayInfo();

        System.out.println("Accessing static variable using class name:");
        System.out.println(Student.universityName);


    }
}
