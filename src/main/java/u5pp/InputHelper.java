package u5pp;
import java.util.Scanner;

public class InputHelper {
    private Scanner scanner;
    public InputHelper(Scanner scanner) {
        this.scanner = scanner;
    }

    static boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++) // checks whether the character is a number or not.
            if (Character.isDigit(s.charAt(i)) == false) //if it has a character, return false.
                return false;
 
        return true; // if it doesn't return false, it returns true.
    }

    static boolean check(String s) {
        if (s == null) { // checks if the String is just nothing .-. 
           return false;
        }
        int len = s.length();
        for (int i = 0; i < len; i++) {  // checks whether the character is not a letter.
           if ((Character.isLetter(s.charAt(i)) == false)) { // if it is not a letter, return false.
              return false;
           }
        }
        return true; // gotta return something, right?
     }

    public boolean getYesNoInput(String prompt){
        boolean bruh2 = true;
        boolean confirmed = false;
        String input = "";
        while (bruh2 == true){ // keeps running
            System.out.println(prompt + " " + input); // gives prompt
            input = scanner.nextLine(); // gets next line input
            input = input.replaceAll(" ","");
            input = input.replaceAll("\n",""); // erases all space + indents
            if (input.isEmpty()){ // if empty -> message
                System.out.println("Invalid input - empty line. Please try again.");
            }else{ // if not empty -> get first letter + confirm true
                input = input.substring(0,1);
                confirmed = true;
            }
            if (confirmed == true){ // if confirmed:
                if (input.equalsIgnoreCase("y")){ // if yes, return true
                    return true;
                } else if (input.equalsIgnoreCase("n")){ // if no, return false
                    return false; // if not y/n, return invalid input
                }else{System.out.println("Invalid input - does not start with" + " y " + "or" + " n " + ". Please try again.");}
            }  
            
            
        }
        return false;
    }

    public int getIntegerInput(String prompt, int min, int max){
        boolean isDead = false; 
        boolean confirmed = false;
        int prompt2 = 0;
        while (!isDead){ // just here to keep on running
            System.out.println(prompt);
            prompt = scanner.nextLine(); // gets next line input
            if (prompt.isEmpty()){ // if nothing, error, return confiremd as false (just there to full proof it)
                System.out.println("Invalid input - empty line. Please try again.");
                confirmed = false;
            }
            else if (isNumber(prompt)){ // if it is just a number, make confirmed true, thus letting the bottom if statement run.
                prompt2 = Integer.parseInt(prompt);
                confirmed = true;
            } else{ // if it is nothing above, return false
                System.out.println("Invalid input - not a number. Please try again.");
                confirmed = false;
            }

            if (prompt2 <= max && prompt2 >= min && confirmed == true){ // if it's good, return the number
                return prompt2;
            }
            else if (prompt2 > max && confirmed == true){ // if too high, return a message
                System.out.println("Invalid input - too high. Please try again.");
            }else if (prompt2 < min && confirmed == true){ // if too low, return a message
                System.out.println("Invalid input - too low. Please try again.");
            }
        }
        return -1;
    }
}
