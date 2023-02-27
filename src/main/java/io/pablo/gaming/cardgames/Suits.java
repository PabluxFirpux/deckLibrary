package io.pablo.gaming.cardgames;

public enum Suits {
    SPADES("Spades", "S"),
    HEARTS("Hearts", "H"),
    DIAMONDS("Diamonds", "D"),
    CLUBS("Clubs", "C");

    private String suitName;

    public String getSuitName() {
        return suitName;
    }

    public String getSymbol() {
        return symbol;
    }

    private String symbol;

    Suits(String suitName, String symbol) {
        this.suitName = suitName;
        this.symbol = symbol;
    }
}
