import scala.annotation.tailrec;

object Start {
  //(min, max)
  @tailrec
  def start13(array: Array[Int], index: Int = 0, result: (Int, Int) = (0, 0)): (Int, Int) = {
    if (index == 0) {
      start13(array, index + 1, (array(index), array(index)))
    } else {
      if (index != array.length) {
        start13(array, index + 1,
          (if (array(index) < result._1) array(index) else result._1,
            if (array(index) > result._2) array(index) else result._2))
      } else {
        result
      }
    }
  }

//  def start14(array: Array[Int]) : Boolean = {
//    array.forall(number => (2 until number ^ 1 / 2).forall(x => number % x != 0))
//  }
  def start14(array: Array[Int]): Boolean = {
    array.foldLeft(true)((result, value) => result && (2 until value ^ 1 / 2 ).forall(x => value % x != 0))
  }

  def start1(array: Array[String]) : Array[String] = {
    array.filter(_.endsWith("++"))
  }
}

