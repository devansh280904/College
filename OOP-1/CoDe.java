// Write a program to demonstrate the use of constructor (with and without parameter) and destructor.

class CoDe {

    // Constructor without any Parameters
	CoDe() {
    	  System.out.println("Constructor without any Parameters:");
        System.out.println("Hannibal is a Doctor.");
    }
    
    // Constructor with One Parameter
	CoDe(String Character) {
        System.out.println("Constructor with One Parameter: ");
        System.out.println(Character);
    }

    // Destructor using finalize() Method
    public void finalize(){
        System.out.println("Hannibal is Destroyed");

    }
    public static void main(String[] args) {
      	CoDe O= new CoDe();
    	  CoDe O1 = new CoDe("He is From the Movie Red Dragon.");

        // Object Destroyer
    	  O = null;
    	  O1 = null;

        //garbage collection to call the finalize method (destructor)
      	System.gc();
	}
}
