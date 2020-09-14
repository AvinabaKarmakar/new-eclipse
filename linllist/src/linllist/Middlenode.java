package linllist;
import java.util.*;
public class Middlenode {
	List<Integer> list=new LinkedList<>();
	public void getValue(){
		int k;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of the list: ");
			int n=sc.nextInt();
			System.out.println("Enter the value t: ");
		//int[] arr=new int[n];
			for(int i=0;i<n;i++){
				 k=sc.nextInt();
				list.add(k);
			}
			System.out.println(list);
	}
	public void Find() {
		List<Integer> list1=new LinkedList<>();
		int l;
		int m=list.size();
		//int arr[]=new int[m];
		if(m%2==1){
			l=(m+1)/2;
		}
		else 
		{
			l=m/2+1;
		}
		System.out.println("middle of the list: ");
		System.out.println(list.get(l-1));
		for(int p=l-1;p<m;p++){
			int s=list.get(p);
			list1.add(s);
		}
		System.out.println(list1);
	}	
}
class Demo{
	public static void main(String args[]){
		Middlenode obj=new Middlenode();
		obj.getValue();
		obj.Find();
	}
}
