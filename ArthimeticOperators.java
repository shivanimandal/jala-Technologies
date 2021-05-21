//1. Write a function for arithmetic operators(+,-,*,/)

class ArthimeticOperators
{
	public void operation(int a,int b) {
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
		System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
		System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
		System.out.println("Division of "+a+" and "+b+" is "+(a/b));
	}
	public static void main(String a[]) {
		ArthimeticOperators obj = new ArthimeticOperators();
		obj.operation(10,2);
	}
}