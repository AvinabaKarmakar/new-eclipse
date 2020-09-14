package table.java;
import java.util.*;

public class MultiTable {
int n,i=0,z=0;
public void showData(){
	Scanner s=new Scanner(System.in);
	System.out.println("Input:");
	n=s.nextInt();
	s.close();
	for(i=1;i<=10;i++){
		z=n*i;
		System.out.println(n+"x"+i+"= "+z);
	}
}
}
class demo2{
	public static void main(String[] args){
		MultiTable obj=new MultiTable();
		obj.showData();
	}
}
