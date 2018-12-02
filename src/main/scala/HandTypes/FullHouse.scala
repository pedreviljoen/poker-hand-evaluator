package HandTypes

import CardHand.{Hand, HandType}

class FullHouse extends HandType {
  def evaluate(h: Hand): (Boolean, HandType) = (h.pairGrouping.toList.length == 1 && h.threeGrouping.toList.length == 1, new FullHouse)

  override def toString: String = "Full House"
}

object FullHouse {
  def apply(h: Hand): (Boolean, HandType) = (new FullHouse).evaluate(h)
}
