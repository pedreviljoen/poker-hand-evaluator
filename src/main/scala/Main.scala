import CardHand.Hand

object Main extends App {
  def main : Unit = {
    println("Poker hand evaluator")
    println("---------------------------------------------------------")
    println("Please enter a hand of 5 cards in the following format:")
    println("{Card Face}{Card Suit}")
    println("---------------------------------------------------------")
    println("Example: TH KS AC 7D TC")
    println("This should give output: One Pair")
    println("---------------------------------------------------------")

    val handString: String = scala.io.StdIn.readLine()
    val hand: Hand = Hand(handString.split(" ").toList)

    println("---------------------------------------------------------")
    println("Hand output: ")
    println(hand.evaluate(hand)._2.toString)
  }

  main
}
