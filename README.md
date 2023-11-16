# Unit 5 Programming Project

For this project, you will be writing four different classes from scratch: `Dice`, `Card`, `MyMath`, and `InputHelper`. Make sure to properly JavaDoc your code and to use proper data encapsulation.

## PART A - `Dice.java`

For **Part A** you are going to complete the class `Dice`. This class represents an *n*-sided dice. You will need to complete:

1. The constructors. You will write four overloaded constructors. The constructors will set instance variables either to the default values or to value given through the constructor's parameters.
   - **Default Values:**
      - `numSides: 6`, `startingSide: 1`, `color: "green"`
   - **Constructors**
      - `Dice()`
      - `Dice(int numSides)`
      - `Dice(int numSides, int startingSide)`
      - `Dice(int numSides, int startingSide, String color)`
2. The accessors/getters. You will need to create the following methods to get the values in the instance variables.
   - `int getSides()` returns the number of sides the `Dice` has
   - `int getCurrentSide()` returns the current "face up" side of the `Dice`
   - `String getColor()` returns the color of the `Dice`
   - `String toString()` returns the phrase "The <`color`> <`numSides`>-sided dice is showing <`currentSide`>"
      - example return value: `"The green 6-sided dice is showing 1"`
   - `boolean equals(Dice d)` returns `true` if both `this` `Dice` and `d` have the same `currentSide`, and `false` otherwise
3. The mutators/setters. You will need to create the following methods that will change/update the instance variables of your class.
   - `int roll()` Changes the `currentSide` to a random number between [`1`, `numSides`] (inclusive) and returns that number
   - `void changeSide(int num)` changes the `currentSide` to `num` if num is between [`1`, `numSides`], otherwise it does nothing
   - `void changeColor(String color)` changes the current `color` to the value in the parameter
   - `void changeNumSides(int num)` changes the number of sides on the `Dice` to `num`

You may include any other `private` methods and instance variables you think applicable. You should have nothing else that is `public` other than what is listed above.

## PART B - `Card.java`

For **Part B** you are going to complete the class `Card`. This class represents a playing card from a standard 52-Card deck. You will need to complete:

1. The constructors. You will write three overloaded constructors. The constructors will set the instance variables either to the default values or to value(s) passed through the constructor's parameter(s).
   - **Default Values:**
      - `value: 2`, `suit: clubs`
   - **Constructors**
      - `Card()`
      - `Card(String suit)`
      - `Card(String suit, String value)`
2. The accessors/getters. You will need to create the following methods to get the values in the instance variables.
   - `String getValue()` returns the value of the `Card`
   - `String getSuit()` returns the suit of the `Card`
   - `String toString()` returns the phrase "The <`value`> of <`suit`>"
      - example: `"The 2 of clubs"`, `"The queen of spades"`
   - `boolean equals(Card c)` returns `true` if both `this` `Card` and `c` have the same `suit` and `value`, and `false` otherwise
3. The mutators/setters. You will need to create the following methods that will change/update the instance variables of your class.
   - `void changeSuit(String suit)` changes the current `suit` to the `suit` in the parameter if that `suit` is a valid `suit` when capitalization is ignored. If that `suit` is invalid, the method does nothing. The method converts the parameter to lowercase before storing.
      - *Valid Inputs*: `clubs`, `diamonds`, `hearts`, or `spades`
   - `void changeValue(String value)` changes the current `value` to the `value` in the parameter if that `value` is a valid `value` when capitalization is ignored. If that `value` is invalid, the method does nothing. The method converts the parameter to lowercase before storing.
      - *Valid Inputs*: `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `jack`, `queen`, `king`, or `ace`

You may include any other `private` methods and instance variables that you think are applicable. You should have nothing else that is `public` other than what is listed above.

## PART C - `MyMath.java`

For **Part C** you are going to complete the class `MyMath`. This class simulates some of the methods of the `Math` class. You are not permitted to use the `Math` class at all (pretend it doesn't exist). You will need to complete:

- `static int abs(int x)` which returns the absolute value of the parameter.
- `static double abs(double x)` which returns the absolute value of the parameter.
- `static double pow(double base, int exponent)` which raises the base to the power of the exponent. You can assume that the exponent is greater than or equal to 0.
- `static int perfectSqrt(int x)` which returns the square root of x if there is a whole number that is a square root. It returns -1 otherwise.

## PART D - InputHelper.java

Isn't it annoying to keep writing the same code to check if someone's input is what we want? We'll make a helper class that does that for us. 

You will create the `InputHelper` class that has the following `public` methods:

- `InputHelper(Scanner scanner)` - a constructor which takes in a scanner that is used to read the input
- `public boolean getYesNoInput(String prompt)` - takes in a prompt, asks the player the prompt. Everytime the player does not answer something that starts with a `y`, `Y`, `n`, or `N`, it tell the player that their input is invalid, and asks them the prompt again. Loops until proper input is given, at which point, it returns a `true` for yes and `false` for no.
- `public int getIntegerInput(String prompt, int min, int max)` - does the same thing as `getYesNoInput`, except for a few differences: Repeatedly prompts until a proper integer input is given. The integer must be larger than or equal to `min`, and less than or equal to `max`.

### Example output for `getYesNoInput`
```Java
please answer yes or no.
asdf
Invalid input - does not start with "y" or "n". Please try again.
please answer yes or no.

Invalid input - empty line. Please try again.
please answer yes or no.
yaaaas 
// (at this point the function should return true)
```

### Example output for `getIntegerInput`
```java
please chose a number between 10 and 12 (inclusive).
7
Invalid input - too low. Please try again.
please chose a number between 10 and 12 (inclusive).
asdf
Invalid input - not a number. Please try again.
please chose a number between 10 and 12 (inclusive).

Invalid input - empty line. Please try again.
please chose a number between 10 and 12 (inclusive).
100
Invalid input - too high. Please try again.
please chose a number between 10 and 12 (inclusive).
10
// (at this point, the method should return 10)
```


## GRADING BREAKDOWN

- Code compiles & runs without errors: 1 pts
- Formatting/indentation: 2 points
- All code commented: 2 points
- No public methods/attributes besides the ones specified (additional private methods/attributes are encouraged): 2 point
- All code is DRY (Don't repeat yourself): 3 points
- Passes all test cases: 20 points 

Total: 30 points
