package part3_sequences.question16

object FlattenList extends App {

  def flatten[A](xs: List[List[A]]): List[A] =
    (xs :\ (Nil: List[A])) {(x, xs) => x ::: xs}

}
