//6. Write a program to print even number between 10 and 100 using while

class EvenNumbers
{
	public static void main(String[] args) {
		System.out.println("Even numbers between 10 and 100 are: ");
		int num = 10;
		while(num<=100) {
			if(num%2==0) {
				System.out.print(num+" ");
			}
			num++;
		}
	}
} 