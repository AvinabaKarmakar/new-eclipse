package smallest;
import java.util.*;
public class Smallest {
int arr[],i,n;
public void Check(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
	n=sc.nextInt();
	arr=new int[n];
	for(i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	
		System.out.println(Arrays.toString(arr));
		for(i=0;i<arr.length;i++){
			if(arr[i]!=arr[i+1]){
			System.out.println("2nd smallest number"+arr[i+1]);
			break;
			}
		}
	
	
}
}
class Demo{
	public static void main(String[] args){
		Smallest p=new Smallest();
		p.Check();
	}
}
