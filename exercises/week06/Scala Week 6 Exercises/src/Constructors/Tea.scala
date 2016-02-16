package Constructors

//Question 11

import com.atomicscala.AtomicTest._

class Tea(name:String = "Earl Grey",
          milk:Boolean = false,
          sugar:Boolean = false,
          decaf:Boolean = false) {

  def describe = {
    var output = "" + name
    if (decaf) output += " decaf"
    if (milk) output += " + milk"
    if (sugar) output += " + sugar"
    output
  }

  def calories = {
    var output = 0
    if (milk) output += 100
    if (sugar) output += 16
    output
  }
}

object TeaScript extends App {
  val tea = new Tea
  tea.describe is "Earl Grey"
  tea.calories is 0

  val lemonZinger = new Tea(decaf = true, name = "Lemon Zinger")
  lemonZinger.describe is "Lemon Zinger decaf"
  lemonZinger.calories is 0

  val sweetGreen = new Tea(name = "Jasmine Green", sugar = true)
  sweetGreen.describe is "Jasmine Green + sugar"
  sweetGreen.calories is 16

  val teaLatte = new Tea(sugar = true, milk = true)
  teaLatte.describe is "Earl Grey + milk + sugar"
  teaLatte.calories is 116
}
