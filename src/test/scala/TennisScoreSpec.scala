import TennisScore.TennisPlayer
import org.scalatest.{MustMatchers, WordSpec}

class TennisScoreSpec extends WordSpec with MustMatchers {

  "TennisScore" must {

    "when Connor scores a point the score should read 'fifteen, love' " in {

      TennisScore.scoreBoard("Connor") mustEqual ("fifteen, love")

    }

    "when Connor scores a point and the score is 'fifteen, love' the score should read 'thirty, love' " in {

      TennisScore.scoreBoard("Connor") mustEqual ("thirty, love")
    }

    val m = new TennisPlayer("Michael")
    val c = new TennisPlayer("Connor")
  }
}