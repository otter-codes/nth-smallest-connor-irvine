object nthTerm extends App {

  def assessor(OGList: List[Int], n: Int) : Int = {
 val a = OGList.reverse

    a.indexOf(n-1)
  }

}
