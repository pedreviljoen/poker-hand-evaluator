package HandTypes

import CardHand.{Hand, HandType}

class StraightFlush extends HandType {
  def evaluate(h: Hand): (Boolean, HandType) = (h.isSameSuit && h.consecutiveCards, new StraightFlush)

  override def toString: String = "Straight Flush"
}

object StraightFlush {
  def apply(h: Hand): (Boolean, HandType) = (new StraightFlush).evaluate(h)
}