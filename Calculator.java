import java.io.*;

class Calculator
{
	public void Calc() throws java.io.IOException
	{
		boolean nt;
		
		do
		{
			Integer firstNumber = new Integer(0);
			Integer secondNumber = new Integer(0);
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter First Number Please : ");
			System.out.flush();
	
			try
			{
				firstNumber = Integer.parseInt(buffer.readLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println("Provide Numeric Values Only.");
				System.exit(0);
			}
			
			System.out.println("Please enter the Operation (Add: +, Minus: -, Product: *, Divide: /):");
			System.out.flush();
			String opt = buffer.readLine();

			System.out.println("Enter Second Number Please : ");
			System.out.flush();

			try
			{
				secondNumber = Integer.parseInt(buffer.readLine(),10);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Provide Numeric values Only.");
				System.exit(0);
			}
			if(opt.length()==1)
			{
				Calculate c = new Calculate(firstNumber, opt.charAt(0), secondNumber);
				c.doCalculation();
				c.getResult();
			}
			else
			{
				System.out.println("Invalid Operation. Please select any valid options.");
			}
			
			System.out.println("Do You Want to Calculate Again (y/n):");
			System.out.flush();
			char res = (char) buffer.read();
			if((res=='y') || (res=='Y'))
			{
				nt = false;
			}
			else
			{
				nt = true;
			}
		}while(!nt);
	}
}