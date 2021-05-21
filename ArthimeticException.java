//Write a program to generate Arithmetic Exception

public class ArthimeticException {  
  
    public static void main(String[] args) {  
        try  
        {  
        int data=100/0; //may throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println("Can't divide by zero");  
        }  
          
    }  
      
}  