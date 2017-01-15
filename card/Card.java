package card;

public class Card {

  private CardType type;
  private CardName name;
  private int value;

  public Card(CardType type, CardName name) {
    this.type = type;
    this.name = name;
    this.value = value;
    this.setValue();
  }

  public CardType getType() {
    return this.type;
  }

  public CardName getName() {
    return this.name;
  }

  public int getValue() {
    return this.value;
  }

  public void setValue() {
    if (this.name == CardName.TWO) {
      this.value = 2;
    }
    if (this.name == CardName.THREE) {
      this.value = 3;
    }
    if (this.name == CardName.FOUR) {
      this.value = 4;
    }
    if (this.name == CardName.FIVE) {
      this.value = 5;
    }
    if (this.name == CardName.SIX) {
      this.value = 6;
    }
    if (this.name == CardName.SEVEN) {
      this.value = 7;
    }
    if (this.name == CardName.EIGHT) {
      this.value = 8;
    }
    if (this.name == CardName.NINE) {
      this.value = 9;
    }
    if (this.name == CardName.TEN) {
      this.value = 10;
    }
    if (this.name == CardName.JACK) {
      this.value = 11;
    }
    if (this.name == CardName.QUEEN) {
      this.value = 12;
    }
    if (this.name == CardName.KING) {
      this.value = 13;
    }
    if (this.name == CardName.ACE) {
      this.value = 14;
    }
  }

}