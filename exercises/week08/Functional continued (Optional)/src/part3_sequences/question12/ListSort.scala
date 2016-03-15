package part3_sequences.question12

object ListSort {

  def isort(xs: List[Int]): List[Int] =
    if (xs.isEmpty) Nil
    else insert(xs.head, isort(xs.tail))

  def insert(x: Int, xs: List[Int]): List[Int] =
    if (xs.isEmpty) List(x)
    else if(x < xs.head) x :: xs
    else xs.head :: insert(x, xs.tail)
}

object Testing extends App {
  val list = List(5,8,9,3,20,15,13)
  val sortedList = ListSort.isort(list)
  println("Original list: " + list)
  println("Sorted list: " + sortedList)
}