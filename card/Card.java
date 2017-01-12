package card;

public class Card {

  private CardType type;
  private CardName name;
  // private CardValue value;

  public Card(CardType type, CardName name){
    this.type = type;
    this.name = name;
    // this.value = value;
  }

  public CardType getType() {
    return this.type;
  }

  public CardName getName() {
    return this.name;
  }

  // public CardValue getValue() {
  //   return this.value;
  // }

}