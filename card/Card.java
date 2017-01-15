package card;

public class Card {

  private CardType type;
  private CardName name;

  public Card(CardType type, CardName name) {
    this.type = type;
    this.name = name;
  }

  public CardType getType() {
    return this.type;
  }

  public CardName getName() {
    return this.name;
  }

}