package hexa;
import java.util.*;
public class Hexa {
    int deci=0;
   String hex;
    public void Convert(){
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter the hexadecimal number:");
    	hex=s.nextLine();
    	s.close();
    	deci=Integer.parseInt(hex,16);
    	System.out.println("Equivalent decimal number is:"+deci);
    }
}
class Demo6{
	public static void main(String[] args){
		Hexa obj=new Hexa();
		obj.Convert();
	}
}
