package com.java.oops;

//encapsulation
public class Person {

		    // Private fields
		    private String name;
		    private int age;

		    // Public getter method for name
		    public String getName() {
		        return name;
		    }

		    // Public setter method for name
		    public void setName(String name) {
		        this.name = name;
		    }

		    // Public getter method for age
		    public int getAge() {
		        return age;
		    }

		    // Public setter method for age
		    public void setAge(int age) {
		        if (age > 0) {
		            this.age = age;
		        } else {
		            System.out.println("Age cannot be negative or zero");
		        }
		    }

		    public static void main(String[] args) {
		        Person person = new Person();
		        person.setName("John Doe");
		        person.setAge(30);

		        System.out.println("Name: " + person.getName());  // Output: Name: John Doe
		        System.out.println("Age: " + person.getAge());    // Output: Age: 30

		        person.setAge(-5); // Output: Age cannot be negative or zero
		    }
	

}
//Private Fields: name and age are private fields, meaning they cannot be accessed directly from outside the class.
//Public Getter and Setter Methods: Methods getName, setName, getAge, and setAge are public, providing controlled access to the private fields.
//Validation in Setter Method: The setAge method includes validation to ensure that the age is not set to a negative value, demonstrating encapsulation's role in maintaining data integrity.