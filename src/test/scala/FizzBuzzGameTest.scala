import org.scalatest.FunSuite

class FizzBuzzGameTest extends FunSuite {

  test("FizzBuzzGame.getResult") {

    var seq:Seq[String] = Seq("FizzBuzz")
    assert(FizzBuzzGame.getResult(Seq(15)) === seq)

    seq = Seq("Fizz")
    assert(FizzBuzzGame.getResult(Seq(3)) === seq)

    seq = Seq("Buzz")
    assert(FizzBuzzGame.getResult(Seq(5)) === seq)

    seq = Seq("4")
    assert(FizzBuzzGame.getResult(Seq(4)) === seq)

    seq = Seq("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")
    assert(FizzBuzzGame.getResult(Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)) === seq)

    println("Tests passing")
  }
}