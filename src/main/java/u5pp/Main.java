package u5pp;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    /* Example usage for InputHelper */
    Scanner sc = new Scanner(System.in);

    // boolean yesNo = ih.getYesNoInput("please answer yes or no.");
    // System.out.println("the player chose " + yesNo);
    InputHelper ih = new InputHelper(sc);
    int numberChosen = ih.getIntegerInput("please chose a number between 10 and 12 (inclusive).", 5, 10);
    System.out.println("the player chose " + numberChosen);

  }
}