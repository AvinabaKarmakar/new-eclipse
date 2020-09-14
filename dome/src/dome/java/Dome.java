package dome.java;
import java.util.*;

public class Dome {
int x,y;
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	Dome obj=new Dome();
	Dome obj1=new Dome();
	obj.x=s.nextInt();
	obj1.y=s.nextInt();
	s.close();
	if(obj.x==obj1.y)
		System.out.println("match");
	
	else
		System.out.println("not match");
	
	
}
}
