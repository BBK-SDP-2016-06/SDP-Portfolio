import com.atomicscala.AtomicTest._

//Question 1

val v1 = Vector("Hello", "My", "Name", "is")
val v2 = Vector(1,2,3,4,5)
val v3 = Vector(1.4, 2.55, 3.40)
val v4 = Vector('a', 'b', 'c', 'd')

//Question 2

val v = Vector(v1, v2, v3, v4)

//Question 3

val stringVector = Vector("The", "dog", "visited", "the", "fire", "station")
var sentence = ""

for(x <- stringVector.indices) {
  sentence += stringVector.apply(x) + " "
}

sentence is "The dog visited the fire station "

//Question 4

val intV = Vector[Int](5, 15, 6, -3, 0, 100)
val doubleV = Vector[Double](3.2, 4.95, 10.0, -5.1)

val s1 = intV.sum
val s2 = doubleV.sum //issue with regards to accuracy when handling negatives

val min1 = intV.min
val min2 = doubleV.min

val max1 = intV.max
val max2 = doubleV.max

//Question 5

val myVector1 = Vector(1, 2, 3, 4, 5, 6)
val myVector2 = Vector(1, 2, 3, 4, 5, 6)

myVector1 is myVector2
