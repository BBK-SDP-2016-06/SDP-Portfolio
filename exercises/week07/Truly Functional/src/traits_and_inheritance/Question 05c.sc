//Question 5

/*
Part c -

  i. Make Shape a sealed trait.
  ii. Then write a singleton object called Draw with an apply method
      that takes a Shape as an argument and returns a description of
      it on the console.

      For example:

      Draw(Circle(10)) // returns "A circle of radius 10cm"
      Draw(Rectangle(3, 4))
      // returns "A rectangle of width 3cm and height 4cm"
      // and so on...

  iii. Finally, verify that the compiler complains when you comment out a
  case clause.
*/

sealed trait Shape {
  def sides: Int
  def perimeter: Int
  def area: Int
}

abstract class Rectangular(x: Int, y: Int) extends Shape{
  override def sides = 4
  override def perimeter = (x + y) * 2
  override def area = x * y
}

case class Circle(r: Int) extends Shape {
  override def sides: Int = 1
  override def perimeter: Int = math.Pi * 2 * r toInt
  override def area: Int = math.Pi * r * r toInt
}

case class Rectangle(x: Int, y: Int) extends Rectangular(x, y)

case class Square(x: Int) extends Rectangular(x, x)

object Draw {
  def apply(shape: Shape) = {
    shape match {
      case Circle(r) => println(s"A circle of radius $r" + "cm")
      case Square(x) => println(s"A square of side $x" + "cm")
      case Rectangle(x,y) => println(s"A rectangle of width $x"
        + s"cm and height $y" + "cm")
    }
  }
}

//Testing
Draw(Circle(10))
Draw(Rectangle(3, 4))
Draw(Square(5))

//verified that compiler complains with pattern matching when case
// clause is commented out.