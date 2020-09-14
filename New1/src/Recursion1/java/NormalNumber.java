package Recursion1.java;

public class NormalNumber {
	static int Number(int n){//after main method execution starts from here...
		if(n>100)// check whether the given condition is true or false..if true then proceed next step otherwise it goes the print function
			return 0;//the given parameter is greater than 10 it breaks and return 0..
			System.out.print(n+" ");//1 2 3 4 5 6 7 8 9 10
			return Number(n+2);// call the method itself increment by 1 and go to Number method then again execute the following step
			
		
	}
	public static void main(String[] args){
		NormalNumber.Number(1);// calling the Number method...execution starts from the main method
	}

}
