package CardHand

trait HandType {
  def evaluate(hand: Hand): (Boolean, HandType)
}
