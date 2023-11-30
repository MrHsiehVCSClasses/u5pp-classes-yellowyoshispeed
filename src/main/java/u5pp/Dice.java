package u5pp;
import java.util.Random;

class Dice {
    private int numSides = 6;
    private int startingSide = 1;
    private int currentSide = startingSide;
    private String color = "green";

    public Dice(){ // makes defaults
        this.numSides = 6;
        this.startingSide = 1;
        this.color = "green";
    }

    public Dice(int numSides){ // makes the defaults of startingSide and color, gets num side
        this.numSides = numSides;
        this.startingSide = 1;
        this.color = "green";
    }

    public Dice(int numSides, int startingSide){ // makes the defaults of color, gets num side, checks of starting side is valid w/ num side + gets
        this.numSides = numSides;
        if (startingSide <= numSides){
            this.startingSide = startingSide;
        }else{
            this.startingSide = 1;
        }   
        this.color = "green";
    }

    public Dice(int numSides, int startingSide, String color){ // gets colorand side, checks of starting side is valid w/ num side + gets
        this.numSides = numSides;
        if (startingSide <= numSides){
            this.startingSide = startingSide;
        }else{
            this.startingSide = 1;
        }   
        this.color = color;
    }

    public int getSides(){ //getter
        return numSides;
    }

    public int getCurrentSide(){ //getter
        return startingSide;
    }

    public String getColor(){ //getter
        return color;
    }

    public String toString(){ // to make my things print out in this format :)
        return "The " + color + " " + numSides + "-sided dice is showing " + startingSide;
    }

    public boolean equals(Dice d){// checks if sides are =
        if (this.getCurrentSide() == d.getCurrentSide()){
            return true;
        }
        return false;
    }


    public int roll(){ // rolls the dice
        int min = 1;
        int max = numSides;
        Random rand = new Random();
        currentSide = rand.nextInt(max - min) + min; // makes the current side
        startingSide = currentSide;
        return startingSide;
    }

    public void changeSide(int num){// to check if the changed side is valid
        if (num <= numSides && num >= 1){
            this.startingSide = num;
        }
    }

    public void changeColor(String color){  // to check if the color  is valid
        this.color = color;
    }

    public void changeNumSides(int num){ // changes the num side
        numSides = num;
    }

}