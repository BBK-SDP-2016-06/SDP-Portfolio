package part3_sequences.question17

object FoldOps extends App {

  def mapFun[A, B](xs: List[A], f: A => B): List[B] =
    (xs :\ List[B]()){(x, xs) => f(x) :: xs}

  def lengthFun[A](xs: List[A]): Int =
    (0 /: xs){(xs, x) => xs + 1}

  //Testing
  val list1 = List("hello", "my", "name", "is", "George")
  val list2 = mapFun[String, Int](list1, s => s.length)
  println(list2)
  println(lengthFun(list1))

}
