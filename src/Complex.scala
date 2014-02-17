/**
 * User: ziqi.wll
 * Date: 14-1-9
 * Time: ÏÂÎç1:49
 */

import collection.mutable
import scala.collection.mutable.Map

class Complex(real:Double, imaginary:Double){
  def rem={
    real
  }
  def im= {
    imaginary
  }
}

trait Ord{
  def < (that:Any):Boolean
  def <=(that:Any):Boolean = (this < that) ||(this == that)
  def > (that:Any):Boolean = (this > that)
  def >=(that:Any):Boolean = !(this < that)

}

class Reference[T]{
  private var contents:T = _
  def set(value:T) {contents = value}
  def get:T = contents
}

class GetMap{
  def getMap:Map[Int, String]={
    val treasureMap = Map[Int, String]()
    treasureMap += (1 -> "Go to island")
    treasureMap += (2 -> "find big x on ground")
    treasureMap += (3 -> "dig a hole on the ground")
    treasureMap
  }
}

class ChecksumAccumulator{
  private var sum:Int = _
  def add(b:Byte) {
    sum += b
  }
  def checksum():Int = -(sum & 0xFF) + 1

}

object ChecksumAccumulator{
  private val cache = mutable.Map[String, Int]()
  def calcuate(s:String):Int =
    if (cache.contains(s)) cache(s)
    else {
      val cc = new ChecksumAccumulator
      for(c <- s)
        cc.add(c.toByte)
        val cs = cc.checksum()
        cache += (s -> cs)
        cs
    }
}