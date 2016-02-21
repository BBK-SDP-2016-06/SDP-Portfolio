//Question 5

/*
Part d - Write a sealed trait Colour to make our shapes more interesting.

  i. give Colour three properties for its RGB values;
  ii. create three predefined colours: Red, Yellow, and Pink;
  iii. provide a means for people to produce their own custom Colours with
  their own RGB values;
  iv. provide a means for people to tell whether any Colour is “light” or
  “dark”.

Note: A lot of this is left deliberately open to interpretation. The important
thing is to practice working with traits, classes, and objects. Decisions such as
how to model colours and what is considered a light or dark colour can either
be left up to you or discussed with other class members.
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
