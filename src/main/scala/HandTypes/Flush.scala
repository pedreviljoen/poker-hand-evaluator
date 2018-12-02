package HandTypes
import CardHand.{Hand, HandType}

class Flush extends HandType {
  def evaluate(h: Hand): (Boolean, HandType) = {
    (h.isSameSuit, new Flush)
  }
}

object Flush {
  def apply(h: Hand): (Boolean, HandType) = (new Flush).evaluate(h)
}
