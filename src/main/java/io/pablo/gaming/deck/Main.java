package io.pablo.gaming.deck;

import io.pablo.gaming.cardgames.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
       /* Card carta = new Card(Suits.SPADES, 1);
        //carta.showCard();

        Deck mazo = new Deck();
        mazo.prepareDefaultDeck();
        mazo.shuffle();
       // mazo.showDeck(true);
        System.out.println("---------");
       // mazo.dealCard(10).stream().forEach(card -> card.showCard(true));
        Deck mazo2 = new Deck((ArrayList<Card>) mazo.dealCard(5));
        mazo2.showDeck(true);
        System.out.println("----");
        mazo2.shuffle();
        mazo2.showDeck(true); */

        Arrays.stream(args)
                .map(cmd -> {
                    try {
                        validateCommand(cmd);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    return cmd;
                })
                .forEach(Main::processCommand);
    }

    private static void processCommand(String command) {
        switch(command) {
            case "deck":
                showDeck(false);
                break;
            case "shuffle":
                showDeck(true);
                break;
        }
    }

    private static void showDeck(boolean shuffle) {
        Deck mazo = new Deck();
        mazo.prepareDefaultDeck();
        if(shuffle) mazo.shuffle();
        mazo.showDeck(true);
    }

    private static String validateCommand(String command) throws Exception {
        String validCommands = "deck|shuffle";
        if (!validCommands.contains(command)) {
            throw new Exception("Command not supported: " + command);
        }
        return command;
    }
}