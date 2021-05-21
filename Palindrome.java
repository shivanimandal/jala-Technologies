//10. Write a program to palindrome or not.

import java.util.*;
class Palindrome {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n, reverse = 0, rem;
    System.out.print("Enter a number to be checked: ");
    n = sc.nextInt();
    int m = n;
    
    // get the reverse of m
    while (n != 0) {
      rem = n % 10;
      reverse = reverse * 10 + rem;
      n = n / 10;
    }
    
    // checking reverse and m are equal
    if (m == reverse) {
      System.out.println(m + " is Palindrome");
    } else {
      System.out.println(m + " is not Palindrome");
    }
  }
}