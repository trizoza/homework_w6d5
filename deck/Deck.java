package deck;
import java.util.ArrayList;
import java.util.Collections;
import card.*;
import player.*;

public class Deck {

  private ArrayList<Card> pile;

  public Deck() {
    this.pile = new ArrayList<Card>();
    this.setupDeck();
  }

  public void addCard(Card card) {
    pile.add(card);
  }

  public void setupDeck() { 
    for (CardType type : CardType.values()) {
      for (CardName name : CardName.values()) {
        Card card = new Card(type, name);
        addCard(card);
      }
    }
    Collections.shuffle(pile);
  }

  public int cardCount() {
    return pile.size();
  }

  public Card showCard() {
    return pile.get(0);
  }

  public void giveCard() {
    pile.remove(0);
  }

}