package fizzbuzz

object FizzBuzz {
  def buzzBuzzBuzz(number: Int): String = {
    val IsMultipleOfThree = new IsMultipleOf(3)
    val IsMultipleOfFive = new IsMultipleOf(5)
    val IsMultipleOfFifteen = new IsMultipleOf(15)

    number match {
      case IsMultipleOfFifteen(n) => "fizzbuzz"
      case IsMultipleOfThree(n) => "fizz"
      case IsMultipleOfFive(n) => "buzz"
      case _ => String.valueOf(number)
    }
  }
}

class IsMultipleOf(divisor: Int) {
  def unapply(underTest: Int): Option[Boolean] = if (underTest % divisor == 0) Some(true) else None
}
