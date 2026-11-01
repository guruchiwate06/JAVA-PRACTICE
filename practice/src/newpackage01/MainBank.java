
package newpackage01;

public class MainBank {
    public static void main(String[] args){
        BankAccount obj = new BankAccount();
        
        obj.deposit(10000);
        obj.checkBalance();
        
        obj.withdraw(9000);
        obj.checkBalance();
        
        obj.deposit(10000);
        obj.checkBalance();
        
        obj.withdraw(12000);
        obj.checkBalance();
      
    }
}
