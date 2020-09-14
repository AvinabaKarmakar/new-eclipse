package pattern1;
import java.util.*;

public class Pattern1 {
int i,j,n,arr[][],count;
public void Operation(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of terms you want to print:");
	n=sc.nextInt();
	arr=new int[n][n];
	
	for(i=0;i<n;i++){
		count=1;
		for(j=0;j<=i;j++){
			arr[i][j]=count;
			count++;
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
class deno{
	public static void main(String[] args){
		Pattern1 noj=new Pattern1();
		noj.Operation();
	}
}