package AuxiliaryConstructors

import com.atomicscala.AtomicTest._

//Question 12

class ClothesWasher(val modelName:String, val capacity:Double) {

  def this(modelName:String) {
    this(modelName, 0)
  }

  def this(capacity:Double) {
    this("Unknown", capacity)
  }

  def this() {
    this("Unknown", 0)
  }
}

object ClothesWasherScript extends App {
  val washer1 = new ClothesWasher()
  val washer2 = new ClothesWasher("Bosch")
  val washer3 = new ClothesWasher(500)
  val washer4 = new ClothesWasher("Toshiba", 800)

  washer1.modelName is "Unknown"
  washer1.capacity is 0

  washer2.modelName is "Bosch"
  washer2.capacity is 0

  washer3.modelName is "Unknown"
  washer3.capacity is 500

  washer4.modelName is "Toshiba"
  washer4.capacity is 800
}