package HandTypes

import CardHand.{Hand, HandType}

class TwoPair extends HandType {
  def evaluate(h: Hand): (Boolean, HandType) = (h.pairGrouping.toList.length == 2, new TwoPair)

  override def toString: String = "Two Pairs"
}

object TwoPair {
  def apply(h: Hand): (Boolean, HandType) = (new TwoPair).evaluate(h)
}
