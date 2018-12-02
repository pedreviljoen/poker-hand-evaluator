import HandTypes._

object Hands {
  def types: List[HandType] = {
    List (
      new StraightFlush,
      new FourOfKind,
      new FullHouse,
      new Straight,
      new ThreeOfKind,
      new TwoPair,
      new OnePair,
      new HighCard
    )
  }
}
