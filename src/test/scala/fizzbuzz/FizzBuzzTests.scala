package fizzbuzz

import org.junit.runner.RunWith
import org.scalatest.FunSpec
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FizzBuzzTests extends FunSpec {

  describe("FizzBuzz") {
    it("should return '1' for 1") {
      assert(FizzBuzz.buzzBuzzBuzz(1) == "1")
    }
    
    it("should return '1' for 2") {
      assert(FizzBuzz.buzzBuzzBuzz(2) == "2")
    }

    it("should return 'fizz' for 3") {
      assert(FizzBuzz.buzzBuzzBuzz(3) == "fizz")
    }

    it("should return 'fizz' for 6") {
      assert(FizzBuzz.buzzBuzzBuzz(6) == "fizz")
    }

    it("should return 'buzz' for 5") {
      assert(FizzBuzz.buzzBuzzBuzz(5) == "buzz")
    }

    it("should return 'fizzbuzz' for 15") {
      assert(FizzBuzz.buzzBuzzBuzz(15) == "fizzbuzz")
    }
  }
}
