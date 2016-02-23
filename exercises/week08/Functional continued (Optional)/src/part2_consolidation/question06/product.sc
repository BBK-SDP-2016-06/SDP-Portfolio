//Tail recursive method
def tailProduct(f: Int => Int)(a: Int, b: Int): Int = {
  def iter(a: Int, result: Int): Int = {
    if(a > b) result
    else iter(a + 1, f(a) * result)
  }
  iter(a, 1)
}

//Non-tail recursive method
def product(f: Int => Int)(a: Int, b: Int): Int = {
  if (a > b) 1 else f(a) * product(f)(a + 1, b)
}

//Testing
val square = (x: Int) => x * x
val cube = (x: Int) => x * x * x
val map = (x: Int) => x

tailProduct(map)(1, 3)
product(map)(1, 3)