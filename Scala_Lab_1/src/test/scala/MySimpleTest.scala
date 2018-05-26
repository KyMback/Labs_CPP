import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.FunSuite

class MySimpleTest extends FlatSpec with Matchers{
  "RecursiveTest" should "return 6" in {
    Start.start(Array("123", "412351", "5431", "rrge")) should be (6)
  }

  it should "return 1" in {
    Start.start(Array("1")) should be (1)
  }

  it should "return 0" in {
    Start.start(Array("")) should be (0)
  }

  "TailRecursiveTest" should "return 6" in {
    Start.trailStart(Array("123", "412351", "5431", "rrge")) should be (6)
  }

  it should "return 1" in {
    Start.trailStart(Array("1")) should be (1)
  }

  it should "return 0" in {
    Start.trailStart(Array("")) should be (0)
  }
}
