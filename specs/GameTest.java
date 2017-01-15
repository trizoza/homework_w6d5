import static org.junit.Assert.*;
import org.junit.*;
import player.*;
import game.*;

public class GameTest {

  Game game;
  Player player;

  @Before
  public void before() {
    game = new Game(2);
  }

  @Test
  public void canSetupGameOf2() {
    assertEquals(2, game.howManyPlayers());
  }

  @Test
  public void canGetNameOfFirstPlayer() {
    assertEquals("Player1", game.getPlayerByIndex(0).getName());
  }

  @Test
  public void canSetupGameOf4() {
    Game newGame = new Game(4);
    assertEquals(4, newGame.howManyPlayers());
  }

  @Test
  public void doesDeckExist() {
    assertEquals(52, game.getDeck().amountOfCardsInDeck());
  }

  @Test
  public void canGetTurnCount() {
    assertEquals(0, game.getTurnCount());
  }

  @Test
  public void canIncreaseTurnCount() {
    game.increaseTurnCount();
    game.increaseTurnCount();
    game.increaseTurnCount();
    assertEquals(3,game.getTurnCount());
  }

  // @Test
  // public void canPlayGame() {

  // }

}