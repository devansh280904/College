import java.io.File;
import java.util.Scanner;

public class ioFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of File:");
        String Name = sc.nextLine();
    	  File file = new File(Name);{
            if(file.exists()){

                // Print file properties
                System.out.println("File name: " + file.getName());
                System.out.println("Absolute path: " + file.getAbsolutePath());
                System.out.println("Size: " + file.length() + " bytes");
                
                // Check if the file is readable, writable, and executable
                System.out.println("Readable: " + file.canRead());
                System.out.println("Writable: " + file.canWrite());
                System.out.println("Executable: " + file.canExecute());

                // Check if the file is a directory or a regular file
                System.out.println("Is Directory: " + file.isDirectory());
                System.out.println("Is File: " + file.isFile());

                // Print last modified timestamp
                System.out.println("Last Modified: " + file.lastModified());

            } else {
                System.out.println("File does not exist.");
            }
            sc.close();
        }
    } 
}
    
