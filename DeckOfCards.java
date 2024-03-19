// Cooper Bartl
// CS 145 
// 1/17/24

// This class will handle the deck of cards. Including dealing, shuffling
//  and checking for pairs of a 5 card hand

import java.security.SecureRandom;

public class DeckOfCards {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final int NUMBER_OF_CARDS = 52;

    private Card[] deck = new Card[NUMBER_OF_CARDS];
    private int currentCard = 0;

    public DeckOfCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

    public void shuffle() {
        currentCard = 0;
        for (int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];
        } else {
            return null;
        }
    }

    // New method to deal a five-card poker hand
    public Card[] dealFiveCardHand() {
        Card[] hand = new Card[5];
        for (int i = 0; i < 5; i++) {
            hand[i] = dealCard();
        }
        return hand;
    } // end of dealFiveCardHand
    
    public boolean containsPair(Card[] hand) {
        // Iterate through each card in the hand
        for (int i = 0; i < hand.length; i++) {
            // Compare the current card with the rest of the cards in the hand
            for (int j = i + 1; j < hand.length; j++) {
                // Check if the faces of the two cards are the same (forming a pair)
                if (hand[i].getFace().equals(hand[j].getFace())) {
                    return true; // Found a pair
                }
            }
        }
        return false; // No pair found
    } // end of containsPair

    public boolean containsTwoPairs(Card[] hand){
         // Iterate through each card in the hand
    for (int i = 0; i < hand.length; i++) {
        int count = 1; // Initialize count for the current card
        // Compare the current card with the rest of the cards in the hand
        for (int j = i + 1; j < hand.length; j++) {
            // Check if the faces of the two cards are the same
            if (hand[i].getFace().equals(hand[j].getFace())) {
                count++; // Increment count for each matching face
            } //end of if
        } //end of for
        // Check if there are three matching faces
        if (count == 3) {
            return true; // Found three of a kind
        } // end of if 
    } // end of for
    return false; // No three of a kind found
    } // end of containsTwoPairs

    public boolean containsThreePairs(Card[] hand){
        // Iterate through each card in the hand
   for (int i = 0; i < hand.length; i++) {
       int count = 1; // Initialize count for the current card
       // Compare the current card with the rest of the cards in the hand
       for (int j = i + 1; j < hand.length; j++) {
           // Check if the faces of the two cards are the same
           if (hand[i].getFace().equals(hand[j].getFace())) {
               count++; // Increment count for each matching face
           } //end of if
       } //end of for
       // Check if there are four matching faces
       if (count == 4) {
           return true; // Found four of a kind
       } // end of if 
   } // end of for
   return false; // No four of a kind found
   } // end of containsThreePairs

   public boolean containsFourPairs(Card[] hand){
    // Iterate through each card in the hand
for (int i = 0; i < hand.length; i++) {
   int count = 1; // Initialize count for the current card
   // Compare the current card with the rest of the cards in the hand
   for (int j = i + 1; j < hand.length; j++) {
       // Check if the faces of the two cards are the same
       if (hand[i].getFace().equals(hand[j].getFace())) {
           count++; // Increment count for each matching face
       } //end of if
   } //end of for
   // Check if there are four matching faces
   if (count == 5) {
       return true; // Found five of a kind
   } // end of if 
} // end of for
return false; // No five of a kind found
} // end of containsFourPairs

}
