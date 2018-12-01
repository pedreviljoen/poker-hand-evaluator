trait HandType {
  def evaluate(hand: Hand): (Boolean, HandType, List[Int])
}
