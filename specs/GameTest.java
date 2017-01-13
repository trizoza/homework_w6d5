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

}