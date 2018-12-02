package HandTypes

import CardHand.{Hand, HandType}

class HighCard extends HandType {
  def evaluate(h: Hand): (Boolean, HandType) = (true, new HighCard)

  override def toString: String = "High Card"
}

object HighCard {
  def apply(h: Hand): (Boolean, HandType) = (new HighCard).evaluate(h)
}
