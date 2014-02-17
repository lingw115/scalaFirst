import java.util.Date

/**
 * User: ziqi.wll
 * Date: 14-1-9
 * Time: обнГ4:55
 */
class ComplexNum(y:Int, m:Int, d:Int) extends Ord  {
   def year = y
   def month = m
   def day = d
   override def toString():String = year+"-"+month+"-"+day;
   override def equals(that:Any):Boolean = {
     that.isInstanceOf[Date]&&{
       val o = that.asInstanceOf[Date]
       o.getDay() == this.day &&o.getYear()==this.year && o.getMonth() == this.month
     }
   }
  override def <(that:Any):Boolean = {
    that.isInstanceOf[Date] &&{
      val o = that.asInstanceOf[Date]
      this.year > o.getYear||
      (this.year == o.getYear && this.month > o.getMonth)||
      (this.year == o.getYear && this.month == o.getMonth && this.day>o.getDay)
    }
  }


}



