package HandTypes

import CardHand.{Hand, HandType}

class Straight extends HandType {
  def evaluate(h: Hand): (Boolean, HandType) = (h.consecutiveCards, new Straight)

  override def toString: String = "Straight"
}

object Straight {
  def apply(h: Hand): (Boolean, HandType) = (new Straight).evaluate(h)
}


