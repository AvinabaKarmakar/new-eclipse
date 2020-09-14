package concat;

import java.util.Arrays;

public class Concat {
int A[],B[],i,arr[];
public void Operation(){
	A=new int[]{1,5,6,7,8,10};
	B=new int[]{2,4,9};
	arr=new int[A.length+B.length];
	System.arraycopy(A,0,arr,0,A.length);
	System.arraycopy(B,0, arr, A.length, B.length);
	System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);
	for(i=0;i<A.length;i++){
		System.out.println("A["+i+"]= "+arr[i]);
	}int j=0;
	for(i=A.length;i<A.length+B.length;i++){
		
		System.out.println("B["+j+"]= "+arr[i]);
	j++;
	}
}
}
class Demo{
	public static void main(String args[]){
		Concat obj=new Concat();
		obj.Operation();
	}
}
