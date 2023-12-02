package java_fundamentals;

public class FundamentalExample {
	//Define a simple class called 'Person'
	class Person {
	 // Fields or attributes
	 String name;
	 int age;

	 // Constructor with parameters
	 public Person(String name, int age) {
	     this.name = name;
	     this.age = age;
	 }

	 // Method to display information about the person
	 public void displayInfo() {
	     System.out.println("Name: " + name);
	     System.out.println("Age: " + age);
	 }
	}


		public static void main(String[] args) {
	        // Creating objects (instances) of the 'Person' class
	        Person person1 = new Person("MADHU", 22);
	        Person person2 = new Person("SUDHAN", 23);

	        // Accessing fields and methods using objects
	        System.out.println("Information about person1:");
	        person1.displayInfo();

	        System.out.println("\nInformation about person2:");
	        person2.displayInfo();
	    }
	}
}


