import com.atomicscala.AtomicTest._

class Cup {
  var percentFull = 0
  val max = 100
  def add(increase : Int) : Int = {
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
    percentFull // Return this value
  }
}

//Question 1

val cup = new Cup
cup.add(45) is 45
cup.add(-15) is 30
cup.add(-50) is -20

/*
If a negative value is passed to add, then the value of percentFull
decreases. No additional code is currently required to fulfill this
functionality.
*/

//Question 2

class Cup2 {
  var percentFull = 0
  val max = 100
  val min = 0
  def add(increase : Int) : Int = {
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
    if(percentFull < min) {
      percentFull = min
    }
    percentFull // Return this value
  }
}

val cup2 = new Cup2
cup2.add(45) is 45
cup2.add(-55) is 0
cup2.add(10) is 10
cup2.add(-9) is 1
cup2.add(-2) is 0

//Question 3

val cup3 = new Cup2
cup3.percentFull = 56
cup3.percentFull is 56

// It appears that percentFull can be set from outside the class

//Question 4

class Cup3 {
  var percentFull = 0
  val max = 100
  val min = 0
  def add(increase : Int) : Int = {
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
    if(percentFull < min) {
      percentFull = min
    }
    percentFull // Return this value
  }

  def set(i : Int) : Unit = this.percentFull = i
  def get() : Int = this.percentFull
}

val cup4 = new Cup3
cup4.set(56)
cup4.get() is 56





