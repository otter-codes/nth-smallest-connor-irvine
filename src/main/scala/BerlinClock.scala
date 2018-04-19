object BerlinClock extends App {


  def seconds(second: Int) : String ={
    if (second%2 == 0) "Y" else "O"
  }
}
