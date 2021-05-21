
//5.Calling constructor of the parent class using super()

class Animal {  
	Animal() {
		System.out.println("animal is created");
	}  
}
  
class Dog extends Animal {  
	Dog() {  
		super();  
		System.out.println("dog is created");  
	}  
}
  
class ParentConstructor {
  
	public static void main(String args[]) {  
		Dog obj = new Dog();  
	}
}  