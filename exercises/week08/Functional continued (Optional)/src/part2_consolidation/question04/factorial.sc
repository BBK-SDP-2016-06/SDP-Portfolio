//Normal recursive function for computing factorial
def factorial (n: Int): Int =
  if (n <= 0) 1 else n * factorial(n - 1)

//Tail recursive function for computing factorial
def tailFactorial(n: Int, product: Int = 1): Int =
  if (n <= 0) product else tailFactorial(n - 1, n * product)

//Testing
factorial(10)
tailFactorial(10)

factorial(4)
tailFactorial(4)

factorial(3)
tailFactorial(3)

factorial(0)
tailFactorial(0)

factorial(-1)
tailFactorial(-1)