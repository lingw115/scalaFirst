import io.Source

/**
 * User: ziqi.wll
 * Date: 14-1-9
 * Time: обнГ12:36
 */
object test {



  def widthofLength(s:String) = s.length

  def fileLines(file:java.io.File) =
    Source.fromFile(file).getLines()

  def main(args: Array[String]){
    val fileOp = new FileOper()
    fileOp.grep2("for")

  }

}
