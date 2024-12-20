public class CardDealer {
   
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        System.out.println("Unshuffled Deck: " + deck);
        deck.shuffle();
        System.out.println("Shuffled Deck: " + deck);

        for (int i = 0; i < 5; i++) {
            System.out.println("Drawing cards...");
            Card player1 = deck.draw();
            Card player2 = deck.draw();

            System.out.println("Player 1: " + player1);
            System.out.println("Player 2: " + player2);
            
            if (player1.compareTo(player2) > 0) {
                System.out.println("Player 1 wins!");
            } else if (player1.compareTo(player2) < 0) {
                System.out.println("Player 2 Wins!");
            } else {
                System.out.println("Everyone wins!");
            }

            System.out.println("(" + deck.numCardsRemaining() + " cards remaining)\n");
        }

        System.out.println("Dealt cards: ");
        Card[] dealt = deck.dealtCards();
        for (int i = 0; i < deck.numCardsDealt(); i++) { // for (Card card : deck.dealtCards()) { 
            System.out.println(dealt[i]); // System.out.println(card);
        }

        System.out.println("\nRemaining cards: ");
        Card[] remaining = deck.remainingCards();
        for (int i = 0; i < deck.numCardsRemaining(); i++) { // for (Card card : deck.remainingCards()) { 
            System.out.println(remaining[i]); // System.out.println(card);
        }
    }
}

