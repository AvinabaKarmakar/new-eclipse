package Prime.java;
import java.util.*;



public class Prime {
	  int i,k,j;
	  public void getData(){
      for(int i=1;i<=1000;i++)
      {
          k=0;
          for(int j=2;j<i;j++)
          {
              if(i%j==0)
              {
                  k=1;
                  break;
              }
          }
          if(k==0)
          {
              System.out.print(i+" ");
          }
      }
	}
}	  


class Demo{
	public static void main(String args[]){
		Prime obj=new Prime();
		obj.getData();
		
	}
}