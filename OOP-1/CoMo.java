// Write a program to demonstrate method overloading and constructor overloading.

public class CoMo {
// Constructor overloading

       // Default Constructor
	CoMo() {
    	System.out.println("Default Constructor:");
	}
    
       // Constructor with One Parameter
	CoMo(String Character) {
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
    	CoMo O = new CoMo();
    	CoMo O1 = new CoMo("Hannibal is a movie Character.");

        // Method Overloading Demonstration
    	O.display();
    	O.display("His full name is Hannibal Lecter.");
	}
}
