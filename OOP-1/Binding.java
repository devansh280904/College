// Parent class
class food{
        // Static method
        static void StaticBinding(){
            System.out.println("This is Static Binding in parent class food");
        }
        // Dynamic method
        void DynamicBinding(){
            System.out.println("This is Dynamic Binding in parent class food");
        }
}

// Subclass 
class taco extends food{
    // Static method
    static void StaticBinding(){
        System.out.println("This is static Binding in subclass taco");
    }
    // Dynamic method overriding
    void DynamicBinding(){
        System.out.println("This is Dynamic Binding in subclass taco");
    }
}

//Main class
public class Binding {
    public static void main(String[] args) {
        System.out.println("Static And Dynamic Binding In Parent class Food:");
        //Static Binding
        food.StaticBinding();

        //Dynamic Binding
        food Food=new food();
        Food.DynamicBinding();

        System.out.println("Static And Dynamic Binding In Subclass Taco:");
        //Static Binding
        taco.StaticBinding();

        //Dynamic Binding
        taco Taco=new taco();
        Taco.DynamicBinding();
    }
}
