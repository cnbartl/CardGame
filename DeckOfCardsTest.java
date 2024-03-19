// Cooper Bartl
// CS 145 
// 1/17/24

// This is the test class used for running the program.
// Calls different methods in DeckOfCards to check for amount of pairs

public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();

        myDeckOfCards.shuffle(); // Shuffles deck

        // Deals 5 cards
        Card[] pokerHand = myDeckOfCards.dealFiveCardHand();
        

        // Print the poker hand
        System.out.println("Five-card poker hand:");
        for (Card card : pokerHand) {
            System.out.println(card);
        }

        // Check for different poker hands
        if (myDeckOfCards.containsFourPairs(pokerHand)){
            System.out.println("The hand contains four pairs");
        }
        else if (myDeckOfCards.containsThreePairs(pokerHand)){
            System.out.println("The hand contains three pairs");
        }
        else if (myDeckOfCards.containsTwoPairs(pokerHand)){
            System.out.println("The hand contains two pairs");
        }
        else if (myDeckOfCards.containsPair(pokerHand)) {
            System.out.println("The hand contains a pair.");
        }
        else {
            System.out.println("Contains no pairs");
        }

    }
}