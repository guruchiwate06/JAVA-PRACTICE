package newpackage01;

public class BankAccount {
    protected int balance;
    
    public void deposit(int amt){
        balance+= amt;
    }
    public void withdraw(int amt){
        if(amt <= balance){
            balance-= amt;
        }
        else{
            System.out.println("Balance low");
        }
    }
    public void checkBalance(){
        System.out.println("Balance:"+balance);
    }
            
}
