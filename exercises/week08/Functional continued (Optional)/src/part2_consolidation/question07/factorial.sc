def product(f: Int => Int)(a: Int, b: Int): Int = {
  def iter(a: Int, result: Int): Int = {
    if(a > b) result
    else iter(a + 1, f(a) * result)
  }
  iter(a, 1)
}

def factorial(x: Int): Int = product((x: Int) => x)(1, x)

//Testing

factorial(4)
//res0: Int = 24

factorial(3)
//res1: Int = 6

factorial(2)
//res2: Int = 2

factorial(1)
//res3: Int = 1

factorial(0)
//res4: Int = 1

factorial(-1)
//res5: Int = 1