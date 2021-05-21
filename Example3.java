/*two methods with the same name and same number of parameters of same type
and call from main method*/

class Method {
 
    public void myMethod(String name, int id)
    {
 
        System.out.println("Name :" + name + " " + "Id :" + id);
    }
 
    public void myMethod(int id, String name)
    {
 
        System.out.println("Id :" + id + " " + "Name :" + name);
    }
}
 
class Example3 {
    public static void main(String[] args)
    {
 
        Method obj = new Method();
 
        obj.myMethod("Kajal", 101);
        obj.myMethod("Praveen", 102);
    }
}