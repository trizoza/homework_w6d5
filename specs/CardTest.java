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
  public void canGetType(){
    assertEquals(CardType.HEART, card.getType());
  }

  @Test
  public void canGetName(){
    assertEquals(CardName.ACE, card.getName());
  }


  

}