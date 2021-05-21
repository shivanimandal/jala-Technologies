/*8. Create a PUBLIC interface with fields and methods, fields should have values assigned.
Implement this interface to some class and print the values of the interface fields and
call the interface methods*/

// interface inf1 is declared in Inf1.java file

public class Demo implements Inf1{
    public void method1(){
	System.out.println("method1");
    }
    public static void main(String args[]){
	Inf1 obj = new Demo();
	obj.method1();
        System.out.println(obj.num);
    }
}