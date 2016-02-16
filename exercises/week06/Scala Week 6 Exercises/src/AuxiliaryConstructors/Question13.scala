package AuxiliaryConstructors

import com.atomicscala.AtomicTest._

//Question 13

class ClothesWasher2(val modelName:String = "Unknown", val capacity:Double = 0)

object ClothesWasher2Script extends App {
  val washer1 = new ClothesWasher2()
  val washer2 = new ClothesWasher2(modelName = "Bosch")
  val washer3 = new ClothesWasher2(capacity = 500)
  val washer4 = new ClothesWasher2(modelName = "Toshiba", capacity = 800)

  washer1.modelName is "Unknown"
  washer1.capacity is 0

  washer2.modelName is "Bosch"
  washer2.capacity is 0

  washer3.modelName is "Unknown"
  washer3.capacity is 500

  washer4.modelName is "Toshiba"
  washer4.capacity is 800
}