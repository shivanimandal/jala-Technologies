
//1.Printing the fields/instance members of the current class using this and without using object

class Student {
  
	int rollno;  
	String name;  
	float fee;
  
	Student(int rollno,String name,float fee) {  
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;  
	}  
	void display()	{	
		System.out.println(rollno+" "+name+" "+fee);
	}  
}  
  
class TestThis {  
	public static void main(String args[])	{  

	Student obj1 = new Student(111,"rekha",5500);  
	Student obj2 = new Student(112,"vishnu",6600);  
	obj1.display();  
	obj2.display(); 
 
	}
}  