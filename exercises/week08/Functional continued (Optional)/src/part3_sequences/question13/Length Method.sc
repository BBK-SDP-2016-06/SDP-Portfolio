def length: Int = this match {
  case Nil => 0
  case x :: xs => 1 + xs.length
}

def tailRecLength(acc: Int = 0): Int = this match {
  case Nil => acc
  case x :: xs => xs.tailRecLength(acc + 1)
}