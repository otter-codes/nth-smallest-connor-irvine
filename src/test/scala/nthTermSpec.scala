import org.scalatest._

class nthTermSpec extends WordSpec with MustMatchers {

  "nthTerm" must {

    "when given a list of '1,2,3,4,5' and n of '2' return '4' " in {
      nthTerm.assessor(List(1,2,3,4,5), 2) mustEqual 4
    }

    "when given a list of '3, 3, 4, 4, 5, 5' and n of '3' return '3' " in {
      nthTerm.assessor(List(3, 3, 4, 4, 5, 5), 3) mustEqual 3
    }
    "when given a list of '1, 2' and n of '3' return 'error' " in {
      intercept[NumberFormatException] {
        nthTerm.assessor(List(1, 2), 3) mustEqual new NumberFormatException
      }

    }
}
