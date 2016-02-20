//Question 3

/*
Rewrite the following code:

// Reduce.scala
import com.atomicscala.AtomicTest._

val v = Vector(1, 10, 100, 1000)
v.reduce((sum, n) => sum + n) is 1111

using for loops.
 */

import com.atomicscala.AtomicTest._

val v = Vector(1, 10, 100, 1000)

//using reduce
v.reduce((sum, n) => sum + n) is 1111

//using for loop
var sum = 0
for (n <- v) sum += n
sum is 1111
