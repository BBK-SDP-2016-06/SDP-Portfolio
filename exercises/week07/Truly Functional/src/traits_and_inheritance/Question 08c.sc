//Question 8

/*
Part c - Implement the Pair class. It should store two values –– one and
two –– and be generic in both arguments. Example usage:

scala> val pair = Pair[String, Int]("hi", 2)
pair: Pair[String,Int] = Pair(hi,2)

scala> pair.one
res13: String = hi

scala> pair.two
res14: Int = 2
*/
case class Pair[A, B](one: A, two: B)
val pair: Pair[String, Int] = Pair("hi", 2)
pair.one
pair.two

val pair2 = Pair[String, Int]("bye", 10)
pair2.one
pair2.two


