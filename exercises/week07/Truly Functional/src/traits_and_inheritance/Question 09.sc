//Question 9

/*
Implement a trait Sum[A, B] with two subtypes Left and Right. Create type
parameters so that Left and Right can wrap up values of two different types.

Hint: you will need to put both type parameters on all three types.
Example usage:

scala> Left[Int, String](1).value
res24: Int = 1

scala> Right[Int, String]("foo").value
res25: String = foo

scala> val sum: Sum[Int, String] = Right("foo")
sum: Sum[Int,String] = Right(foo)

scala> sum match {
| case Left(x) => x.toString
| case Right(x) => x
| }
res26: String = foo

*/

trait Sum[A, B]

case class Left[A, B](value: A) extends Sum[A, B]

case class Right[A, B](value: B) extends Sum[A, B]

Left[Int, String](1).value
Right[Int, String]("foo").value

val sum: Sum[Int, String] = Right("foo")

sum match {
  case Left(x) => x.toString
  case Right(x) => x
}