import org.scalatest.{FlatSpec, Matchers}

class Tests extends FlatSpec with Matchers{
  "Part_1" should "return (-10, 16)" in {
    Start.start13(Array(1, 2 ,-5, 2, 16, 0, -10, -10)) should be (-10, 16)
  }

  it should "return (0 ,0)" in {
    Start.start13(Array(0, 0, 0, 0)) should be (0, 0)
  }

  it should "return (1, 1)" in {
    Start.start13(Array(1)) should be (1, 1)
  }

  "Part_2" should "return true" in {
    Start.start14(Array(5, 2, 17)) should be (true)
  }

  it should "return true_2" in {
    Start.start14(Array(1, 2)) should be (true)
  }

  it should "return false" in {
    Start.start14(Array(4, 1, 2)) should be (false)
  }

  "Part_3" should "return \"C++\"" in {
    Start.start1(Array("D", "C++", "F#", "Scala")) should be (Array("C++"))
  }

  it should "return \"C++\",\"++\"" in {
    Start.start1(Array("D", "C++", "++F#", "++")) should be (Array("C++", "++"))
  }

  it should "return " in {
    Start.start1(Array("D", "F#", "Scala")) should be (Array())
  }
}

