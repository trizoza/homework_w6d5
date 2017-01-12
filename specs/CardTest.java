import static org.junit.Assert.*;
import org.junit.*;
import card.*;

public class CardTest {

  Card card;

  @Before
  public void before() {
    // Card card01 = new Card(CardName.TWO, CardType.HEART, CardValue.2);
    // Card card02 = new Card(CardName.THREE, CardType.HEART, CardValue.3);
    // Card card03 = new Card(CardName.FOUR, CardType.HEART, CardValue.4);
    // Card card04 = new Card(CardName.FIVE, CardType.HEART, CardValue.5);
    // Card card05 = new Card(CardName.SIX, CardType.HEART, CardValue.6);
    // Card card06 = new Card(CardName.SEVEN, CardType.HEART, CardValue.7);
    // Card card07 = new Card(CardName.EIGHT, CardType.HEART, CardValue.8);
    // Card card08 = new Card(CardName.NINE, CardType.HEART, CardValue.9);
    // Card card09 = new Card(CardName.TEN, CardType.HEART, CardValue.10);
    // Card card10 = new Card(CardName.JACK, CardType.HEART, CardValue.10);
    // Card card11 = new Card(CardName.QUEEN, CardType.HEART, CardValue.10);
    // Card card12 = new Card(CardName.KING, CardType.HEART, CardValue.10);
    // Card card13 = new Card(CardType.HEART, CardName.ACE, CardValue.10);
    card = new Card(CardType.HEART, CardName.ACE);
  }

  @Test
  public void canGetType(){
    assertEquals(CardType.HEART, card.getType());
  }

  @Test
  public void canGetName(){
    assertEquals(CardName.ACE, card.getName());
  }


  

}