import com.atomicscala.AtomicTest._

//Question 1
//a
var a1 = 42
//value = 42, type = Int
//b
var b1 = true
//value = true, type = Boolean

//c
var c1 = 123L
//value = 123, type = Long

//d
var d1 = 42.0
//value = 42.0, type = double



//Question 2
//a
var characterLiteral = 'a'
//value = 'a', type = Char

//b
var stringLiteral = "a"
//value = "a", type = String



//Question 3
//a
"Hello World!" //value = "Hello World", type = String
println("Hello World!") //value = void, type = Unit
/*
The first of the above two statements stores the String "Hello World" into
a String variable. The second expression produces a void variable, with a
side effect of printing "Hello World" to the console.
 */



//Question 4
//'Hello World' results in a compile error
'Hello //result in a value = Hello, of type = Symbol



//Question 5
//a
val a = 1
val b = 2
if(a > b) "alien" else "predator"
//value = predator, type = String
//b
if(a > b) "alien" else 2001
//value = 2001, type = Any
//c
if(true) "hello"
//value = hello, type = Any



//Question 6
//a
1 + 2 + 3

//b
6

/*
The above two expressions are similar in that they both produce the result
6 and store this value in an Int variable. The only difference is in the
way each result is computed.
 */



//Question 7
object calc {

  def square(x : Double) : Double = {x*x}
  def cube(x : Double) : Double = {square(x)*x}

}



//Question 8
object calc2 {

  def square(x: Double): Double = {x*x}

  def square(x: Int): Int = {square(x.toDouble).toInt}

  def cube(x: Double): Double = {square(x) * x}

  def cube(x: Int): Int = {cube(x.toDouble).toInt}

}



//Question 9
object argh {
  def a = {
    println("a")
    1
  }

  val b = {
    println("b")
    a + 2
  }
  def c = {
    println("c")
    a
    b + "c"
  }
}

argh.c + argh.b + argh.a



//Question 10
//a
class Person (fN : String, lN : String) {
  var firstName = fN
  var lastName = lN
}

val person1 = new Person("George", "Smith")

//b
object Alien {
  def greet(person : Person) : Unit = {
    println("Greetings " + person.firstName)
  }
}

Alien.greet(person1)



//Question 11
/*
Methods can comprise of expressions and can return certain values
 */



//Question 12
import Question12package.{ClassA, ClassB, ClassC}
var testClassA = new ClassA
var testClassB = new ClassB
var testClassC = new ClassC



//Question 13
val r1: Range = 0 until 10
val r2 = r1.inclusive



//Question 14
var total = 0
for (i <- r2) {
  total += i
}
total is 55



//Question 15
var totalEvens = 0
for {i <- r2 if i % 2 == 0} totalEvens += i
totalEvens is 30



//Question 16
var evens = 0
var odds = 0
for (i <- r2) {
  if (i % 2 == 0) evens += i else odds += i
}
evens is 30
odds is 25



//Question 17
val v1 = Vector[String]("The", "dog", "visited", "the", "firehouse")
var sentence = ""
for(i <- v1.indices) sentence += v1.apply(i) + " "
sentence = sentence.substring(0, sentence.length() - 1) + "!"
sentence is "The dog visited the firehouse!"



//Question 18
sentence = ""
for(i <- v1.indices) sentence += v1.apply(i).reverse + " "
sentence = sentence.substring(0, sentence.length() - 1)
sentence is "ehT god detisiv eht esuoherif"



//Question 19
sentence = ""
for(i <- v1.indices) sentence = v1.apply(i) + " " + sentence
sentence = sentence.substring(0, sentence.length() - 1)
sentence is "firehouse the visited dog The"



//Question 20
//a
val intV = Vector[Int](5, 3, 8, -2, 7, 20, 11)
val dV = Vector[Double](3.11, 4.9, 5.5, 25.8, 6.4, 2.75)

intV.sum
intV.max
intV.min

dV.sum
dV.max
dV.min

//b
val sV = Vector[String]("Hello", "Goodbye", "World", "!")

//sV.sum method does not work
sV.max //max method produces the String that is last alphabetically
sV.min //min method produces the String that is first alphabetically

//c
val r3 = 0 until 11
r3.sum //provides a quick way for summing values in a range



//Question 21
