package game;
import deck.*;
import player.*;
import card.*;
import java.util.ArrayList;

public class Game {

  private int numOfPlayers;
  private ArrayList<Player> players;
  private int turnCount;
  private Deck deck;

  public Game(int numOfPlayers) {
    this.numOfPlayers = numOfPlayers;
    this.players = new ArrayList<Player>();
    this.turnCount = 0;
    this.deck = deck;
    this.setupGame();
  }

  public void addPlayer(Player player) {
    players.add(player);
  }

  public Deck getDeck() {
    return deck;
  }

  public void setupGame() {
    for (int i = 1; i < (numOfPlayers + 1); i++) {
      Player player = new Player("Player" + String.valueOf(i));
      players.add(player);
    }
    this.deck = new Deck();
  }

  public int howManyPlayers() {
    return players.size();
  }

  public Player getPlayerByIndex(int num) {
    return players.get(num);
  }

  public int getTurnCount() {
    return turnCount;
  }

  public void increaseTurnCount() {
    this.turnCount += 1;
  }

  public void distributeCards() {
    for (Player player : players) {
      Card topCard = deck.showCard();
      player.addCard(topCard);
      deck.giveCard();
    }
  }

}