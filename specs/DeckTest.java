import static org.junit.Assert.*;
import org.junit.*;
import deck.*;
import card.*;

public class DeckTest {

  Deck deck;
  Card card;

  @Before
  public void before() {
    deck = new Deck();
  }

  @Test
  public void canSetupDeckOf52() {
    assertEquals(52, deck.cardCount());
  }

  @Test
  public void containsDeckCardType() {
    assertEquals(true, deck.showCard() instanceof Card);
  }

  @Test
  public void canDeckGiveCard() {
    deck.giveCard();
    assertEquals(51, deck.cardCount());
  }

  @Test
  public void canDeckGiveMoreCards() {
    deck.giveCard();
    deck.giveCard();
    deck.giveCard();
    assertEquals(49, deck.cardCount());
  }

}