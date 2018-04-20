import org.scalatest.{MustMatchers, WordSpec}

class BerlinClockSpec extends WordSpec with MustMatchers {

"BerlinClockSpec" must {

  "The Yellow lamp should blink on every 2 seconds(even numbers)" in {
    BerlinClock.seconds(0) mustEqual ("Y")
  }
  "The Yellow lamp should blink off every 2 seconds(odd numbers)" in {
    BerlinClock.seconds(1) mustEqual ("O")
  }

  //BRIEF FOR RED LAMPS DOES'T MAKE SENSE

}

}
