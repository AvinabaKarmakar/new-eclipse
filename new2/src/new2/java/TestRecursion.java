package new2.java;

class TestRecursion { 
    static void printFun(int test) 
    { 
        if (test < 1) 
            return; 
        else { 
            
             // statement 2 
            System.out.print(test+" ");
            printFun(test - 1);
            return; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int test = 3; 
        printFun(test); 
    } 
} 
  
