
// class BankAccount {

//     private double balance;

//     void deposit(double amount) {

//         if (amount > 0) {
//             balance = balance + amount;
//         }
//     }

//     double getBalance() {
//         return balance;
//     }
// }

// public class encapsulation {

//     public static void main(String[] args) {

//         BankAccount account = new BankAccount();

//         account.deposit(5000);
//         account.deposit(2000);

//         System.out.println("Balance: " + account.getBalance());
//     }
// }


// class Student{
//     String name;
//     void setname(String name){
//         this.name = name;
//     }
//     String getName(){
//        return name;
//     }
// }
// public class encapsulation {

//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.setname("Ali");
//         System.out.println(s1.getName());
//     }
// }

//Student Example
class Student{
   private String name;
   private double marks;
   private  int age;

   public Student(String name, double marks, int age){
    this.name = name;
    this.marks= marks;
    this.age = age;
   }
   public String getName(){
    return name;
   }
   public void setName(String name){
    this.name = name;
   }
   public double getmarks(){
    return marks;
   }
   public void setMarks(double marks){
     if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
   }
   public int getage(){
    return age;
   }
   public void setAge(int age){
    if (age > 0) {
        this.age = age;
    }
    this.age = age;
   }
   public void showInfo(){
    System.out.println("Name:" + name);
    System.out.println("marks" +  marks);
    System.out.println("Age: " + age);
   }

}
public class encapsulation {
 public static void main(String[] args) {
     
     Student s1 = new Student("Shehzad", 85, 21);
     s1.showInfo();
     s1.setMarks(90);
     System.out.println("Updated Marks:" + s1.getmarks());
 }
    
}