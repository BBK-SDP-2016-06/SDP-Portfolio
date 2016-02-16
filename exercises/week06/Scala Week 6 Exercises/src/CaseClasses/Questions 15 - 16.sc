import com.atomicscala.AtomicTest._

//Question 15
case class Person(first:String, last:String, email:String)
val p = Person("Jane", "Smile", "jane@smile.com")
p.first is "Jane"
p.last is "Smile"
p.email is "jane@smile.com"



//Question 16
val people = Vector(
  Person("Jane", "Smile", "jane@smile.com"),
  Person("Ron", "House", "ron@house.com"),
  Person("Sally", "Dove", "sally@dove.com"))

people(0) is "Person(Jane,Smile,jane@smile.com)"
people(1) is "Person(Ron,House,ron@house.com)"
people(2) is "Person(Sally,Dove,sally@dove.com)"