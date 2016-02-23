package part1_generics.question02

sealed trait IntList {
  def length: Int = fold(0, (x,y) => 1 + y)

  def double: IntList = genericFold[IntList](End, (x,y) => Pair(x * 2, y))

  def product: Int = fold(1, (x,y) => x * y)

  def sum: Int = fold(0, (x,y) => x + y)

  def fold(end: Int, f: (Int, Int) => Int): Int =
    this match {
      case End => end
      case Pair(hd, tl) => f(hd, tl.fold(end, f))
    }

  def genericFold[A](end: A, f: (Int, A) => A): A =
    this match {
      case End => end
      case Pair(hd, tl) => f(hd, tl.genericFold(end, f))
    }
}

case class Pair(head: Int, tail: IntList) extends IntList
case object End extends IntList

object Testing extends App {
  val list = Pair(1, Pair(2, Pair(3, Pair(4, End))))
  assert(list.product == 24)
  assert(list.sum == 10)
  assert(list.length == 4)
  assert(list.double == Pair(2, Pair(4, Pair(6, Pair(8, End)))))
}