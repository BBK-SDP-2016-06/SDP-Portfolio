package AuxiliaryConstructors

//Question 14

/*
class ClothesWasher3(val modelName:String, val capacity:Double) {

  def this(modelName:String) {
    println(modelName)
    this(modelName, 0) //error: 'this' expected, application does not take parameters
  }

  def this(capacity:Double) {
    println(capacity)
    this("Unknown", capacity) //error: 'this' expected, application does not take parameters
  }

}
*/