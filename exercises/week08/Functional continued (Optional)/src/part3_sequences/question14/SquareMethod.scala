package part3_sequences.question14

object SquareMethod {
  def squareList1(xs: List[Int]): List[Int] = xs match {
    case List() => xs
    case y :: ys => y * y :: squareList1(ys)
  }

  def squareList2(xs: List[Int]): List[Int] = xs map (x => x * x)
}

object Testing extends App {
  val list = List(1,2,3,4)
  println(SquareMethod.squareList1(list))
  println(SquareMethod.squareList2(list))
}
