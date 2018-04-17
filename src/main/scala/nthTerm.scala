object nthTerm extends App {

  def assessor(OGList: List[Int], n: Int) : Int = {

    val reverseList = OGList.reverse.distinct
    reverseList(n-1)
  }
}
