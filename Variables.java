/*10.Create an interface with private, public and protected fields.*/

interface Inf1 {
   public int x = 10;
   private int y = 20;
   protected int z = 30;
}
public class Variables implements Inf1{
    public static void main(String args[]){
	//Inf1 obj = new Variables();
	System.out.println(Inf1.x);
        System.out.println(Inf1.y);
        System.out.println(Inf1.z);
    }
}