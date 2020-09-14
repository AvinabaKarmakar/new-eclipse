package sort;

import java.util.Arrays;

public class SortArray {
int arr[],i,n;
public void Opertaion(){
	arr=new int[]{2,5,1,30,8,6};
	Arrays.sort(arr);
	System.out.println("sorted array:");
	System.out.print("{ ");
	for(i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}System.out.print(" }");
	System.out.println();
	System.out.println("sorted string:"+Arrays.toString(arr));
}
}
class demo{
	public static void main(String[] args){
		SortArray on=new SortArray();
		on.Opertaion();
	}
}
