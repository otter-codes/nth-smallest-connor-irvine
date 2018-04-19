import org.scalatest.{MustMatchers, WordSpec}

class FizzBuzzSpec extends WordSpec with MustMatchers {

  "FizzBuzz" must {

    "When given a multiple of '3', '3' return 'Fizz' " in {
      FizzBuzz.multiples(3) mustEqual "Fizz"

    }
    "When given a multiple of '3', '6' return 'Fizz' " in {
      FizzBuzz.multiples(6) mustEqual "Fizz"

    }
    "When given a multiple of '5', '5' return 'Buzz' " in {
      FizzBuzz.multiples(5) mustEqual "Buzz"

    }
    "When given a multiple of '5', '10' return 'Buzz' " in {
      FizzBuzz.multiples(10) mustEqual "Buzz"

    }
    "When given a multiple of '15', '15' return 'FizzBuzz' " in {
      FizzBuzz.multiples(15) mustEqual "FizzBuzz"
    }
  }
}