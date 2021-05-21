//12. Converting Numbers to Strings with valueOf()

class StringValueOf {
  public static void main(String args[])
  {
    int a = 1234456;
    String str = String.valueOf(a);
    System.out.println("String str = " + str);
    System.out.println("str type of vatiable : "+str.getClass().getName());
  }
}