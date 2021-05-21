class Calculate implements iCalc
{
	private char op;
	private int iNum1, iNum2;
	private Double dblnumber = new Double(0);
	private Double dblResult = new Double(0);
	private int result = 0;
	private boolean typeDouble = false;
	private boolean typeInt = false;
	
	//Default constructor
	public Calculate()
	{
	}

        // constructor for scientific calculation
	public Calculate(Double dblNum, char cOperator)
	{
		dblnumber = dblNum;
		op = cOperator;
		typeDouble = true;
	}

	//Constructor for basic calculations
	public Calculate(int iFirstNum, char cOperator, int iSecondNum) 
	{
		iNum1 = iFirstNum;
		iNum2 = iSecondNum;
		op = cOperator;
		typeInt=true;
	}
	
	//Calculates the result based on the numbers and operator inputted by the user
	public void doCalculation()
	{
		result = 0;
		dblResult = 0.0;
		
		switch(op)
		{
			case '+':
				checkInt();
				result=iNum1+iNum2;
				break;
			case '-':
				checkInt();
				result = iNum1-iNum2;
				break;
			case '*':
				checkInt();
				result = iNum1*iNum2;
				break;
			case '/':
				checkInt();
				if(!checkSecondNum())
				{
					result=iNum1/iNum2;
					break;
				}
			case 'S':
			case 's':
				checkDouble();
				dblResult = Math.sin(dblnumber);
				break;
			case 'C':
			case 'c':
				checkDouble();
				dblResult = Math.cos(dblnumber);
				break;
			case 'T':
			case 't':
				checkDouble();
				dblResult = Math.tan(dblnumber);
				break;
			case 'L':
			case 'l':
				checkDouble();
				dblResult = Math.log(dblnumber);
				break;
			default:
				result=0;
				dblResult = 0.0;
				System.out.println("Invalid Operation. Please select any valid options.");
				break;
		}
	}
	
	//Prints the result of calculation.
	public void getResult()
	{
		if(typeInt)
		{
			System.out.println("The result is: "+result);
		}
		else if(typeDouble)
		{
			System.out.println("The result is : "+dblResult);
		}
	}

	// checks for value 0
	public boolean checkSecondNum()
	{
		if(iNum2 == 0)
		{
			System.out.println("Zero Not allowed");
			System.exit(0);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Checks basic calculation
	public void checkInt()
	{
		if(!typeInt)
		{
			result=0;
			System.out.println("Invalid Operation. Please select any valid options.");
			System.exit(0);
		}
	}
	
	//Checks scientific calculation
	public void checkDouble()
	{
		if(!typeDouble)
		{
			dblResult=0.0;
			System.out.println("Invalid Operation. Please select any valid options.");
			System.exit(0);
		}
	}
}
		
		

	
	
	