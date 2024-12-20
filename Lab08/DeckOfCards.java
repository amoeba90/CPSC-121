import java.util.Random;
public class DeckOfCards implements DeckOfCardsInterface {
   
    private final int DECK_SIZE;
    private Card[] cards;
    private int nextCardIndex;

    public DeckOfCards() {
        cards = new Card[DECK_SIZE = 52];
        int i = 0;
        for (Suit s : Suit.values()) {
            for (FaceValue v: FaceValue.values()) {
                //Create a new card and add it to your deck.
                cards[i] = new Card(s,v);
                i++;
            }
        }
        this.nextCardIndex = 0;
    }

    public void shuffle() {
        Random generator = new Random();
        for (int i = 0; i < cards.length; i++) { // cards.length or DECK_SIZE, does not matter
            int j = generator.nextInt(cards.length);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
        this.nextCardIndex = 0;
    }

    public Card draw() {
        if (nextCardIndex < 52) { // or if (numCardsRemaining() > 0)
            Card next = cards[nextCardIndex];
            nextCardIndex++;
            return next;
        } else {
            return null;
        }
    }

    public int numCardsRemaining() {
        return (DECK_SIZE - nextCardIndex);
    }

    public int numCardsDealt() {
        return (nextCardIndex);
    }

    public Card[] dealtCards() {
        Card[] dealtCards = new Card[numCardsDealt()];
        for (int i = 0; i < numCardsDealt(); i++) {
            dealtCards[i] = cards[i];
        }

        return dealtCards;
    }

    public Card[] remainingCards() {
        Card[] remainingCards = new Card[numCardsRemaining()];
        for (int i = 0; i < numCardsRemaining(); i++) {
            remainingCards[i] = cards[i+numCardsDealt()];
        }

        return remainingCards;
    }

    public String toString() {
        String result = "";
        for (Card card : cards) {
            result += card + "\n";
        }
        return result;
    }

}
