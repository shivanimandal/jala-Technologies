import java.io.*;

class ScientificCalculator extends Calculate
{
	char opera;
	Double dblNumber = new Double(0);

	ScientificCalculator()
	{
	}
	
	ScientificCalculator(double dblNumber, char opera)
	{
		super(dblNumber, opera);
		this.opera = opera;
		this.dblNumber=dblNumber;
	}
	
	public void Calc() throws java.io.IOException
	{
		boolean nt;
		
		do
		{
			Double d = new Double(0);

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter the Operation (Sine-s, Cosine-c, Tangent-t, Log-l):");
			System.out.flush();
			String opt = buffer.readLine();

			System.out.println("Enter a Value Please: ");
			System.out.flush();
		
			try
			{
				d = Double.valueOf(buffer.readLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println("Provide Numeric Values Only.");
				System.exit(0);
			}
			if(opt.length()==1)
			{
				ScientificCalculator sc = new ScientificCalculator(d,opt.charAt(0));
				sc.doCalculation();
				sc.getResult();
			}
			else
			{
				System.out.println("Invalid Operation. Please select any valid options.");
			}
		
			System.out.println("Do You Want to Calculate Again (y/n):");
			System.out.flush();
			char r = (char) buffer.read();
			if((r=='y') || (r=='Y'))
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

