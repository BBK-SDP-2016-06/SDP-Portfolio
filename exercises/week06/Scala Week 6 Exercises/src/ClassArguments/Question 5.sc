import com.atomicscala.AtomicTest._

//Question 5

def squareThem(values: Int*) = {
  val squared = values map (x => x * x)
  squared.sum
}

squareThem(2) is 4
squareThem(2, 4) is 20
squareThem(1, 2, 4) is 21