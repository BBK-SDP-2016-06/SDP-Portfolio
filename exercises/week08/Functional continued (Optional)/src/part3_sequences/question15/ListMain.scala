package part3_sequences.question15

object ListMain extends App {
  val xs = List(1, 2, 3, 4, 5, 0)

  def forall[A](f: A => Boolean)(xs: List[A]): Boolean = {
    def filter(f: A => Boolean)(xs: List[A]): List[A] = xs match {
      case Nil => Nil
      case y :: ys => if (f(y)) y :: ys.filter(f) else Nil
    }

    filter(f)(xs).length == xs.length
  }

  def exists[A](f: A => Boolean)(xs: List[A]): Boolean = {
    def filter(f: A => Boolean)(xs: List[A]): List[A] = xs match {
      case Nil => xs
      case y :: ys => if (f(y)) List(y) else ys.filter(f)
    }
    filter(f)(xs).nonEmpty
  }

  assert(exists[Int](x => x > 3)(xs))
  assert(!exists[Int](x => x < 0)(xs))

  assert(forall[Int](x => x >= 0)(xs))
  assert(!forall[Int](x => x > 3)(xs))
}
