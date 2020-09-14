package strcheck;
import java.util.*;

public class StringCheck {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter two strings:");
	String str1=s.nextLine();
	String str2=s.nextLine();s.close();
	if(str1.contains(str2)){
		System.out.println("yes");
	}
	else
		System.out.println("no");
}
}
