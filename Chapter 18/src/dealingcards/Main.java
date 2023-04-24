package dealingcards;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        CardPlayer hand = new CardPlayer();

        deck.shuffle();

        for (int i = 1; i <= 5; i++){
            hand.getCards(deck.deal());
        }
        hand.showCards();
    }
}
