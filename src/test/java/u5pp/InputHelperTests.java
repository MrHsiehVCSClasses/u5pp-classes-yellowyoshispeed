package u5pp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static com.github.stefanbirkner.systemlambda.SystemLambda.*;


import java.util.Scanner;

public class InputHelperTests {

    private String prompt = "this is a prompt";
    private final int MIN = 5;
    private final int MAX = 10;

    /* getYesNoInput tests */

    @Test
    public void getYesNoInput_correctInput_returnsCorrectly() {
        Scanner sc = new Scanner("y\n");
        InputHelper ih = new InputHelper(sc);
        assertTrue(ih.getYesNoInput(prompt));
        sc.close();

        sc = new Scanner("Yes\n");
        ih = new InputHelper(sc);
        assertTrue(ih.getYesNoInput(prompt));
        sc.close();

        sc = new Scanner("n\n");
        ih = new InputHelper(sc);
        assertFalse(ih.getYesNoInput(prompt));
        sc.close();

        sc = new Scanner("Noooooo\n");
        ih = new InputHelper(sc);
        assertFalse(ih.getYesNoInput(prompt));
        sc.close();
    }

    @Test
    public void getYesNoInput_incorrectInput_doesNotThrowError() {
        Scanner sc = new Scanner("\ny\n");
        InputHelper ih = new InputHelper(sc);
        assertTrue(ih.getYesNoInput(prompt));
        sc.close();

        sc = new Scanner("asdf\nYes\n");
        ih = new InputHelper(sc);
        assertTrue(ih.getYesNoInput(prompt));
        sc.close();

        sc = new Scanner("\n\n\n\n\n\n\n\n\n\n\n\nn");
        ih = new InputHelper(sc);
        assertFalse(ih.getYesNoInput(prompt));
        sc.close();

        sc = new Scanner("qweruoip\nqwer\n rer\nrere\nNoooooo\n");
        ih = new InputHelper(sc);
        assertFalse(ih.getYesNoInput(prompt));
        sc.close();
    }

    @Test
    public void getYesNoInput_correctInput_showsPrompt() {
        try{
            String output = tapSystemOutNormalized(() -> {
                Scanner sc = new Scanner("y");
                InputHelper ih = new InputHelper(sc);
                ih.getYesNoInput(prompt);
            });
            assertTrue(output.indexOf(prompt) != -1);
        } catch (Exception e) {
            assertTrue(false); // your code threw an error!
        }
    }

    @Test
    public void getYesNoInput_incorrectInput_showsPromptManyTimes() {
        try{
            String output = tapSystemOutNormalized(() -> {
                Scanner sc = new Scanner("a\nb\nc\ny");
                InputHelper ih = new InputHelper(sc);
                ih.getYesNoInput(prompt);
            });

            int firstPromptIndex = output.indexOf(prompt);
            assertTrue(firstPromptIndex != 1);            
            
            output = output.substring(firstPromptIndex+1);
            int secondPromptIndex = output.indexOf(prompt);
            assertTrue(secondPromptIndex != 1);
            
            output = output.substring(secondPromptIndex+1);
            int thirdPromptIndex = output.indexOf(prompt);
            assertTrue(thirdPromptIndex != 1);

            output = output.substring(thirdPromptIndex+1);
            int fourthPromptIndex = output.indexOf(prompt);
            assertTrue(fourthPromptIndex != 1);
        } catch (Exception e) {
            assertTrue(false); // your code threw an error!
        }
    }


    /* getIntegerInput tests */

    @Test
    public void getIntegerInput_correctInput_returnsCorrectly() {
        Scanner sc = new Scanner("7\n");
        InputHelper ih = new InputHelper(sc);
        assertEquals(7, ih.getIntegerInput(prompt, MIN, MAX));
        sc.close();

        sc = new Scanner("9\n");
        ih = new InputHelper(sc);
        assertEquals(9, ih.getIntegerInput(prompt, MIN, MAX));
        sc.close();
    }

    @Test
    public void getIntegerInput_incorrectInput_doesNotThrowError() {
        Scanner sc = new Scanner("\n7\n");
        InputHelper ih = new InputHelper(sc);
        assertEquals(7, ih.getIntegerInput(prompt, MIN, MAX));
        sc.close();

        sc = new Scanner("asdf\n7\n");
        ih = new InputHelper(sc);
        assertEquals(7, ih.getIntegerInput(prompt, MIN, MAX));
        sc.close();

        sc = new Scanner("\n\n\n\n\n\n\n\n\n\n\n\n7");
        ih = new InputHelper(sc);
        assertEquals(7, ih.getIntegerInput(prompt, MIN, MAX));
        sc.close();

        sc = new Scanner("qweruoip\nqwer\n rer\nrere\nNoooooo\n7\n");
        ih = new InputHelper(sc);
        assertEquals(7, ih.getIntegerInput(prompt, MIN, MAX));
        sc.close();

        sc = new Scanner("100\n5324\n534\n533476\n1234567\n7\n");
        ih = new InputHelper(sc);
        assertEquals(7, ih.getIntegerInput(prompt, MIN, MAX));
        sc.close();

        sc = new Scanner("0\n3\n-1\n-100\n-1234567\n7\n");
        ih = new InputHelper(sc);
        assertEquals(7, ih.getIntegerInput(prompt, MIN, MAX));
        sc.close();
    }

    @Test
    public void getIntegerInput_correctInput_showsPrompt() {
        try{
            String output = tapSystemOutNormalized(() -> {
                Scanner sc = new Scanner("7");
                InputHelper ih = new InputHelper(sc);
                ih.getIntegerInput(prompt, MIN, MAX);
            });
            assertTrue(output.indexOf(prompt) != -1);
        } catch (Exception e) {
            assertTrue(false); // your code threw an error!
        }
    }

    @Test
    public void getIntegerInput_incorrectInput_showsPromptManyTimes() {
        try{
            String output = tapSystemOutNormalized(() -> {
                Scanner sc = new Scanner("a\nb\nc\n7");
                InputHelper ih = new InputHelper(sc);
                ih.getIntegerInput(prompt, MIN, MAX);
            });

            int firstPromptIndex = output.indexOf(prompt);
            assertTrue(firstPromptIndex != 1);            
            
            output = output.substring(firstPromptIndex+1);
            int secondPromptIndex = output.indexOf(prompt);
            assertTrue(secondPromptIndex != 1);
            
            output = output.substring(secondPromptIndex+1);
            int thirdPromptIndex = output.indexOf(prompt);
            assertTrue(thirdPromptIndex != 1);

            output = output.substring(thirdPromptIndex+1);
            int fourthPromptIndex = output.indexOf(prompt);
            assertTrue(fourthPromptIndex != 1);
        } catch (Exception e) {
            assertTrue(false); // your code threw an error!
        }
    }

}