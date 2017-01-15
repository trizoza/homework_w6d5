package game;
import deck.*;
import player.*;
import java.util.ArrayList;

public class Game {

  private int numOfPlayers;
  private ArrayList<Player> players;
  private Deck deck;
  private int turnCount;

  public Game(int numOfPlayers) {
    this.numOfPlayers = numOfPlayers;
    this.players = new ArrayList<Player>();
    this.deck = new Deck();
    this.turnCount = 0;
    this.setupGame();
  }

  public Deck getDeck() {
    return deck;
  }

  public void addPlayer(Player player) {
    players.add(player);
  }

  public void setupGame() {
    for (int i = 1; i < (numOfPlayers + 1); i++) {
      Player player = new Player("Player" + String.valueOf(i));
      players.add(player);
    }
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


}