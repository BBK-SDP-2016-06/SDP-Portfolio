//Question 1

def getSquare(x : Int) : Int = {
  val y = x * x
  println(y)
  y
}

val a = getSquare(3)
assert(a == 9)

val b = getSquare(6)
assert(b == 36)

val c = getSquare(5)
assert(c == 25)

//Question 2

def isArg1GreaterThanArg2(d1 : Double, d2 : Double) : Boolean = {
  val output = if(d1 > d2) true else false
  println(output)
  output
}

val t1 = isArg1GreaterThanArg2(4.1, 4.12)
assert(t1 == false)

val t2 = isArg1GreaterThanArg2(2.1, 1.2)
assert(t2)

//Question 3

def manyTimesString(str : String, num : Int) : String = {
  var output = ""
  for(x <- 0 until num) output += str
  output
}

val m1 = manyTimesString("abc", 3)
assert("abcabcabc" == m1, "It works!!")

val m2 = manyTimesString("123", 2)
assert("123123" == m2, "It works!!")





