package io.pablo.gaming.cardgames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<Card>();
    private ArrayList<Card> dealedCards = new ArrayList<Card>();

    public Deck() {

    }

    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void showDeck(boolean fancy) {
        this.cards.stream()
                .forEach(card -> {
                    card.showCard(fancy);
                });
    }

    public void showDealedCards(boolean fancy) {
        this.dealedCards.stream()
                .forEach(card -> {
                    card.showCard(fancy);
                });
    }

    public void prepareDefaultDeck() {
        this.cards.clear();
        for (Suits s : Suits.values()) {
            for(int i = 1; i <= 13; i++) {
                this.cards.add(new Card(s, i));
            }
        }
    }

    /**
     * Shuffles the order of the cards in the Deck object
     */
    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card dealCard() {
        return dealCard(1).get(0);
    }
    public List<Card> dealCard(int cantCards) {
        List<Card> cards = new ArrayList<Card>();
        for(int i = 0; i < cantCards; i++) {
            Card card = this.getCards().remove(0);
            cards.add(card);
        }
        this.dealedCards.addAll(cards);
        return cards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void addCards(ArrayList<Card> cards) {
        this.cards.addAll(cards);
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void addToDealedCards(ArrayList<Card> cards) {
        this.dealedCards.addAll(cards);
    }
}
