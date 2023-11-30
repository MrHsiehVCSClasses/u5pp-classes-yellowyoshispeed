package u5pp;

public class Card {
    private String suit; // makes the suit
    private String value; // makes the value

    public Card(){
        this.value = "2"; // makes the defaults
        this.suit = "clubs";
    }
    public Card(String suit){
        this.value = "2"; // makes the defaults of value and gets suit
        this.suit = suit;
    }

    public Card(String suit, String value){
        this.suit = suit; // gets the suit and value
        this.value = value;
    }

    public String getValue(){ //getters
        return value;
    }

    public String getSuit(){ //getters
        return suit;
    }

    public String toString(){ // to make my things print out in this format :)
        return "The " + value + " of " + suit;
    }

    public boolean equals(Card c){ // checks if the card has equal value
        if (this.getValue().equals(c.getValue()) && this.getSuit().equals(c.getSuit())){
            return true;
        }
        return false;
    }

    public void changeSuit(String suit){  // checks if the card has equal value, if not change it
        suit = suit.toLowerCase();
        if (suit.equals("hearts") || suit.equals("diamonds") || suit.equals("clubs") || suit.equals("spades")){
            this.suit = suit;
        }
    }

    public void changeValue(String value){ 
        value = value.toLowerCase();
        if (value.equals("ace") || value.equals("2") || value.equals("3") || value.equals("4") || value.equals("5") || value.equals("6") || value.equals("7") || value.equals("8") || value.equals("9") || value.equals("10") || value.equals("jack") || value.equals("queen") || value.equals("king")){
            this.value = value;
        }
    }
}
