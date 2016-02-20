//Question 2

/*
Rewrite the following code:

import atomic.AtomicTest._
val v = Vector(1, 2, 3, 4)
v.map(n => n + 1) is Vector(2, 3, 4, 5)

using a for loop instead of map, and observe the additional complexity
this introduces.
*/

import com.atomicscala.AtomicTest._

val v = Vector(1, 2, 3, 4)
v.map(n => n + 1) is Vector(2, 3, 4, 5)//using map
for(n <- v) yield n + 1 is Vector(2, 3, 4, 5) //using for loop

//additional complexity with for loop in terms of using yield