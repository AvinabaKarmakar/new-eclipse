package pattern.java;

public class Pattern {
String arr[];
int i;
public void face(){
	arr=new String[5];
	arr[0]="+\"\"\"\"\"+";
	arr[1]="[|o o|]";
	arr[2]="|  ^  |";
	arr[3]="| '_' |";
	arr[4]="+_____+";
	for(i=0;i<5;i++){
		System.out.println(arr[i]);
	}
	
	
}
}
class Demo3{
	public static void main(String[] args){
		Pattern obj=new Pattern();
		obj.face();
	}
}
