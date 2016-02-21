//Question 5

/*
Part a - Define a trait called Shape and give it three abstract methods:

  i. sides returns the number of sides;
  ii. perimeter returns the total length of the sides;
  iii. area returns the area.

Implement Shape with three classes: Circle, Rectangle, and Square. In each
case provide implementations of each of the three methods. Ensure that the
main constructor parameters of each shape (e.g., the radius of the circle)
are accessible as fields.

Tip: The value of π is accessible as math.Pi.
 */

trait Shape {
  def sides: Int
  def perimeter: Int
  def area: Int
}

case class Circle(r: Int) extends Shape {
  override def sides: Int = 1
  override def perimeter: Int = math.Pi * 2 * r toInt
  override def area: Int = math.Pi * r * r toInt
}

case class Rectangle(x: Int, y: Int) extends Shape {
  override def sides: Int = 4
  override def perimeter = (x + y) * 2
  override def area = x * y
}

case class Square(x: Int) extends Shape {
  override def sides = 4
  override def perimeter = 4 * x
  override def area = x * x
}
