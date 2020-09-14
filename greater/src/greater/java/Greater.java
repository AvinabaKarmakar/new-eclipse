package greater.java;

public class Greater {
   int n1,n2,n3;
   Greater(int x,int y,int z){
	   n1=x;
	   n2=y;
	   n3=z;
	   
   }
   public void showData(){
	   if(n1>n2 && n1>n3){
		   System.out.println(n1+"is greater");
	   }
	   else if(n2>n1 && n2>n3){
		   System.out.println(n2+"is greater");
	   }
	   else 
		   System.out.println(n3+"is greater");
   }
}
class Demo{
	public static void main(String[] args){
		Greater obj=new Greater(20,70,50);
		obj.showData();
	}
}
