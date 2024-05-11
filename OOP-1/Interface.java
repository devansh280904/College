//Interface
interface hannibal {
    void name();
    void movie();
}

// Implementing the Character interface
class Character implements hannibal{
    public void name(){
        System.out.println("Full name is hannibal lector");
    }
    
    public void movie(){
        System.out.println("There are total 3 movies");
    }
}

// Implementing the about interface
class about implements hannibal{
    public void name(){
        System.out.println("Hannibal lector was a forensic psychiatrist");
    }

    public void movie(){
        System.out.println("Anthony Hopkins won Oscar for this role");
    }
}

//Main class
public class Interface {
    public static void main(String[] args) {

        //Calling name and movie methods from Character
        Character character=new Character();
        System.out.println("Character Information:");
        character.name();
        character.movie();

        //Calling name and movie methods from about
        System.out.println("Facts about the movies:");
        about About=new about();
        About.name();
        About.movie();
    } 
}
