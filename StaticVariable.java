//11.create an interface with static final variable
interface Inf1 {
   static final int x = 20;
}
public class StaticVariable implements Inf1{
    public static void main(String args[]){
	Inf1 obj = new StaticVariable();
	System.out.println(obj.x);
    }
}