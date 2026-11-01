import java.io.*;
public class dummycla{
	public static void main(String[] Args){
	int l = Args.length;
	int i;
	if(l<1){
		System.out.println("No Arguments passed");
}
	else{
	for(i=0;i<l;i++){
	System.out.println(Args[i]);
}
}
}
}