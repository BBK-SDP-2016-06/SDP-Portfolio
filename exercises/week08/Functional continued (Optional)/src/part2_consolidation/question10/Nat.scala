package part2_consolidation.question10

abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat
  def +(that: Nat): Nat
  def -(that: Nat): Nat
}

class Succ(x: Nat) extends Nat {
  override def isZero = false
  override def predecessor: Nat = x
  override def successor: Nat = new Succ(this)
  override def +(that: Nat): Nat = x + that.successor
  override def -(that: Nat): Nat = if (that.isZero) this else x - that.predecessor
}

object Zero extends Nat {
  override def isZero = true
  override def predecessor: Nat = sys.error("negative number")
  override def successor: Nat = new Succ(Zero)
  override def +(that: Nat): Nat = that
  override def -(that: Nat): Nat = if(that.isZero) Zero else sys.error("negative number")
}

case class Sign(val isPositive: Boolean)

case class Integer(val nat: Nat, val sign: Sign) {
  def isPositive: Boolean = sign.isPositive
  def negate: Integer = Integer(nat, Sign(false))
}
