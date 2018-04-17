import org.scalatest._

class nthTermSpec extends WordSpec with MustMatchers {

  "nthTerm" must {

    "when given an empty list return 'no elements' " in {
      nthTerm.assessor mustEqual "no elements"
    }

  }

}
