object nthTerm extends App {

  def assessor(OGList: List[Int], n: Int) : Int = {
    try {
      val reverseList = OGList.sorted.reverse.distinct
      reverseList(n - 1)

    } catch {
      case e : IndexOutOfBoundsException =>
        throw new IndexOutOfBoundsException("error")
    }
  }

}
