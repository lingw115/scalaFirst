/**
 * User: ziqi.wll
 * Date: 14-1-17
 * Time: ����5:42
 */
import ChecksumAccumulator.calcuate

object FallWinter extends Application {
  for(season <-List("fall", "winter", "spring"))
    println(calcuate(season).toString)

}
