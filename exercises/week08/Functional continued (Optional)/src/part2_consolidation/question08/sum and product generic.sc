//Original Product method
def product(f: Int => Int)(a: Int, b: Int): Int = {
  def iter(a: Int, result: Int): Int = {
    if(a > b) result
    else iter(a + 1, f(a) * result)
  }
  iter(a, 1)
}

//Original Sum method
def sum(f: Int => Int)(a: Int, b: Int): Int = {
  def iter(a: Int, result: Int): Int = {
    if(a > b) result
    else iter(a + 1, f(a) + result)
  }
  iter(a, 0)
}

//General function
def abstraction(f: Int => Int)
               (g: (Int, Int) => Int)
               (a: Int, b: Int, base: Int): Int = {
  def iter(a: Int, result: Int): Int = {
    if (a > b) result
    else iter(a + 1, g(f(a), result))
  }
  iter(a, base)
}

//Product method using abstraction
def productAb(f: Int => Int)(a: Int, b: Int) =
  abstraction(f)((x: Int, y: Int) => x * y)(a, b, 1)

//Sum method using abstraction
def sumAb(f: Int => Int)(a: Int, b: Int) =
  abstraction(f)((x: Int, y: Int) => x + y)(a, b, 0)

//Testing
val square = (x: Int) => x * x
val cube = (x: Int) => x * x * x
val map = (x: Int) => x

productAb(map)(1, 5)
sumAb(map)(1, 5)

productAb(square)(2, 3)
sumAb(square)(1, 3)

abstraction(square)((x, y) => x + y)(1, 3, 0)

