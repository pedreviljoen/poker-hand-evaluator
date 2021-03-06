package HandTypes
import CardHand.{Hand, HandType}

class FourOfKind extends HandType {
  def evaluate(h: Hand): (Boolean, HandType) = (h.fourGrouping.toList.length == 1, new FourOfKind)

  override def toString: String = "Four of a Kind"
}

object FourOfKind {
  def apply(h: Hand): (Boolean, HandType) = (new FourOfKind).evaluate(h)
}
