
package newpackage01;

class Computer{
    public void playMusic(){
        System.out.println("Music playing.....");
    }
    public String getPen(int cost){
        if (cost>=10)
            return "Pen";
        return "nothing";
    }
    
}
public class NewClass02 {
    public static void main(String a[]){
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getPen(20);
        System.out.println(str);
    }
}
