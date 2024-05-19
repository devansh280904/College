// Interface 
interface animal{
    void display();
}

// subclass cat inheriting from interface animal(Single Inheritance)
class cat implements animal{
    public void display(){
        System.out.println("Cats are animals.");
    }
}

// subclass tiger inheriting from another subclass cat which itself inhertates from interface animal (Multilevel Inheritance)
class tiger extends cat{
    public void display(){
        super.display();
        System.out.println("Tigers are cats.");
    }
}

// Another parent class for Multiple inheritance
class Wildanimal{
    public void display(){
        System.out.println("Wildanimals are dangerous animal");
    }
}

// subclass bears inheriting from parent class wildanimal 
//first inheritance for Hierarchial inheritance
class bears extends Wildanimal{
    public void display(){
        System.out.println("Bears are wild animal.");  
    }
}

// subclass dog inheriting from parent class wildanimal
//second inheritance for Hierarchial inheritance
class dog extends Wildanimal{
    public void display(){
        System.out.println("Dogs are not animal.");
    }
}


//subclass lion inheritates from parent class wildanimal and interface animal
class lion extends Wildanimal implements animal{
    public void display(){
        System.out.println("Lion is a wild animal.");
    }
}

//Interface petanimals for hybrid inheritance
interface petanimals {
    void display();
}

// 1st inheritance for hybrid inheritance
interface rabbit extends petanimals{
    void display();
}

// 2nd inheritance for hybrid inheritance
interface  turtle extends petanimals{
    void display();
    }
    
// Inheritance from two other inheritance turtle and rabbit
class pets implements rabbit,turtle{
    public void display(){
        System.out.println("Both rabbits and cats can be pets.");
    }
} 

public class Inheritance1{
    public static void main(String[]args){
        System.out.println("Single inheritance");
        cat Cat=new cat();
        Cat.display();
        System.out.println("");
                
        System.out.println("Multilevel Inheritance:");
        tiger Tiger=new tiger();
        Tiger.display();
        
        System.out.println("");
        System.out.println("Hierarchial inheritance:");
        bears Bears=new bears();
        Bears.display();
        dog Dog=new dog();
        Dog.display();
        
        System.out.println("");
        System.out.println("Multiple inheritance:");
        lion Lion=new lion();
        Lion.display();
        
        System.out.println("");
        System.out.println("Hybrid inheritance:");
        pets Pets=new pets();
        Pets.display();
    }
}
