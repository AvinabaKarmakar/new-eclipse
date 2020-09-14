package constructor1;

public class Constructor1 {
	String s;
	double amt=0.0;
	Constructor1(){
		s="NULL";
		amt=0.0;
	}
	  Constructor1(String s1,double amt1){
		 this.s=s1;
		 this.amt=amt1;
	 }
	 public void getValue(){
		 System.out.println("Account holder:"+s);
		 System.out.println("Amount"+amt);
	 }
	}
	class Bank{
		public static void main(String[] args){
			Constructor1 obj=new Constructor1();
			Constructor1 obj1=new Constructor1("avinaba",525.0);
			obj.getValue();
			obj1.getValue();
		}

}
