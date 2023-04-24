package dealingcards;

import java.util.ArrayList;

public class CardPlayer {
    private ArrayList<Card> hand  = new ArrayList<>();
    private Card card;

    public void getCards(Card newCard){
        hand.add(newCard);
    }
    public void showCards(){
        for (Card cards: hand) {
            System.out.println(cards);
        }
    }
}
