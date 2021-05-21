//Try to call the constructor multiple times with the same object

class A  {

	A(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		int x = 10;
		while(x > 0)
		{
			A obj = new A(x--);
			
		}
	}
}