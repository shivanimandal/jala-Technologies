/*1.Write a class with a default constructor, one argument constructor and two argument
constructors. Instantiate the class to call all the constructors of that class from a main
class*/

class StudentDetails {
   
    String name;
    int id;
   
   //default constructor
   StudentDetails() {
  
      System.out.println("Default Constructor");
   }
   
   //one parameterized constructor
   StudentDetails(String name) {
    
         System.out.println("One Parameterised Constructor");
         this.name = name;
   }
   
   //two parameterised constructor
   StudentDetails(String name, int id) {

         System.out.println("Two Parameterised Constructor");
         this.id = id;
         this.name = name;
   }
   
   //method to display the values
   void display() {
    System.out.println(name+" "+id);
   }
   
}

class Student {
   public static void main(String args[]) {
    
      //this would invoke default constructor
      StudentDetails obj1 = new StudentDetails();
  
      //this would invoke one parameterised constructor
      StudentDetails obj2 = new StudentDetails("Sita");

      //this would invoke two parameterised constructor
      StudentDetails obj3 = new StudentDetails("Kajal",1245);

      //display values
      obj1.display();
      obj2.display();
      obj3.display();
  }
}


   