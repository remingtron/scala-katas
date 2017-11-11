package check_writing

import scala.collection.immutable.TreeMap

class CheckWriter {

  def convertAmount(amount: Double) = {
    convertToString(amount.floor.toInt) +
      " dollar" + (if (amount.floor == 1) "" else "s") +
      " and " +
      "%02d".format(((amount - amount.floor) * 100).toInt) + "/100"
  }

  def convertToString(amount: Int) = {
    val conversions = TreeMap(1 -> "one",
      2 -> "two",
      3 -> "three",
      4 -> "four",
      5 -> "five",
      6 -> "six",
      7 -> "seven",
      8 -> "eight",
      9 -> "nine",
      10 -> "ten",
      11 -> "eleven",
      12 -> "twelve",
      13 -> "thirteen",
      14 -> "fourteen",
      15 -> "fifteen",
      16 -> "sixteen",
      17 -> "seventeen",
      18 -> "eighteen",
      19 -> "nineteen",
      20 -> "twenty")

    var pieces = List[String]()
    while (amount > 0) {
    }

  }

}
