//Question 4

/*
Use reduce to implement a method sumIt that takes a variable argument list
and sums those arguments.

Satisfy the following tests:
sumIt(1, 2, 3) is 6
sumIt(45, 45, 45, 60) is 195
 */

import _root_.com.atomicscala.AtomicTest._

def sumIt(args: Int*) = {
  args.reduce((x, y) => x + y)
}

sumIt(1, 2, 3) is 6
sumIt(45, 45, 45, 60) is 195