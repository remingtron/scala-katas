package euler

import org.scalatest.{Matchers, path}

import scala.collection.mutable.ListBuffer

class ProjectEulerTests extends path.FunSpec with Matchers {

  describe("Project Euler") {

    it("solves level 2") {

      var prior = 1
      var current = 1
      var total = 0

      while (current < 4000000) {
        val next = current + prior
        prior = current
        current = next

        if (current % 2 == 0) {
          total += current
        }
      }

      total shouldBe 0

    }

    it("solves level 3") {

      var value = 600851475143L
      var divisorCandidate = 2
      var divisors = ListBuffer[Int]()

      while (value > 1) {
        if (value % divisorCandidate == 0) {
          divisors += divisorCandidate
          value = value / divisorCandidate
        } else {
          divisorCandidate += 1
        }
      }

      divisors.toList shouldBe List()
    }

    it("solves level 4") {

      val foo = (100 until 1000).flatMap(i => (100 until 1000).map(j => j * i))
        .filter(i => String.valueOf(i).equals(String.valueOf(i).reverse)).max
      foo shouldBe 0

    }

  }
}
