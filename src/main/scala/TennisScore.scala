object TennisScore {

  val point = Map(0 -> "love", 1 -> "fifteen", 2 -> "thirty", 3 -> "forty", 4 -> "Wins Set")
  val homePlayer = new TennisPlayer("Connor")
  val awayPlayer = new TennisPlayer("Michael")

    def scoreBoard(playerHome: TennisPlayer, playerAway: TennisPlayer): (String, String) = {
      (point(playerHome.point) , point(playerAway.point))


  //    val tennisMatch = new TennisMatch(homePlayer.scoreHome, awayPlayer.scoreAway)
    }
}

class TennisMatch(homePlayer: TennisPlayer, awayPlayer: TennisPlayer) {
  def scorePoint(player: TennisPlayer) : (TennisPlayer) = {
player.copy(point = player.point + 1)

  }
}

case class TennisPlayer(val name: String, point: Int = 0) {
}