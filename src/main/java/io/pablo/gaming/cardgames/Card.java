package io.pablo.gaming.cardgames;

public class Card {
    private Suits suit;
    private Integer number;

    private Card() {

    }
    public Card(Suits suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    public void showCard(boolean fancy) {
        System.out.println(getValue(fancy));
    }

    public String getValue(boolean fancy) {
        String value;
        switch(getNumber()) {
            case 1:
                value = "A";
                break;
            case 11:
                value = "J";
                break;
            case 12:
                value = "Q";
                break;
            case 13:
                value = "K";
                break;
            default:
                value = getNumber().toString();
        }
        return value + " " + (fancy ? getSuit().getSymbol() : getSuit().getSuitName());
    }

    public Suits getSuit() {
        return suit;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}