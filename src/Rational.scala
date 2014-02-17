/**
 * User: ziqi.wll
 * Date: 14-1-20
 * Time: обнГ2:44
 */
class Rational(n:Int, d:Int) {
  require(d!=0)
  private val g = gcd(n.abs, d.abs)
  val numer:Int = n/g
  val denom:Int = d/g

  override def toString = numer + "/" + denom

  def this(n:Int) = this(n,1)

  def add(that:Rational):Rational =
   new Rational(n*that.numer +that.denom*d, d*that.denom)

  def lessThan(that:Rational) =
    this.numer*that.denom < that.numer*this.numer

  def max(that:Rational):Rational =
    if (this.lessThan(that)) that else this

  private def gcd(a:Int, b:Int):Int =
    if (b == 0) a else gcd(b, a%b)

  def +(that:Rational) =
    new Rational(numer*that.numer +that.denom*denom, denom*that.denom)

  def *(that:Rational) =
    new Rational(numer*that.numer, denom*that.denom)

  def *(that:Int) =
    new Rational(numer*that, denom)

  def /(that:Int) =
    new Rational(numer, denom*that)

//  implicit def intToRational(x:Int) = new Rational(x)
}
