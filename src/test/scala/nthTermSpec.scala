import org.scalatest._

class nthTermSpec extends WordSpec with MustMatchers {

  "nthTerm" must {

    "when given a list of '1,2,3,4,5' and n of '2' return '4' " in {
      nthTerm.assessor(List(1,2,3,4,5), 2) mustEqual 4
    }

  }

}
