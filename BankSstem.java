class BankAccount{
  String name;
  double balance;

  BankAccount(String name, double balance){
    this.name = name;
    this.balance = balance;
  }
  void ShowAcoount(){
    System.out.println("Owner:" + name);
    System.out.println("balance" + balance);
  }
  void deposit(double amount){
    balance = balance + amount;
  }
}

public class BankSstem {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Shehzad", 10000);
        account1.ShowAcoount();
        account1.deposit(500);
        account1.ShowAcoount();
    }
}
