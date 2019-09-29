public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] SUITS = {"Spades", "Clubs", "Hearts", "Diamonds"};
        String[] RANKS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        String[][] CARDS = new String[SUITS.length][RANKS.length];
        String[] CARD_DECK = new String[SUITS.length * RANKS.length];
        for(int i =0; i < SUITS.length; i++) {
            for (int j=0; j < RANKS.length; j++) {
                CARDS[i][j] = RANKS[j] + " of " + SUITS[i];
            }
        }

        for(int i =0; i < RANKS.length; i++) {
            for(int j=0; j < SUITS.length; j++){
                CARD_DECK[RANKS.length*j + i] = RANKS[i] + " of " + SUITS[j];
            }
        }

        // Shuffling the CARD_DECK
        for(int i=0; i<CARD_DECK.length; i++){
            // A random number between i and CARD_DECK.length
            int r = i + (int) (Math.random() * (CARD_DECK.length - i));
            String temp = CARD_DECK[i];
            CARD_DECK[i] = CARD_DECK[r];
            CARD_DECK[r] = temp;
        }

        for(String c : CARD_DECK) {
            System.out.println(c);
        }
    }
}
