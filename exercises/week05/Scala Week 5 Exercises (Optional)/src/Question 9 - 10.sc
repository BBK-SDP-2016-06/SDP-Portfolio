//Question 9
case class Counter(val count:Int = 0) {
  def inc = copy(count + 1)
  def dec = copy(count - 1)
}
new Counter().inc.dec.inc.inc.count



//Question 10
case class Person(val first:String, val last:String)

object Person {
  def apply(name:String) = {
    val nameParts = name.split(" ")
    new Person(nameParts(0), nameParts(1))
  }
}

val person1 = Person("George Shiangoli")
val person2 = Person("George", "Shiangoli")
person1.first
person2.first
/*
defining Person as a case class now enables us to have two versions
of the apply method.
*/