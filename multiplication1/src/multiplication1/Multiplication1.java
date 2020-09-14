package multiplication1;
import java.util.*;

public class Multiplication1 {
	int a,b,m;
	public void operation(){
		Scanner s=new Scanner(System.in);
		System.out.println("input two numbers:");
		a=s.nextInt();
		b=s.nextInt();
		s.close();
		m=a*b;
		System.out.println("the result is : "+m);
	}

}
class Demo{
 public static void main(String[] args){
		Multiplication1 obj=new Multiplication1();
		obj.operation();
	}
}