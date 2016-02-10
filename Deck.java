import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Optional;
import java.lang.Iterable;

public class Deck implements Iterable<Card> {
  public static Deck newEmptyDeck() {
    return new Deck(new LinkedList<>());
  }

  public static Deck new52CardDeck() {
    final Deck deck = newEmptyDeck();
    for (final Card card : Card.values())
      deck.addCard(card);
    return deck;
  }

  private final LinkedList<Card> cards;

  private Deck(final LinkedList<Card> cards) {
    this.cards = cards;
  }

  public void addCard(final Card card) {
    this.cards.add(card);
  }

  public Card drawCard() {
    if (this.cards.isEmpty())
      throw new IllegalStateException("Cannot remove a card from an empty deck.");
    return this.cards.remove();
  }

  public void shuffle() {
    Collections.shuffle(this.cards);
  }

  public Iterator<Card> iterator() {
    return Collections.unmodifiableCollection(this.cards).iterator();
  }
}
