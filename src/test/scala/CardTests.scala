import CardHand._
import HandTypes._
import org.scalatest.FunSuite

class CardTests extends FunSuite {

  // Card Test
  test("Generate a new Card") {
    assert(new Card("TD").toString === "TD")
    assert(new Card("4C").toString === "4C")
    assert(new Card("6D").toString === "6D")
    assert(new Card("AH").toString === "AH")
    assert(new Card("QH").toString === "QH")
  }

  // High Card Test
  test ("High Card Test") {
    val randomHand = Hand(List("4C", "6H", "AH", "TD", "2S"))

    assert(HighCard(randomHand)._2.toString === "High Card")
  }

  // One Pair Test
  test ("One Pair Test") {
    val randomHand = Hand(List("4C", "4D", "AH", "TD", "2S"))

    assert(OnePair(randomHand)._2.toString === "One Pair")
  }

  // Two Pairs Test
  test ("Two Pairs Test") {
    val randomHand = Hand(List("4C", "4D", "AH", "2D", "2S"))

    assert(TwoPair(randomHand)._2.toString === "Two Pairs")
  }

  // Three of Kind Test
  test ("Three of a Kind Test") {
    val randomHand = Hand(List("4C", "AD", "AH", "TD", "AS"))

    assert(ThreeOfKind(randomHand)._2.toString === "Three of a Kind")
  }

  // Straight Test
  test ("Straight Test") {
    val randomHand = Hand(List("4C", "5D", "6H", "7D", "8C"))

    assert(Straight(randomHand)._2.toString === "Straight")
  }

  // Flush Test
  test ("Flush Test") {
    val randomHand = Hand(List("4C", "6C", "AC", "TC", "2C"))

    assert(Flush(randomHand)._2.toString === "Flush")
  }

  // Full House Test
  test ("Full House Test") {
    val randomHand = Hand(List("4C", "4D", "AH", "AC", "AS"))

    assert(FullHouse(randomHand)._2.toString === "Full House")
  }

  // Four of Kind Test
  test ("Four of a Kind Test") {
    val randomHand = Hand(List("6C", "6H", "AH", "6D", "6S"))

    assert(FourOfKind(randomHand)._2.toString === "Four of a Kind")
  }

  // Straight Flush Test
  test ("Straight Flush Test") {
    val randomHand = Hand(List("5C", "6C", "7C", "8C", "9C"))

    assert(StraightFlush(randomHand)._2.toString === "Straight Flush")
  }
}
