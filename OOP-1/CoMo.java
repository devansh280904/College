// Write a program to demonstrate method overloading and constructor overloading.

public class Hannibal {
	// Constructor overloading

    // Default Constructor
	Hannibal() {
    	System.out.println("Default Constructor:");
	}
    
    // Constructor with One Parameter
	Hannibal(String Character) {
        System.out.println("Constructor with One Parameter: "+Character);
	}


	// Method overloading

    // Default Method
	public void display() {
    	System.out.println("Method with no Parameters: ");
	}

    // Method with one Parameter
	void display(String Character) {
    	System.out.println("Method with one Parameter: "+Character);
	}

	public static void main(String[] args) {
        // Constructor Overloading Demonstration
    	Hannibal O = new Hannibal();
    	Hannibal O1 = new Hannibal("Hannibal is a movie Character.");

        // Method Overloading Demonstration
    	O.display();
    	O.display("His full name is Hannibal Lecter.");
	}
}
