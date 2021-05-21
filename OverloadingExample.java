/*program of two methods with the same name but different number of parameters of different
data type and call the methods from main method*/

class Addition {
 
    // adding three integer values.
    public int add(int a, int b, int c)
    {
 
        int sum = a + b + c;
        return sum;
    }
 
    // adding three double values.
    public double add(double a, double b)
    {
 
        double sum = a + b;
        return sum;
    }
}
 
class OverloadingExample {
    public static void main(String[] args)
    {
 
        Addition ob = new Addition();
 
        int sum1 = ob.add(1, 2, 3);
        System.out.println("sum of the three integer value :" + sum1);
        double sum2 = ob.add(1.0, 2.0);
        System.out.println("sum of the two double value :"+ sum2);
    }
}