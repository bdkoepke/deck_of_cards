public class Program {
  public static void main(String... args) {
    final Deck deck = Deck.new52CardDeck();
    for (final Card card : deck)
      System.out.println(card);
  }
}
