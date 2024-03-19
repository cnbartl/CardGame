// Cooper Bartl
// CS 145 
// 1/17/24

// This class handles each card indivually, returning the face and suit of each card

class Card {
    private String face;
    private String suit;

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}