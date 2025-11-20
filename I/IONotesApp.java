import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class  IONotesApp{

    private  static final String fileName = "Mynotes.txt";

 public static void showMenu(boolean running){

    
  
     System.out.println("1 : for create a new note");
     System.out.println("2 : for read a note");
     System.out.println("3 : Exit");
 
}
     public static void main (String []args){

        Scanner scanner = new Scanner(System.in);
        
        boolean running = true;
  System.out.println("Welcome to the File I/O Notes App!");

         
         
         
         
         while (true) {
            showMenu(running);
            int choice = Integer.parseInt(scanner.nextLine());
         
         switch(choice){
            case 1:
            System.out.println("Add a note:");
            String newNote = scanner.nextLine();
            createNote(newNote);
           break ;

            case 2 :
             System.out.println("Read a note:");
             readNote();
               break ;

            case 3 :
                 System.out.println("Thanks for   using the app ");
                    running = false;
                    scanner.close();
                    break ;

           default :
                    System.out.println("Invalid choice. Please try again.");
                    break ;
         }
        }
     }

    private static void createNote(String newNote) {
       try {
          FileWriter writer = new  FileWriter (fileName, true);
          writer.write(newNote + "\n");
            writer.close();
            System.out.println("Note added successfully.");
       }
            catch (IOException e) {
            System.out.println("An error occurred while writing the note.");
            }
       }
    


    private static void readNote() {
      try{  
        
       // FileReader reader = new FileReader(fileName) ;
        // Scanner fileScanner = new Scanner(file);
        // while (fileScanner.hasNext()) {
        //     String note = fileScanner.next();
        //     System.out.println(note);  // printing file words by words intead character by character
            
        // }
        
        String fullNote = Files.readString(Path.of(fileName));
        System.out.println("Your notes:");
        System.out.println(fullNote);
        }

          catch (IOException e) {
            System.out.println("An error occurred while reading the note.");
        
    }

    }
}
