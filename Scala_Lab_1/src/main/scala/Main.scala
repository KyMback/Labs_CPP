import scala.annotation.tailrec;

//object Main {
//  def main(args: Array[String]) :Unit = {
//    //val testData: Array[String] = Array("123", "12343", "1", "5432", "13242")
//    //print(Start.start(testData) + "\n")
//    //print(Start.trailStart(testData) + "\n")
//    print(Start.start2(4));
//  }
//}


object Start{
  def start(stringArray: Array[String], index: Int = 0): Int = {
    if(index != stringArray.length){
      val length2 = start(stringArray, index + 1)
      if(stringArray(index).length > length2) stringArray(index).length else length2
    }else{
      0
    }
  }

  @tailrec
  def trailStart(stringArray: Array[String], index: Int = 0, length: Int = 0): Int = {
    if(index != stringArray.length){
      if(stringArray(index).length > length)
        trailStart(stringArray, index + 1, stringArray(index).length)
      else
        trailStart(stringArray, index + 1, length)
    }else{
      length
    }
  }

  def start2(number: Int, resultValue: Int = 0, value: Int = 10 ): Int = {
    if(number %  2 != 0){
      //val result = resultValue * 10 + number % 10;
      start2(number / 2, resultValue * 2 + number % 2)

      //resultValue *= 10
      //val length2 = start(stringArray, index + 1)
      //if(stringArray(index).length > length2) stringArray(index).length else length2
    }else{
      resultValue
    }
  }

//  @tailrec
//  def trailStart2(number: Int, resultValue: Int = 0, value: Int = 1): Int = {
//    if(index != stringArray.length){
//      if(stringArray(index).length > length)
//        trailStart2()
//      else
//        trailStart2()
//    }else{
//      resultValue
//    }
//  }
}

