package Palindrome1.java;

import java.util.Scanner;



public class Palindrome12 {
	 String st;
 public void getData(){
	  Scanner s=new Scanner(System.in);
	  
	  System.out.print("Enter the string:");
	   st=s.nextLine();
	  s.close(); 
	  
 }
 public void showData(){
	  int flag=0;
    char ar[]=st.toCharArray();
	  for(int i=0,j=st.length()-1;i!=j;i++,j--){

				 if(ar[i]!=ar[j]){
				   flag=1;
				  break;
				 }
				 

			  }
		  
		  
	  
	  if(flag==0){
		  System.out.println("palindrome");
	  }
	  else
		  System.out.println("not palindrome");
	  
	  
	  
 }
}
class Demo{
 public static void main(String args[]){
	  Palindrome12 ob=new Palindrome12();
	  ob.getData();
	  ob.showData();
	  
 }
}
 

