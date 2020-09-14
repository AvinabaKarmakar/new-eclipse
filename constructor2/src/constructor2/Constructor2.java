package constructor2;
public class Constructor2 {
	String s;
	double amt=0.0;
	Constructor2(){
		s="NULL";
		amt=0.0;
	}
	 Constructor2(String s1,double amt1){
		 this.s=s1;
		 this.amt=amt1;
	 }
	  void Account(Constructor2 account){
		  this.s=account.s;
		  this.amt=account.amt;
	  }
	 public void getValue(){
		 System.out.println("Account holder:"+s);
		 System.out.println("Amount:"+amt);
	 }
	}
	class Bank{
		public static void main(String[] args){
			Constructor2 obj=new Constructor2();
			Constructor2 obj1=new Constructor2("avinaba",525.0);
			obj.getValue();
			obj1.getValue();
			obj1.Account(obj1);
			obj1.getValue();
		}

}
