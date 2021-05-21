/*7.Create an interface and inherit it from the other interface.*/

interface Interface1 {

   public void method1();

}

interface Interface2 extends Interface1 {

   public void method2();
}

public class InterImplement implements Interface2 {
   
    public void method1() {
	System.out.println("method1");
    }

    public void method2() {
	System.out.println("method2");
    }
    public static void main(String args[]){
	Interface2 obj = new InterImplement();
	obj.method2();
        obj.method1();
    }
}