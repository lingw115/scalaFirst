/**
 * User: ziqi.wll
 * Date: 14-1-9
 * Time: обнГ8:44
 */
import bobsdelights.Fruit
object Test1 {
  def showFruit(fruit:Fruit){
    import fruit._
    println(name + "s name " + color)
  }

  def main(args:Array[String]){
    val x = new Rational(5, 4)
    val x1 = new Rational(1, 2)
    val x2 = new Rational(3, 3)
    println(x + x1*x2)
    println( x * 2)

  }
}
