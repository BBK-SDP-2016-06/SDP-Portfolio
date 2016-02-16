//Question 1

class Sailboat {
  def raise() : String = "Sails raised"
  def lower() : String = "Sails lowered"
}

class MotorBoat {
  def on() : String = "Motor on"
  def off() : String = "Motor off"
}

val sailboat = new Sailboat
val r1 = sailboat.raise()
assert(r1 == "Sails raised", "Expected Sails raised, Got " + r1)

val r2 = sailboat.lower()
assert(r2 == "Sails lowered", "Expected Sails lowered, Got " + r2)

val motorBoat = new MotorBoat
val s1 = motorBoat.on()
assert(s1 == "Motor on", "Expected Motor on, Got " + s1)

val s2 = motorBoat.off()
assert(s2 == "Motor off", "Expected Motor off, Got " + s2)

//Question 2

class Flare {
  def light() : String = "Flare used!"
}

val flare = new Flare
val f1 = flare.light()
assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)

//Question 3

class Sailboat2 {
  def raise() : String = "Sails raised"
  def lower() : String = "Sails lowered"
  def signal() : String = {
    val f = new Flare
    f.light()
  }
}

class MotorBoat2 {
  def on() : String = "Motor on"
  def off() : String = "Motor off"
  def signal() : String = {
    val f = new Flare
    f.light()
  }
}

val sailboat2 = new Sailboat2
val signal = sailboat2.signal()
assert(signal == "Flare used!", "Expected Flare used!, Got " + signal)

val motorBoat2 = new MotorBoat2
val flare2 = motorBoat2.signal()
assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)
