package check_writing

import org.scalatest.Matchers

class CheckWriterSpec extends org.scalatest.path.FunSpec with Matchers {

  describe("CheckWriter") {

    val checkWriter = new CheckWriter

    it("converts 1.00 to 'one dollar and 00/100'") {
      checkWriter.convertAmount(1).shouldBe("one dollar and 00/100")
    }

    it("converts 2.00 to 'two dollars and 00/100'") {
      checkWriter.convertAmount(2).shouldBe("two dollars and 00/100")
    }

    it("converts 3.00 to 'three dollars and 00/100'") {
      checkWriter.convertAmount(3).shouldBe("three dollars and 00/100")
    }

    it("converts less than 10.00 to '(that number) dollars and 00/100'") {
      checkWriter.convertAmount(4).shouldBe("four dollars and 00/100")
      checkWriter.convertAmount(5).shouldBe("five dollars and 00/100")
      checkWriter.convertAmount(6).shouldBe("six dollars and 00/100")
      checkWriter.convertAmount(7).shouldBe("seven dollars and 00/100")
      checkWriter.convertAmount(8).shouldBe("eight dollars and 00/100")
      checkWriter.convertAmount(9).shouldBe("nine dollars and 00/100")
    }

    it("converts 1.01 to 'one dollar and 01/100'") {
      checkWriter.convertAmount(1.01).shouldBe("one dollar and 01/100")
    }

    it("converts 1.0X to 'one dollar and 0X/100'") {
      checkWriter.convertAmount(1.02).shouldBe("one dollar and 02/100")
      checkWriter.convertAmount(1.03).shouldBe("one dollar and 03/100")
      checkWriter.convertAmount(1.04).shouldBe("one dollar and 04/100")
      checkWriter.convertAmount(1.05).shouldBe("one dollar and 05/100")
      checkWriter.convertAmount(1.06).shouldBe("one dollar and 06/100")
      checkWriter.convertAmount(1.07).shouldBe("one dollar and 07/100")
      checkWriter.convertAmount(1.08).shouldBe("one dollar and 08/100")
      checkWriter.convertAmount(1.09).shouldBe("one dollar and 09/100")
    }

    it("converts teens correctly") {
      checkWriter.convertAmount(10.00).shouldBe("ten dollars and 00/100")
      checkWriter.convertAmount(11.00).shouldBe("eleven dollars and 00/100")
      checkWriter.convertAmount(12.00).shouldBe("twelve dollars and 00/100")
      checkWriter.convertAmount(13.00).shouldBe("thirteen dollars and 00/100")
      checkWriter.convertAmount(14.00).shouldBe("fourteen dollars and 00/100")
      checkWriter.convertAmount(15.00).shouldBe("fifteen dollars and 00/100")
      checkWriter.convertAmount(16.00).shouldBe("sixteen dollars and 00/100")
      checkWriter.convertAmount(17.00).shouldBe("seventeen dollars and 00/100")
      checkWriter.convertAmount(18.00).shouldBe("eighteen dollars and 00/100")
      checkWriter.convertAmount(19.00).shouldBe("nineteen dollars and 00/100")
    }

  }

}
