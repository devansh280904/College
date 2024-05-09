// Parent class
class MO{
    void display(){
        System.out.println("This is the example of method overriding");
    }
}

// Subclass (inheritance)
class hannibal extends MO{
    void display(){
        System.out.println("Hannibal is Played by Anthiny Hopkins");        
    }
}

// Subclass (inheritance)
class Year extends MO{
    void display(){
        System.out.println("First Movie was released in the year 1991");
    }
}

//Main class
  class main{
      public static void main(String[] args){
          MO MethodOverridding= new MO();
          MethodOverridding.display();

          hannibal Hannibal=new hannibal();
          Hannibal.display();

          Year year=new Year();
          year.display();
     }
 }
