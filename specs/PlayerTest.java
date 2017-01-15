import static org.junit.Assert.*;
import org.junit.*;
import player.*;
import card.*;

public class PlayerTest {

  Player player;
  Card card;

  @Before
  public void before() {
    player = new Player("Peter");
    card = new Card(CardType.HEART, CardName.TWO);
  }

  @Test 
  public void canGetCard() {
    player.addCard(card);
    assertEquals(1, player.cardCount());
  }

  @Test
  public void canGetScore() {
    assertEquals(0, player.getScore());
  }

  @Test
  public void canSetScore() {
    player.addCard(card);
    player.setScore();
    assertEquals(2, player.getScore());
  }

  @Test
  public void canGetScoreOfAce() {
    Card newCard = new Card(CardType.HEART, CardName.ACE);
    player.addCard(newCard);
    player.setScore();
    assertEquals(14, player.getScore());
  }

  @Test
  public void canPlayerRemoveCard() {
    player.addCard(card);
    player.giveCard();
    assertEquals(0, player.cardCount());
  }

  @Test
  public void canPlayerShowCardName() {
    player.addCard(card);
    Card shownCard = player.showCard();
    assertEquals(CardName.TWO, shownCard.getName());
  }

  @Test
  public void canPlayerShowCardType() {
    player.addCard(card);
    Card shownCard = player.showCard();
    assertEquals(CardType.HEART, shownCard.getType());
  }

}