package count;


public class Count {

public static void main(String[] args){
	int c1=0,c2=0,c3=0,c4=0;
	String a="dg54 hudwhiuw 52545 ???][";
	char arr[]=a.toCharArray();
	for(int i=0;i<arr.length;i++){
		if(Character.isDigit(arr[i])){
			c1++;
		}
		else if(Character.isLetter(arr[i])){
			c2++;
		}
		else if(Character.isWhitespace(arr[i])){
			c3++;
		}
		else
		{
			c4++;
		}
	}
	System.out.println("No of digits:"+c1);
	System.out.println("No of letter:"+c2);
	System.out.println("No of space:"+c3);
	System.out.println("others:"+c4);
	
}
}
