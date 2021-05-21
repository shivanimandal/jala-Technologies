//2. Write a method for increment and decrement operators(++, --)

class IncreDecrement
{
	public void increment(int a) {
		int x = a;
		System.out.println("Post Increment of "+a+" is "+(a++));
		System.out.println("Pre Increment of "+x+" is "+(++x));
	}
	
	public void decrement(int b) {
		int y = b;
		System.out.println("Post Decrement of "+b+" is "+(b--));
		System.out.println("Pre Decrement of "+y+" is "+(--y));
	}
	public static void main(String a[]) {
		IncreDecrement obj = new IncreDecrement();
		obj.increment(10);
		obj.decrement(20);
	}
}