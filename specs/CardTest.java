import static org.junit.Assert.*;
import org.junit.*;
import card.*;

public class CardTest {

  Card card;

  @Before
  public void before() {
    card = new Card(CardType.HEART, CardName.ACE);
  }

  @Test
  public void canGetType() {
    assertEquals(CardType.HEART, card.getType());
  }

  @Test
  public void canGetName() {
    assertEquals(CardName.ACE, card.getName());
  }

  @Test
  public void canHaveValue() {
    assertEquals(14, card.getValue());
  }

  @Test
  public void canHaveDiffValue() {
    Card newCard = new Card(CardType.SPADE, CardName.EIGHT);
    assertEquals(8, newCard.getValue());
  }
  

}