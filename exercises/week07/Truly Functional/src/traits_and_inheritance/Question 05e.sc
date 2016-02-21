//Question 5

/*
Part e - Edit the code for Shape and its subtypes to add a colour to each
shape. Finally, update the code for Draw.apply to print the colour of the
argument as well as its shape and dimensions (hint: you may want to deal with the colour in
a helper method):

  i. if the argument is a predefined colour, print that colour by name:
  ii. if the argument is a custom colour rather than a predefined one,
  print the word “light” or “dark” instead.

*/

sealed trait Colour {
  def r: Int
  def g: Int
  def b: Int
}

sealed trait Brightness {
  def isLight: Boolean
}

case class Red() extends Colour {
  override def r = 255
  override def g = 0
  override def b = 0
}

case class Yellow() extends Colour {
  override def r = 255
  override def g = 255
  override def b = 0
}

case class Pink() extends Colour {
  override def r = 255
  override def g = 153
  override def b = 153
}

case class CustomColour(r: Int, g: Int, b: Int, isLight: Boolean) extends Colour with Brightness

sealed trait Shape {
  def sides: Int
  def perimeter: Int
  def area: Int
  def colour: Colour
}

abstract class Rectangular(x: Int, y: Int, colour:Colour) extends Shape {
  override def sides = 4
  override def perimeter = (x + y) * 2
  override def area = x * y
}

case class Circle(r: Int, colour: Colour) extends Shape {
  override def sides: Int = 1
  override def perimeter: Int = math.Pi * 2 * r toInt
  override def area: Int = math.Pi * r * r toInt
}

case class Rectangle(x: Int, y: Int, colour: Colour) extends Rectangular(x, y, colour)

case class Square(x: Int, colour: Colour) extends Rectangular(x, x, colour)

object Draw {
  def apply(shape: Shape) = {
    shape match {
      case Circle(r, c) => println("A " + helper(c) + s" circle of radius $r" + "cm")
      case Square(x, c) => println("A " + helper(c) + s" square of side $x" + "cm")
      case Rectangle(x, y, c) => println("A " + helper(c) + s" rectangle of width $x"
        + s"cm and height $y" + "cm")
    }
  }

  def helper(colour: Colour) = {
    colour match {
      case Red() => "red"
      case Yellow() => "yellow"
      case Pink() => "pink"
      case CustomColour(r, b, g, isLight) if isLight => "light"
      case CustomColour(r, b, g, isLight) if !isLight => "dark"
    }
  }
}

//Testing
Draw(Circle(10, CustomColour(5, 10, 15, true)))
Draw(Circle(10, Red()))
Draw(Square(30, Pink()))