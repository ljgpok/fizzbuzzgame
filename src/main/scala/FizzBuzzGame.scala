object FizzBuzzGame extends App {
  def getResult(number: Seq[Int]) : Seq[String] = {

    val seq:Array[Seq[String]] = new Array[Seq[String]](number.length+2)

    seq(0) = Seq()

    for (i <- number.indices) {

      var word:String = new String()

      if (number(i) % 15 == 0 ) word = "FizzBuzz"
      else
      if (number(i) % 3 == 0) word = "Fizz"
      else
      if (number(i) % 5 == 0) word = "Buzz"
      else word = number(i).toString

      seq(i+1) = seq(i) :+ word
    }

    seq(number.length)
  }
}
