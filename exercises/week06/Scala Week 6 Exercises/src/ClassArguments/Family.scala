package ClassArguments
import com.atomicscala.AtomicTest._

//Question 3
class Family(val members: String*) {
  def familySize() = members.size
}

object TestArgs extends App {
  val family1 = new Family("Mum", "Dad", "Sally", "Dick")
  family1.familySize() is 4

  val family2 = new Family("Dad", "Mom", "Harry")
  family2.familySize() is 3

  val family3 = new FlexibleFamily("Mum", "Dad", "Sally", "Dick")
  family3.familySize() is 4

  val family4 = new FlexibleFamily("Mum", "Dad", "Harry")
  family4.familySize() is 3
}

//Question 4
class FlexibleFamily(mother: String, father: String, children: String*) {
  def familySize() = children.size + 2
}