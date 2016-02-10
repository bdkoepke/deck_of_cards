enum Card {
  AceOfClubs(Rank.Ace, Suit.Club),
  TwoOfClubs(Rank.Two, Suit.Club),
  ThreeOfClubs(Rank.Three, Suit.Club),
  FourOfClubs(Rank.Four, Suit.Club),
  FiveOfClubs(Rank.Five, Suit.Club),
  SixOfClubs(Rank.Six, Suit.Club),
  SevenOfClubs(Rank.Seven, Suit.Club),
  EightOfClubs(Rank.Eight, Suit.Club),
  NineOfClubs(Rank.Nine, Suit.Club),
  TenOfClubs(Rank.Ten, Suit.Club),
  JackOfClubs(Rank.Jack, Suit.Club),
  QueenOfClubs(Rank.Queen, Suit.Club),
  KingOfClubs(Rank.King, Suit.Club),

  AceOfDiamonds(Rank.Ace, Suit.Diamond),
  TwoOfDiamonds(Rank.Two, Suit.Diamond),
  ThreeOfDiamonds(Rank.Three, Suit.Diamond),
  FourOfDiamonds(Rank.Four, Suit.Diamond),
  FiveOfDiamonds(Rank.Five, Suit.Diamond),
  SixOfDiamonds(Rank.Six, Suit.Diamond),
  SevenOfDiamonds(Rank.Seven, Suit.Diamond),
  EightOfDiamonds(Rank.Eight, Suit.Diamond),
  NineOfDiamonds(Rank.Nine, Suit.Diamond),
  TenOfDiamonds(Rank.Ten, Suit.Diamond),
  JackOfDiamonds(Rank.Jack, Suit.Diamond),
  QueenOfDiamonds(Rank.Queen, Suit.Diamond),
  KingOfDiamonds(Rank.King, Suit.Diamond),

  AceOfHearts(Rank.Ace, Suit.Heart),
  TwoOfHearts(Rank.Two, Suit.Heart),
  ThreeOfHearts(Rank.Three, Suit.Heart),
  FourOfHearts(Rank.Four, Suit.Heart),
  FiveOfHearts(Rank.Five, Suit.Heart),
  SixOfHearts(Rank.Six, Suit.Heart),
  SevenOfHearts(Rank.Seven, Suit.Heart),
  EightOfHearts(Rank.Eight, Suit.Heart),
  NineOfHearts(Rank.Nine, Suit.Heart),
  TenOfHearts(Rank.Ten, Suit.Heart),
  JackOfHearts(Rank.Jack, Suit.Heart),
  QueenOfHearts(Rank.Queen, Suit.Heart),
  KingOfHearts(Rank.King, Suit.Heart),

  AceOfSpades(Rank.Ace, Suit.Spade),
  TwoOfSpades(Rank.Two, Suit.Spade),
  ThreeOfSpades(Rank.Three, Suit.Spade),
  FourOfSpades(Rank.Four, Suit.Spade),
  FiveOfSpades(Rank.Five, Suit.Spade),
  SixOfSpades(Rank.Six, Suit.Spade),
  SevenOfSpades(Rank.Seven, Suit.Spade),
  EightOfSpades(Rank.Eight, Suit.Spade),
  NineOfSpades(Rank.Nine, Suit.Spade),
  TenOfSpades(Rank.Ten, Suit.Spade),
  JackOfSpades(Rank.Jack, Suit.Spade),
  QueenOfSpades(Rank.Queen, Suit.Spade),
  KingOfSpades(Rank.King, Suit.Spade);

  private final Rank rank;
  private final Suit suit;

  Card(final Rank rank, final Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  @Override
  public String toString() {
    return this.rank + " of " + this.suit + "s";
  }
}
