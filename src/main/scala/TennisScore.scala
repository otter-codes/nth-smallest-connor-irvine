object TennisScore {

  val points = Map(0 -> "love", 1 -> "fifteen", 2 -> "thirty", 3 -> "forty", 4 -> "Wins Set")

  
    def scoreBoard(homeScore: String, awayScore: String): String = {
      val homePlayer = new TennisPlayer("Connor")
      val awayPlayer = new TennisPlayer("Michael")
      val tennisMatch = new TennisMatch(homePlayer.scorePoint, awayPlayer.scorePoint)
    }

}

class TennisMatch(homePlayer: TennisPlayer, awayPlayer: TennisPlayer) {
  def scorePoint = {

  }

}

class TennisPlayer(val name: String) {

}