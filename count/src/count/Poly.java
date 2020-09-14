package count;

 class Poly {
 int a,b;
  Poly(int i,int j){
	 this.a=i;
	 this.b=j;
 }
  Poly(){
	 a=20;
	 b=30;
 }
 public int Area(int a,int b){
	 return (a*b);
 }
 public int Area(int a){
	 return (a*a);
 }
}
class Demo{
	public static void main(String[] args ){
		Poly obj1=new Poly();
		Poly obj2=new Poly(2,3);
		System.out.println(obj1.Area(15,20));
		System.out.println(obj2.Area(5));
		
	}
}