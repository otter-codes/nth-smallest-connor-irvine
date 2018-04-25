import org.scalatest.{MustMatchers, WordSpec}

class TennisScoreSpec extends WordSpec with MustMatchers {

  "TennisScore" must {

    val m = new TennisPlayer("Michael")
    val c = new TennisPlayer("Connor")
    val Tmatch = new TennisMatch(c, m)
    val ScoredMatch = TennisScore.scoreBoard(TennisPlayer("Connor", 2), TennisPlayer("Michael", 2))

    //    "when Connor scores a point the score should read 'fifteen, love' " ignore {
    //      TennisScore.scoreBoard("Connor") mustEqual ("fifteen, love")

    //    }

    //    "when Connor scores a point and the score is 'fifteen, love' the score should read 'thirty, love' " ignore {
    //      TennisScore.scoreBoard("Connor") mustEqual ("thirty, love")
    //    }

    "when a player scores a point and the score is '0, 0' the score should read 'Michael, 1' " in {

      Tmatch.scorePoint(TennisPlayer("Michael")) mustEqual TennisPlayer("Michael", 1)
    }

    "when a player scores a point and the score is '0, 1' the score should read 'Michael, 2' " in {
      Tmatch.scorePoint(TennisPlayer("Michael", 1)) mustEqual TennisPlayer("Michael", 2)
    }
    "when a player has no points, '0, 0' the score should read 'love' " in {
      TennisScore.scoreBoard(TennisPlayer("Connor"), TennisPlayer("Michael")) mustEqual ("love", "love")
    }

    "when a player has 1 point, '1, 0'  the score should read 'fifteen, love" in {
      TennisScore.scoreBoard(TennisPlayer("Connor", 1), TennisPlayer("Michael")) mustEqual ("fifteen", "love")
    }

    "when the home player scores a point and the score is 'thirty, thirty' return 'forty, thirty' " in {
      ScoredMatch(TennisPlayer("Connor", 2), TennisPlayer("Michael", 2)) mustEqual ("forty", "thirty")
    }
  }
}