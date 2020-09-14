package pattern2;

import java.util.Scanner;

public class Patterns2 {

	int i,j,n,arr[][],count;
	public void Operation(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms you want to print:");
		n=sc.nextInt();
		arr=new int[n][n];
		//System.out.print(" ");
		for(i=0;i<n;i++){
			for(j=n-1;j>i;j--){
				System.out.print(" ");
			}
			for(j=0;j<i;j++){
				System.out.print("*");
			}
		
			for(j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(i=n;i>0;i--){
			for(j=i-1;j<n;j++){
				System.out.print(" ");
			}
			for(j=i-2;j>0;j--){
				System.out.print("*");
			}
		
			for(j=i-2;j>=0;j--){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	}
	class deno{
		public static void main(String[] args){
			Patterns2 noj=new Patterns2();
			noj.Operation();
		}
	}
