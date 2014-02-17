import io.Source
import java.io.File

/**
 * User: ziqi.wll
 * Date: 14-1-22
 * Time: обнГ4:49
 */
class FileOper {
  val fileHere = (new File(".")).listFiles

  def getFileLines(file: File) =
    Source.fromFile(file).getLines()

  def grep(pattern:String) = {
    for {file <- fileHere
      if file.getName.endsWith(".scala")
      line <- getFileLines(file)
      if line.trim.matches("pattern")
    }
      println(file + ":" + line.trim)
  }

  def grep1(pattern:String) =
    for{file <- fileHere
        if file.getName.endsWith(".scala")
        line <- getFileLines(file)
        trimmed = line.trim
        if trimmed.matches("pattern")
      }
      println(file + ":" + line.trim)

  def grep2(pattern:String) =
    for {file <- fileHere
      if file.getName.endsWith(".scala")
      line <- getFileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    } yield  trimmed.length

  def processFile(filename:String, width:Int){
    def processLine(filename:String, width:Int, line:String){
      if (line.length>width) println(filename+":"+line)
    }
    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(filename, width, line)
  }
}




