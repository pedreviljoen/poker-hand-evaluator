package CardHand

import scala.util.matching.Regex

case class Card(card: String) {
  def face: String = {
    card.substring(0,1)
  }

  def suit: String = {
    card.substring(1,2)
  }

  def faceValue: Int = {
    Card.value(face)
  }

  def isValid: Boolean = {
    new Regex("[2-10JQKA]{1}[HDCS]{1}").findAllIn(card).length > 0
  }
}

object Card {
  //
  def apply (card: String): Card = new Card(card)

  val faces: List[String] = (2 to 10).map(_.toString).toList ::: List("J", "Q", "K", "A")

  val suits: List[String] = List("H", "D", "C", "S")

  // finds a numerical equivalent value for the face of the card
  def value(face: String): Int = {
    values.find(i => i._1 == face).get._2
  }

  private val values: List[(String, Int)] = List(
    ("2", 2),
    ("3", 3),
    ("4", 4),
    ("5", 5),
    ("6", 6),
    ("7", 7),
    ("8", 8),
    ("9", 9),
    ("10", 10),
    ("J", 11),
    ("Q", 12),
    ("K", 13),
    ("A", 14))
}
