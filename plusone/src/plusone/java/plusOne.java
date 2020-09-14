package plusone.java;
import java.util.*;

public class plusOne {
	int n;
	int arr[];
	
public void getData(){
	int i;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the no of elements:");
	n=s.nextInt();
	arr=new int[n];
	System.out.println("Input the elements:");
	for( i =0;i<n;i++){
		arr[i]=s.nextInt();
	}
	System.out.println(i);
	s.close();
	
}

public void showData(){
	int val=1,j,z=0,i=0;

	for(j=0;j<=n-1;j++){
		val=(int)(val+(arr[j]*Math.pow(10,n-j-1)));
	
	}

	System.out.println(j);
	System.out.println(val);
	while(val!=0){
		z=val%10;
		 val=val/10;
		 
		 arr[i]=z;
		 
		 System.out.println(arr[i]+" ");
		 i++;  
		 //System.out.println(z);
	}
	for(i=arr.length-1;i>=0;i--){	
	System.out.print(arr[i]+" ");
	}
		
	}
		

}


class Demo{
	public static void main(String[] args){
		plusOne p=new plusOne();
		p.getData();
		p.showData();
	}
}
