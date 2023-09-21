package org.example;

public class Card {

    // 0 = hjärter
    // 1 = spader
    // 2 = klöver
    // 3 = ruter


    // ...

    //10 = knäckt

    public int suit;
    public int value;

    public Card(int suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }



    @Override
    public String toString() {
        String formattedSuit = "";
        String formattedValue = "";

        switch (suit) {
            case 0 -> formattedSuit = "Hjäter";
            case 1 -> formattedSuit = "Spader";
            case 2 -> formattedSuit = "Klöver";
            case 3 -> formattedSuit = "Ruter";
        }
        switch (value) {
            case 0 -> formattedValue = "Äss";
            case 1 -> formattedValue = "Två";
            case 2 -> formattedValue = "Tre";
            case 3 -> formattedValue = "Fyra";
            case 4 -> formattedValue = "Fem";
            case 5 -> formattedValue = "Sex";
            case 6 -> formattedValue = "Sju";
            case 7 -> formattedValue = "Åtta";
            case 8 -> formattedValue = "Nio";
            case 9 -> formattedValue = "Tio";
            case 10 -> formattedValue = "Knäckt";
            case 11 -> formattedValue = "Dam";
            case 12 -> formattedValue = "Kung";
        }

        return formattedSuit + " " + formattedValue;


    }


}
