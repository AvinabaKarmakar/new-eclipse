package multiplication.java;
import java.util.*;

public class Demo {
	int a,b,m;
	public void operation(){
		Scanner s=new Scanner(System.in);
		System.out.println("input two numbers:");
		a=s.nextInt();
		b=s.nextInt();
		s.close;
		m=a*b;
		System.out.println("the result is : "+m);
	}

}
class Mulpltiplication{
	public static void main(String[] args){
		 Demo obj=new Demo();
		obj.operation();
	}
}