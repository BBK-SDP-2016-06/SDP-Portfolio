import com.atomicscala.AtomicTest._

//Question 20
val set = Set(1, 2, 3, 4) //result from previous question
var str = ""
set.foreach(x => str += x + ",")
str is "1,2,3,4,"



//Question 21
val dogYears = (x:Int) => x * 7
dogYears(10) is 70



//Question 22
var s1 = ""
val v = Vector(1, 5, 7, 8)
v.foreach((x) => s1 += dogYears(x) + " ")
s1 is "7 35 49 56 "



//Question 23
val square = (x:Int) => x * x
var s2 = ""
val numbers = Vector(1, 2, 5, 3, 7)
numbers.foreach((n) => s2 += square(n) + " ")
s2 is "1 4 25 9 49 "