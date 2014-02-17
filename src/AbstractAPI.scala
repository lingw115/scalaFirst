import java.io.File

/**
 * User: ziqi.wll
 * Date: 14-1-28
 * Time: ÏÂÎç4:34
 */
object AbstractAPI {
  private def filesHear = (new File(".")).listFiles()
  private def filesMatching(matcher:String => Boolean) =
    for (file <- filesHear; if matcher(file.getName) )
    yield file

  def fileEnding(query:String) =
    filesMatching(_.endWith(query))

  def fileContaining(query:String) =
    filesMatching(_.contains(query))

  def fileRegex(query:String) =
    filesMatching(_.matches(query))
}
