package traits_and_inheritance

case class Pair[A, B](one: A, two: B)

object Main extends App{
  val pair: Pair[String, Int] = Pair("hi", 2)
  val pair2 = Pair[String, Int]("bye", 5)
  println(pair2.one)
  println(pair2.two)
}
