//Question 6

/*
Scala developers don’t just use types to model data. Types are a great way to
put artificial limitations in place to ensure we don’t make mistakes in our
programs. In this exercise we will see a simple (if contrived) example of
this using types to prevent division by zero errors.

Dividing by zero is a tricky problem –– it can lead to exceptions. The JVM
has us covered as far as floating point division is concerned but integer
division is still a problem:

scala> 1.0 / 0.0
res0: Double = Infinity

scala> 1 / 0
java.lang.ArithmeticException: / by zero

Let’s solve this problem once and for all using types!

Create an object called divide with an apply method that accepts two Ints
and returns DivisionResult. DivisionResult should be a sealed trait with two
subtypes: a Finite type encapsulating the result of a valid division,
and an Infinite type representing the result of dividing by 0.

Here are some examples:
scala> divide(1, 2)
res7: DivisionResult = Finite(0)
scala> divide(1, 0)
res8: DivisionResult = Infinite

Finally, write a sample function that calls divide, matches on the result,
and returns a sensible description.
 */

object divide {
  def apply(x: Int, y: Int) = {
    y match {
      case 0 => new Infinite()
      case _ => new Finite(x / y)
    }
  }
}
sealed trait DivisionResult
case class Finite(result: Int) extends DivisionResult
case class Infinite() extends DivisionResult

//Testing
divide(1, 2)
divide(1, 0)

def divideF(x: Int, y: Int) = {
  val result = divide(x, y)
  result match {
    case Finite(z) => s"Division was successful, result is $z"
    case Infinite() => "Division was unsuccessful. Cannot divide by zero"
  }
}

//Testing
divideF(4,2)
divideF(4,0)
