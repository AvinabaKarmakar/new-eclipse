package duplicate;
import java.util.*;

public class Remove {
int arr[],i=0,j,n;
public void getData(){
	Scanner sc=new Scanner(System.in);
	System.out.println("no of terms you want to input:");
	n=sc.nextInt();
	arr=new int[n];
	for(j=0;j<n;j++){
		arr[j]=sc.nextInt();
	}
	sc.close();
}
public void Operation(){
	Arrays.sort(arr);
	
	for(i=0;i<arr.length;i++){
		for(j=i+1;j<arr.length;j++){
			if(arr[i]==arr[j] && arr[i]!=arr[i-1]){
				System.out.println(arr[i]);
			}
		}
	}
	
}

}
class Test{
	public static void main(String[] args){
		Remove r=new Remove();
		r.getData();
		r.Operation();
	}
}