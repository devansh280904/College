import java.util.*;
public class StackList {
    public static void main(String[] args) {
        {
            ArrayList<String> list=new ArrayList<String>();

            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            list.add("E");
            System.out.println("Current List:"+list);

            Stack<String> stack=new Stack<String>();
            
            stack.push("U");
            stack.push("V");
            stack.push("W");
            stack.push("X");
            stack.push("Y");
            stack.push("Z");

            System.out.println("Current Stack:"+stack);

            // List Operations
            System.out.println("Length of the list: "+list.size());
            System.out.println("List have element C: "+list.contains("C"));
            System.out.println("Index of element D: "+list.indexOf("D"));
            System.out.println("Element at index 2: "+list.get(2));
            System.out.println("Removing C from the list: ");
            list.remove("C");
            System.out.println("New list: "+list);
            System.out.println("");

            // Stack Operations
            System.out.println("Pushing element H to the Stack:");
            stack.push("H");
            System.out.println(stack);
            System.out.println("Top Element of the Stack: "+stack.peek());
            System.out.println("Popping the top element of the stack: "+stack.pop());
            System.out.println("New Stack: "+stack);
        }
    }
    
}
