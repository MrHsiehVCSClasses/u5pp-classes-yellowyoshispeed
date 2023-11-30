package u5pp;
import java.util.Scanner;

public class InputHelper {
    private Scanner scanner;
    public InputHelper(Scanner scanner) {
        this.scanner = scanner;
    }

    static boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == false)
                return false;
 
        return true;
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
        while (bruh2 == true){
            System.out.println(prompt + " " + input);
            input = scanner.nextLine();
            input = input.replaceAll(" ","");
            input = input.replaceAll("\n","");
            if (input.isEmpty()){
                System.out.println("Invalid input - empty line. Please try again.");
            }else{
                input = input.substring(0,1);
                confirmed = true;
            }
            if (confirmed == true){
                if (input.equalsIgnoreCase("y")){
                    return true;
                } else if (input.equalsIgnoreCase("n")){
                    return false;
                }else{System.out.println("Invalid input - does not start with" + " y " + "or" + " n " + ". Please try again.");}
            }  
            
            
        }
        return false;
    }

    public int getIntegerInput(String prompt, int min, int max){
        boolean isDead = false;
        boolean confirmed = false;
        int prompt2 = 0;
        while (!isDead){
            System.out.println(prompt);
            prompt = scanner.nextLine();
            if (prompt.isEmpty()){
                System.out.println("Invalid input - empty line. Please try again.");
                confirmed = false;
            }
            else if (isNumber(prompt)){
                prompt2 = Integer.parseInt(prompt);
                confirmed = true;
            } else{
                System.out.println("Invalid input - not a number. Please try again.");
                confirmed = false;
            }

            if (prompt2 <= max && prompt2 >= min && confirmed == true){
                return prompt2;
            }
            else if (prompt2 > max && confirmed == true){
                System.out.println("Invalid input - too high. Please try again.");
            }else if (prompt2 < min && confirmed == true){
                System.out.println("Invalid input - too low. Please try again.");
            }
        }
        return -1;
    }
}
