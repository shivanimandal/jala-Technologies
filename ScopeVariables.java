/*5. Define the local and Global variables with the same name and print both variables and
understand the scope of the variables*/

class ScopeVariables
{
	//Instance variables
	int a,b;
	public int method1(int num1, int num2) { //Local Variables
		// local variables
		a = num1;
		b = num2;
		return num1+num2;
	}
	public static void main(String a[]) {
		ScopeVariables obj = new ScopeVariables();
		int result = obj.method1(10,20);
		System.out.println("Sum = "+result);
	}
}