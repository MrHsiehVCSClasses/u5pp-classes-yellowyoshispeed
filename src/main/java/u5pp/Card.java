package u5pp;

public class Card {
    private String suit;
    private String value;

    public Card(){
        this.value = "2";
        this.suit = "clubs";
    }
    public Card(String suit){
        this.value = "2";
        this.suit = suit;
    }

    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public String getSuit(){
        return suit;
    }

    public String toString(){
        return "The " + value + " of " + suit;
    }

    public boolean equals(Card c){
        if (this.getValue().equals(c.getValue()) && this.getSuit().equals(c.getSuit())){
            return true;
        }
        return false;
    }

    public void changeSuit(String suit){
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
