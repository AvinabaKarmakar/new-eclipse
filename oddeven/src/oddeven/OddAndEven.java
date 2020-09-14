package oddeven;
import java.util.*;

public class OddAndEven {
int i,c1=0,c2=0,arr[],n;
public void getData(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of element:");
	n=sc.nextInt();
	arr=new int[n];
	for(i=0;i<n;i++){
	arr[i]=sc.nextInt();
	}
	sc.close();
}
public void Check(){
	for(i=0;i<=n-1;i++){
		if(arr[i]%2==0){
			c1++;
		}
		else
		{
			c2++;
		}
	}
	System.out.println("even= "+c1);
	System.out.println("odd= "+c2);
}

}
class Demo{
	public static void main(String[] args){
		OddAndEven obj=new OddAndEven();
		obj.getData();
		obj.Check();
	}
}
