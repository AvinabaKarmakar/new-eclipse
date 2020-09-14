package doublestring;
import java.util.*;
public class DoubleString {
String s;
int i,j;
char[] arr;
public void Check(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:");
	s=sc.nextLine();
	arr=s.toCharArray();
	Arrays.sort(arr);
    List<Character> list=new ArrayList<>();
    List<Character> list1=new ArrayList<>();
  //  List<Character> list2=new ArrayList<>();
    System.out.println("Duplicate values are:");
    for(i=0;i<arr.length;i++){
    	if(list.contains(arr[i])==false){
    		list.add(arr[i]);
    	}
    	else if(list1.contains(arr[i])==false)
    		list1.add(arr[i]);
    }
	
    System.out.println(list1);
}
}
class dsemo{
	public static void main(String[] args){
		DoubleString obj=new DoubleString();
		obj.Check();
	}
}