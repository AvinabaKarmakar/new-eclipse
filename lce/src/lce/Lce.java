package lce;

import java.util.Arrays;

public class Lce {
int arr[],i=0;
public void Operation(){
	arr=new int[]{5,2,4,3,19,1,65,7};
	Arrays.sort(arr);
	
	for(i=0;i<arr.length-1;i++){
		
		if(arr[i+1]!=(arr[i]+1)){
			break;//System.out.println(arr[i+1]);
		}
	}
	for(int k=0;k<=i;k++){
		System.out.println(arr[k]);
	}
}
}
class Demo{
	public static void main(String[] args){
		Lce onj=new Lce();
		onj.Operation();
	}
}
