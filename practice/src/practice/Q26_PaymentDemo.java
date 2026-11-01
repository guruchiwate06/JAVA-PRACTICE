package practice;

interface Q26 {
    void pay();
}
class CreditCard implements Q26{
    public void pay(){
        System.out.println("Payment done via Credit Card");
    }
} 
class UPI implements Q26{
    public void pay(){
        System.out.println("Payment done via UPI");
    }
} 
public class Q26_PaymentDemo{
    public static void main(String[] args){
        Q26 p;
        
        p = new CreditCard();
        p.pay();
        p = new UPI();
        p.pay();
    }
}
