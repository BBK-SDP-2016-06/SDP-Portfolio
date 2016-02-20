//Question 2

/*
Rewrite the following code:

import atomic.AtomicTest._
val v = Vector(1, 2, 3, 4)
v.map(n => n + 1) is Vector(2, 3, 4, 5)

using a for loop instead of map, and observe the additional complexity
this introduces.
*/
import _root_.com.atomicscala.AtomicTest._
val v = Vector(1, 2, 3, 4)

//using map
v.map(n => n + 1) is Vector(2, 3, 4, 5)

//using for loop
val v2 = for(n <- v) yield n + 1
v2 is Vector(2, 3, 4, 5)

//additional complexity with for loop in terms of using yield