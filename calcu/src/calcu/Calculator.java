package calcu;
import java.util.*;

public class Calculator {
 int a,b,sum=0,sub=0,product=0,distance=0;
 double avg=0;
 public void Operation(){
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the first input:");
  a=s.nextInt();
  System.out.println("Enter the second input:");
  b=s.nextInt();
  s.close();
  sum=a+b;
  System.out.println("sum of two integers:"+sum);
  sub=a-b;
  if(sub<0){
	  sub=(-1)*sub;
  }
  System.out.println("difference of two integers:"+sub);
  product=a*b;
  System.out.println("product of two integers:"+product);
  avg=sum/2;
  System.out.println("average of two integers:"+avg);
  distance=sub;
  System.out.println("distance of two integers:"+distance);
  if(a>b){
	  System.out.println("max= "+a);
	  System.out.println("min= "+b);
  }
  else
  {
	  System.out.println("max= "+b);
	  System.out.println("min= "+a);
 
  }
 }
 
}
class Demo{
	public static void main(String[] args){
		Calculator obj=new Calculator();
		obj.Operation();
	}
}
