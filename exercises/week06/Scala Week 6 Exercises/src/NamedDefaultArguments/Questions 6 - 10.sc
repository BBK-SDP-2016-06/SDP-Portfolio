import com.atomicscala.AtomicTest._

//Question 6
class SimpleTime(val hours:Int, val minutes:Int)
val t = new SimpleTime(hours = 5, minutes = 30)
t.hours is 5
t.minutes is 30



//Question 7
class SimpleTime2(val hours:Int, val minutes:Int = 0)
val t2 = new SimpleTime2(hours = 10)
t2.hours is 10
t2.minutes is 0



//Question 8
class Planet(val name:String, val description:String, val moons:Int = 0) {
  def hasMoon = moons > 0
}
val p = new Planet(name = "Mercury",
  description = "small and hot planet")
p.hasMoon is false



//Question 9
val earth = new Planet(moons = 1, name = "Earth",
  description = "a hospitable planet")
earth.hasMoon is true
//no code needed to be changed - arguments can be declared in any order



//Question 10
class Item(val name:String, val price:Double) {
  def cost(grocery:Boolean = false,
           medication:Boolean = false,
           taxRate:Double = 0.10) = {
    if (grocery || medication) price else price * (taxRate + 1)
  }
}

val flour = new Item(name = "flour", 4)
flour.cost(grocery = true) is 4
val sunscreen = new Item(name = "sunscreen", 3)
sunscreen.cost() is 3.3
val tv = new Item(name = "television", 500)
tv.cost(taxRate = 0.06) is 530

