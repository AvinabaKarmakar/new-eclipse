package year;
import java.util.*;

public class Year {
	
		 public static void main(String args[])
		    {
		        Scanner s = new Scanner(System.in);
		        System.out.println("Test Data");
		        System.out.print("Input the number of minutes: ");
		        int m = s.nextInt();
		        int minutes = m;
		       s.close();
		        int x = (365*24*60);
		        int years = m /x;
		        m = m % x;
		        
		        int y = (24*60);
		        int days = m / y;
		        m = m % y;
		        System.out.println("Expected Output: ");
		        
		        System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days");
		        
		    }
		

}
