//Tail recursive method
def tailSum(f: Int => Int)(a: Int, b: Int): Int = {
  def iter(a: Int, result: Int): Int = {
    if(a > b) result
    else iter(a + 1, f(a) + result)
  }
  iter(a, 0)
}
//Non-tail recursive method
def sum(f: Int => Int)(a: Int, b: Int): Int = {
  if (a > b) 0 else f(a) + sum(f)(a + 1, b)
}
//Testing
val square = (x: Int) => x * x
val cube = (x: Int) => x * x * x
val map = (x: Int) => x

tailSum(square)(1, 10)
sum(square)(1, 10)

tailSum(map)(1, 3)
sum(map)(1, 3)