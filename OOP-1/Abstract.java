// Abstract class
abstract class food{ 
    abstract void foodchain();
    abstract void origin();
}

//Subclass pizza Extending abstract class food
class pizza extends food{
    void foodchain(){
        System.out.println("Famous Foodchain: Domino's and Pizza Hut");
    }
    void origin(){
        System.out.println("Origin: Pizza was invented in Naple,Italy");
    }
}

//Subclass taco Extending abstract class food
class taco extends food{
    void foodchain(){
        System.out.println("Famous Foodchain: Taco bell");
    }
    void origin(){
        System.out.println("Origin: Taco was invented in Mexico");
    }
}

//Main class
public class Abstract {
    public static void main(String[] args) {
        System.out.println("Facts about Pizza:");
        pizza Pizza=new pizza();
        Pizza.foodchain();
        Pizza.origin();

        System.out.println("Facts about Tacos:");
        taco Taco=new taco();
        Taco.foodchain();
        Taco.origin();
    }
}
