package u5pp;
import java.util.Random;

class Dice {
    private int numSides = 6;
    private int startingSide = 1;
    private int currentSide = startingSide;
    private String color = "green";

    public Dice(){
        this.numSides = 6;
        this.startingSide = 1;
        this.color = "green";
    }

    public Dice(int numSides){
        this.numSides = numSides;
        this.startingSide = 1;
        this.color = "green";
    }

    public Dice(int numSides, int startingSide){
        this.numSides = numSides;
        if (startingSide <= numSides){
            this.startingSide = startingSide;
        }else{
            this.startingSide = 1;
        }   
        this.color = "green";
    }

    public Dice(int numSides, int startingSide, String color){
        this.numSides = numSides;
        if (startingSide <= numSides){
            this.startingSide = startingSide;
        }else{
            this.startingSide = 1;
        }   
        this.color = color;
    }

    public int getSides(){
        return numSides;
    }

    public int getCurrentSide(){
        return startingSide;
    }

    public String getColor(){
        return color;
    }

    public String toString(){
        return "The " + color + " " + numSides + "-sided dice is showing " + startingSide;
    }

    public boolean equals(Dice d){
        if (this.getCurrentSide() == d.getCurrentSide()){
            return true;
        }
        return false;
    }


    public int roll(){
        int min = 1;
        int max = numSides;
        Random rand = new Random();
        currentSide = rand.nextInt(max - min) + min;
        startingSide = currentSide;
        return startingSide;
    }

    public void changeSide(int num){
        if (num <= numSides && num >= 1){
            this.startingSide = num;
        }
    }

    public void changeColor(String color){
        this.color = color;
    }

    public void changeNumSides(int num){
        numSides = num;
    }

}