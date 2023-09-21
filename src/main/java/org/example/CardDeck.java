package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//3. Skapa en klass som heter CardDeck. Denna ska innehålla en Lista på kort. I
//konstruktorn ska alla Card objekt skapas med korrekta värden. CardDeck ska även
//innehålla metoder för att Blanda, dra ett slumpmässigt kort och sortera kortleken

public class CardDeck {

    List<Card> cards = new ArrayList<>(); //needs to be outside the constructor, so that other methods can use it


    // create 52 cards in the constructor
    public CardDeck(){

        for (int suit = 0; suit < 4; suit++) {

            for (int value = 0; value < 13; value++) {
                Card newCard = new Card(suit, value);
                cards.add(new Card(suit, value)); // creates a new card for each value and suit
            }

        }
        System.out.println(cards); // prints every card in the list (aka the deck)
    }


    public void randomCard(){
        Random randomizedNumber = new Random();

        int randomSuit = randomizedNumber.nextInt(4);
        int randomValue = randomizedNumber.nextInt(14);

        Card randomCard = new Card(randomSuit, randomValue);
        System.out.println("Du drar kortet: "+ randomCard); // prints out the random card

    }


    public void shuffleDeck(){
        Collections.shuffle(cards);
        System.out.println("Din kortlek har blandats:\n"+cards); // prints out the shuffled deck
    }



}
