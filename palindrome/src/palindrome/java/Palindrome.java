package palindrome.java;
import java.util.*;

 public class Palindrome {
	 String st;
  public void getData(){
	  Scanner s=new Scanner(System.in);
	  
	  System.out.print("Enter the string:");
	   st=s.nextLine();
	  s.close(); 
	  
  }
  public void showData(){
	  int flag=0;
	 char[] st1=new char[st.length()];
	  for(int i=0,j=st.length();i!=j;i++,j--){

				  System.out.println(st1[i]);
				  System.out.println(st1[j]);

				   flag=1;
				   break;

			  }
		  
		  
	  
	  if(flag==1){
		  System.out.println("palindrome");
	  }
	  else
		  System.out.println("not palindrome");
	  
	  
	  
  }
}
class Demo{
  public static void main(String args[]){
	  Palindrome ob=new Palindrome();
	  ob.getData();
	  ob.showData();
	  
  }
}
  
  
  

