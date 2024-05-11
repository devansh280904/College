
class Hannibal {
    // Public
    public String name="Hannibal";

    // Private
    private String awards ="1 oscar";

    //Protected
    protected String Actor="Anthony Hopkins";

    // Default
    int movies=3;

    public void display(){
        System.out.println("Accessing Modifiers Within the class:");
        System.out.println("Character Name:"+name);
        System.out.println("Awards:"+awards);
        System.out.println("Actor Name:"+Actor);
        System.out.println("Total Movies:"+movies);
    }
}
public class VisibilityModifier{
    public static void main(String[] args) {
        Hannibal vm=new Hannibal();
        vm.display();

        System.out.println("Accessing Modifiers outside the class:");
        System.out.println("Character Name:"+vm.name);
        System.out.println("Actor Name:"+vm.Actor);
        System.out.println("Total Movies:"+vm.movies);
        
        //Awards is a Private Variable cannot be accessed from outside the class
        
    }
}
