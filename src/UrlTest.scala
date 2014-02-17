import java.net.{MalformedURLException, URL}

/**
 * User: ziqi.wll
 * Date: 14-1-22
 * Time: ÏÂÎç8:31
 */
class UrlTest {
  def urlFor(path:String) =
    try{
      new URL(path)
    }catch{
      case e:MalformedURLException =>
        new URL("http://www.scala.org")
    }



}
