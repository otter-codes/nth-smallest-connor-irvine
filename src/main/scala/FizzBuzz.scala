object FizzBuzz {

  def multiples(Digit: Int): String = {
   if (Digit%15==0) return "FizzBuzz"
    else if (Digit%3==0) return "Fizz"
   else (Digit%5==0); "Buzz"
  }
}