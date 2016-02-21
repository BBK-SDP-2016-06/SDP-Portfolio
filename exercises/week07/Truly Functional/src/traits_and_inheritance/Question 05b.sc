//Question 5

/*
Part b - The solution from part a delivered three distinct types of shape.
However, it doesn’t model the relationships between the three correctly. A
Square isn’t just a Shape – it’s also a type of Rectangle where the width
and height are the same.
We want to avoid case-class-to-case-class inheritance, so refactor the
solution to the last exercise so that Square and Rectangle are subtypes
of a common type Rectangular.
*/

trait Shape {
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

