//Question 10

/*
In a previous exercise question you “solved” the problem of dividing by
zero by defining a type called DivisionResult. This forced us to handle
the possibility of a division by zero in order to access the value.
With our knowledge of generics we can now generalise DivisionResult to
encapsulate potential errors of any type. Modify DivisionResult to create
a generic trait called Maybe with two subtypes, Full and Empty.
Rewrite divide to return a Maybe[Int].

Example usage:

divide(1, 0) match {
case Full(value) => println(s"It's finite: ${value}")
case Empty() => println(s"It's infinite")
}
 */

sealed trait Maybe[A]
final case class Full[A](result: A) extends Maybe[A]
final case class Empty[A]() extends Maybe[A]

object divide {
  def apply(num: Int, div: Int): Maybe[Int] = {
    div match {
      case 0 => Empty[Int]()
      case _ => Full[Int](num / div)
    }
  }
}

//Example of testing
divide(1, 0) match {
  case Full(value) => println(s"It's finite: $value")
  case Empty() => println(s"It's infinite")
}

divide(5, 1) match {
  case Full(value) => println(s"It's finite: $value")
  case Empty() => println(s"It's infinite")
}





