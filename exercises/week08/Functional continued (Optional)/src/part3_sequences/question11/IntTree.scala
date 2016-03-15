package part3_sequences.question11

abstract class IntTree
case object EmptyTree extends IntTree
case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree

object IntTree {
  def contains(t: IntTree, v: Int): Boolean = t match {
    case EmptyTree => false
    case Node(elem, l, r) => if(v == elem) true
                             else if(v < elem) contains(l, v)
                             else contains(r, v)
  }

  def insert(t: IntTree, v: Int): IntTree = t match {
    case EmptyTree => Node(v, EmptyTree, EmptyTree)
    case Node(elem, l, r) => if(v < elem) Node(elem, insert(l, v), r)
                             else if (v > elem) Node(elem, l, insert(r, v))
                             else t
  }
}

object Main extends App {
  val tree = Node(5, Node(3, EmptyTree, EmptyTree), Node(8, Node(7, EmptyTree, EmptyTree), EmptyTree))
  println(IntTree.contains(tree, 9))

  val tree1 = IntTree.insert(tree, 10)
  val tree2 = IntTree.insert(tree1, 2)
  val tree3 = IntTree.insert(tree2, 5)

  println(tree3)
}
