package reversearray;
import java.util.*;
public class ReverseArray {
int i,m;
String arr[];
public void Reverse(String arr[],int min,int max){
	if(min>max)
		return;
	String temp=arr[min];
	arr[min]=arr[max];
	arr[max]=temp;
	 Reverse(arr,min+1,max-1);

}
void Print(String arr[],int m){
	for(i=0;i<m;i++){
		System.out.println(arr[i]);
	}
}
}
class Demo{
	public static void main(String args[]){
		ReverseArray obj=new ReverseArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n=sc.nextInt();
	sc.nextLine();
		try{
		String arr1[]=new String[n];
		for(int k=0;k<arr1.length ;k++){
			 arr1[k]=sc.nextLine();
		}
		System.out.println("Original Array:");
	    obj.Print(arr1,n);
	    System.out.println("Reversed Array:");
	    obj.Reverse(arr1,0,n-1);
	    obj.Print(arr1,n);
		}
		catch(ArrayIndexOutOfBoundsException aoe){
			System.out.println(aoe);
		}
	}

}