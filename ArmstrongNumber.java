//8. Write a program to find Armstrong number or not

import java.util.Scanner;
class ArmstrongNumber
{
  public static void main(String args[])
  {
    int sum = 0, t, rem, digits = 0;
 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number to check:");    
    int n = in.nextInt();
    t = n;
    // Count number of digits

    while (t != 0) {
      digits++;
      t = t/10;
    }
 
    t = n;
 
    while (t != 0) {
      rem = t%10;
      sum = sum + power(rem, digits);
      t = t/10;
    }
 
    if (n == sum)
      System.out.println(n + " is an Armstrong number.");
    else
      System.out.println(n + " isn't an Armstrong number.");
  }

  static int power(int n, int r) {
    int c, p = 1;
    for (c = 1; c <= r; c++) {
      p = p*n;
    }
    return p;
  }
}