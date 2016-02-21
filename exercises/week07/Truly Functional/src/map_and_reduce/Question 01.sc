//Question 1

/*
Part a - Modify the following code:

  import atomic.AtomicTest._

  val v = Vector(1, 2, 3, 4)
  v.map(n => n + 1) is Vector(2, 3, 4, 5)

  so the anonymous function multiplies each value by 11 and adds 10.
  Satisfy the following tests:

  val v = Vector(1, 2, 3, 4)
  v.map(/* Fill this in */) is Vector(21, 32, 43, 54)
 */

import _root_.com.atomicscala.AtomicTest._

val v = Vector(1, 2, 3, 4)
v.map(n => n * 11 + 10) is Vector(21, 32, 43, 54)


/*
Part b - Can you map with foreach in the above solution? What happens? Test
the result.
 */

v.foreach(n => n * 11 + 10) is Vector(21, 32, 43, 54)
println(v.foreach(n => n * 11 + 10))
//The map method transforms and returns a new list whereas the foreach
//method only yields a Unit (possibly used only for side effects).


/*
Part c - Rewrite the solution for the previous exercise part using for.
Was this more or less complex than using map? Which approach has the
greater potential for errors?
 */

for(n <- v) yield n * 11 + 10
//This method seems to have a similar complexity to map. This approach
//may probably have the greatest potential for errors since it does not
//read as fluently in terms of a function.

