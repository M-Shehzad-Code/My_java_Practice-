// class Student{
//         String name;
//         int age;

//     void Study(){
//         System.out.println(name + " is studying");
//     }
//     void introduce(){
//         System.out.println("My name is " + name);
//         System.out.println("My age is "+ age);
//     }
// }

// public class Oops1 {
//  public static void main(String[] args) {
    
//     Student student1 = new Student();
//     student1.name = "Shehzad";
//     student1.age = 21;

//     Student student2 = new Student();
//     student2.name = "Ali";
//     student2.age = 32;

//     student1.introduce();
//     student1.Study();

//     student2.introduce();
//     student2.Study();
//  }
    
// }



//Constructor
class Student{
     String name;
     int age;

     Student(String stuname, int stuage){
        name = stuname;
        age = stuage;
     }
     void  Showinfo(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
     }
}


public class Oops1 {

    public static void main(String[] args) {
         Student s1 = new Student("Shehzad", 32);
         s1.Showinfo();
    }
    
}