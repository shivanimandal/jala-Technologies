import java.io.*;

class UseCalculator
{
	public static void main(String args[]) throws java.io.IOException
	{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Choose the Calculator: Basic-B or Scientific-S.");
		System.out.flush();
		String opt = buffer.readLine();
	
		if(opt.length() == 1)
		{
			if(opt.equals("B") || opt.equals("b"))
			{
				Calculator c = new Calculator();
				c.Calc();
			}
			else if(opt.equals("S") || opt.equals("s"))
			{
				ScientificCalculator sc = new ScientificCalculator();
				sc.Calc();
			}
			else
			{
				System.out.println("Enter option 'B' or 'S' Please.");
			}
		}
		else
		{
			System.out.println("Enter option 'B' or 'S' Please.");
		}
	}
}

