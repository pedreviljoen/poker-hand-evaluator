package HandTypes

import CardHand.{Hand, HandType}

class OnePair extends HandType {
  def evaluate(h: Hand): (Boolean, HandType) = (h.pairGrouping.toList.length == 1, new OnePair)

  override def toString: String = "One Pair"
}

object OnePair {
  def apply(h: Hand): (Boolean, HandType) = (new OnePair).evaluate(h)
}
