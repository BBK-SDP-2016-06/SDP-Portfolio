//Question 1
class Counter(val count:Int) {
  def inc = new Counter(count + 1)
  def dec = new Counter(count - 1)
}
new Counter(10).inc.dec.inc.inc.count



//Question 2
class Counter2(val count:Int) {
  def inc(x:Int = 1) = new Counter2(count + x)
  def dec(x:Int = 1) = new Counter2(count - x)
}
new Counter2(10).inc().dec(2).inc().inc().count



//Question 3
class Adder(amount:Int) {
  def add(in:Int) = in + amount
}

class Counter3(val count:Int) {
  def inc(x:Int = 1) = new Counter3(count + x)
  def dec(x:Int = 1) = new Counter3(count - x)
  def adjust(adder:Adder) = new Counter3(adder.add(count))
}



//Question 4
class Person(val first:String, val last:String)

object Person {
  def apply(name:String) = {
    val nameParts = name.split(" ")
    new Person(nameParts(0), nameParts(1))
  }
}

val person1 = Person("John Smith")
person1.first
person1.last