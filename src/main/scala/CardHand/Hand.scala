package CardHand

class Hand (cards: List[Card]) {
  // sort hand according to value of face. A -> K -> Q -> J etc...
  def sortedHand: List[Card] = cards.sortWith(_.faceValue > _.faceValue)

  // evaluate the hand, runs through all hand types classes and checks a match
  def evaluate(h: Hand): (Hand, HandType) = {
    Hands.types.collect { case handType => handType.evaluate(h)}.find { case (b, hand) => b } match {
      case None           => throw new Error("Something went wrong")
      case Some(handType) => (h, handType._2)
    }
  }

  // other evaluations. ie Valid CardHand.Hand, Same suit, consecutive numbers, grouping (for pair, three of kind and four of kind)
  def isValidHand: Boolean = cards.length == 5

  def isSameSuit: Boolean = {
    cards.groupBy(_.suit)
      .toList.length == 1
  }

  def consecutiveNumbers: Boolean = {
    val sortedCards = sortedHand.map(_.faceValue)

    (sortedCards.max to sortedCards.min by -1).toList == sortedCards
  }

  def groupByFace(groupingNumber: Int): Map[String, List[Card]] = {
    cards.groupBy(_.face)
      .filter {case (faceType, listOfFaces) => listOfFaces.length == groupingNumber}
  }

  def pairGrouping:   Map[String, List[Card]] = groupByFace(2)
  def threeGrouping:  Map[String, List[Card]] = groupByFace(3)
  def fourGrouping:   Map[String, List[Card]] = groupByFace(4)

  def stringDescription: String = cards.map(_.toString).mkString(" ")
}

object Hand {
  def apply(cards: List[String]): Hand = {
    val cardList = cards.collect { case cardString: String => new Card(cardString)}
    new Hand(cardList)
  }
}