package dealingcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Deck {
    List<Card> deck = new ArrayList<>();


    public Deck() {
        String[] suit = {"Hearts", "Diamonds", "Spades", "Club"};
        String[] faceValue = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for (String s : suit) {
            for (String d : faceValue) {
                deck.add(new Card(s,d));
            }
        }
    }

    public void showDeck(){
        for (Card cards : deck) {
            System.out.println(cards);
        }
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public Card deal(){
        Iterator<Card>deckIterator = deck.listIterator();
        if(deckIterator.hasNext()){
            Card tempCard = deckIterator.next();
            deckIterator.remove();
            return tempCard;
        }
        return null;
    }

}
