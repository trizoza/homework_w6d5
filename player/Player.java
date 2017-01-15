package player;
import java.util.ArrayList;
import card.*;

public class Player {

  private String name;
  private ArrayList<Card> hand;
  private int score;

  public Player(String name) {
    this.name = name;
    this.hand = new ArrayList<Card>();
    this.score = 0;
  }

  public String getName() {
    return this.name;
  }

  public void addCard(Card card) {
    hand.add(card);
  }

  public int cardCount(){
    return hand.size();
  }

  public int getScore() {
    return this.score;
  }

  public void setScore() {
    this.score = hand.get(0).getValue();
  }

  public void giveCard() {
    hand.remove(0);
  }

  public Card showCard() {
    return hand.get(0);
  }


}