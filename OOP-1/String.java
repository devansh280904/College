import java.util.*;
public class Strings3 {
    public static void main(String[] args) {
        
        //a. Input a string from standard input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String name = sc.nextLine();

        // b. Input a string from command line argument
      	String argString= args.length > 0 ? args[0] : "";

        // c. Find the length of it.
        System.out.println("Length of the String "+name+":"  +name.length());

        // d. Reverse a string
        StringBuffer ReversedString = new StringBuffer(name);
        System.out.println("Reverse of String "+name+": "+ReversedString.reverse());
     
        // e. Copy a string to another string
        String copy=new String(name);
        System.out.println("Copied String: "+copy);

        // f. Concatenate two strings
        String ConcatenatedString=name+argString;
        System.out.println("Concatenated String: "+name+argString);

        // g. Extract some bytes from string
        byte[]bytes=name.getBytes();
        System.out.println("Extracted Bytes: "+Arrays.toString(bytes));

        // h. Get Substring
        String substring = name.substring(0, name.length()/ 2);
    	  System.out.println("Substring: " + substring);

        // i. Check string starts and ends with particular string
        System.out.println("Starts with 'd': " + name.startsWith("d"));
    	  System.out.println("Ends with 'e': " + name.endsWith("e"));

        // j. Convert any data type object/variable to string
        int num=289;
        String convert=Integer.toString(num);
        System.out.println("Integer "+num+" as String: "+convert);

        // k. Split a string using regular expressions
        String[] split = name.split("\\s+");
    	  System.out.println("Split String: " + Arrays.toString(split));

        // l. Replace string with other
        String replaced=name.replace('D','R');
        System.out.println("Replaced String:"+replaced);

        // m. Find the indexes of a string in another string
        int index=name.indexOf('v');
        System.out.println("Index: "+index);

        // n. Convert string to other types (byte and character array)
        byte[] byteArray = name.getBytes();
        char[] charArray = name.toCharArray();
        System.out.println("Byte array: " + Arrays.toString(byteArray));
        System.out.println("Char array: " + Arrays.toString(charArray));

        // o. Convert into uppercase and lowercase
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

        // p. Check the equality of two strings (with and without consideration of case)
        System.out.println("Strings are Equals: " + name.equals(argString));
        System.out.println("Strings are Equals(ignore case): " + name.equalsIgnoreCase(argString));

        // q. Print the hashcode of string
        System.out.println("Hashcode: " + name.hashCode());
    }
}
