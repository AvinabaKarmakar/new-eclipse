package splitreverse;
import java.util.*;
public class Reverse1 {
public void Reverse(String str[]){
int min=0,max=str.length;
/*String temp;
while(min>max){
	temp=str[min];
	str[min]=str[max];
	str[max]=temp;
	min++;
	max--;
}*/
System.out.println("Reverse the sentence:");
for(int i=max-1;i>=min;i--){
	System.out.println(str[i]);
}
}
}
class Demo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String s=sc.nextLine();
		String str[]=s.split(" ");
		Reverse1 obj=new Reverse1();
		obj.Reverse(str);
	}
}