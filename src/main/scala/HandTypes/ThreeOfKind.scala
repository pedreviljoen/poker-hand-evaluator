package HandTypes

import CardHand.{Hand, HandType}

class ThreeOfKind extends HandType {
  def evaluate(h: Hand): (Boolean, HandType) = (h.threeGrouping.toList.length == 1, new ThreeOfKind)

  override def toString: String = "Three of a Kind"
}

object ThreeOfKind {
  def apply(h: Hand): (Boolean, HandType) = (new ThreeOfKind).evaluate(h)
}
