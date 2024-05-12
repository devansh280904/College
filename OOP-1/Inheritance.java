
// Parent class
interface hannibal{
    void display();
}

//single Inheritance: Child class inherits from one parent class
class name implements hannibal{
    public void display(){
        System.out.println("Actor's name is Anthony Hopkins");
    }
}

//Multilevel Inheritance: Child class inherits from a parent class, which itself inherits from another parent class
class year extends name{
    public void display(){
        super.display();
        System.out.println("First Movie was released in the year 1991");
    }
}

//Hierarchical Inheritance:Multiple child classes inherit from a single parent class
class Genre extends year{
    public void display(){
        super.display();
        System.out.println("Genre of this movies are thriller");
    }

}

//Parent class
interface movie{
    default void display(){
        System.out.println("Total 3 movies");
    }
}

//Multiple Inheritance:Child class inherits from multiple parent classes using interface
class moviename extends name implements movie{
    public void display()
    {
        super.display();
        System.out.println("One of the movie name is Red dragon");
    }
}

//Hybrid Inheritance: Combination of multiple types of inheritance
class awards extends name{
    public void display(){
        super.display();
        System.out.println("Oscar for best lead Actor");
        System.out.println("");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //Single Inheritance
        name Name= new name();
        Name.display();

        // Multilevel Inheritance
        year Year=new year();
        Year.display();
        
        //Multiple Inheritance
        moviename MovieName= new moviename();
        MovieName.display();

        //Hierarchical Inheritance
        Genre genre=new Genre();
        genre.display();

        //Hybrid Inheritance
        awards Awards=new awards();
        Awards.display();

    }
}
