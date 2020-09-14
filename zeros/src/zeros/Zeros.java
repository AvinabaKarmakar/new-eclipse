package zeros;
import java.util.*;

public class Zeros {

public static void main(String[] args){
	int number,binary,i=0,count=0;
	int arr[]=new int[20];
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	number=s.nextInt();
	s.close();
	System.out.println("Binary representation:");
	while(number!=0){
		binary=number%2;
		number=number/2;
		arr[i]=binary;
		System.out.print(arr[i]);
		
		if(arr[i]==0){
			count+=1;
			i++;
		}
	}
	System.out.println();
	System.out.println("no of zeros:"+count);
}
}
