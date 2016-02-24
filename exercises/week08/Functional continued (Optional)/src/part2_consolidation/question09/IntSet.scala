package part2_consolidation.question09

trait IntSet {
  def incl(x: Int): IntSet

  def contains(x: Int): Boolean

  def union(other: IntSet): IntSet

  def intersect(other: IntSet): IntSet

  def excl(x: Int): IntSet

  def isEmpty: Boolean
}

case class EmptySet() extends IntSet {
  override def contains(x: Int): Boolean = false

  override def incl(x: Int): IntSet =
    new NonEmptySet(x, new EmptySet, new EmptySet)

  override def union(other: IntSet): IntSet = other

  override def intersect(other: IntSet): IntSet = this

  override def excl(x: Int): IntSet = this

  override def isEmpty = true
}

case class NonEmptySet(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  override def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  override def incl(x: Int): IntSet =
    if (x < elem) new NonEmptySet(elem, left incl x, right)
    else if (x > elem) new NonEmptySet(elem, left, right incl x)
    else this

  override def union(other: IntSet): IntSet = {
    val set = left.union(right.union(other))
    set incl elem
    }

  override def intersect(other: IntSet): IntSet = {
    val l = left intersect other
    val r = right intersect other
    val output = l union r
    if (other contains elem) output else output incl elem
  }

  override def excl(x: Int): IntSet = {
    if (x > elem) new NonEmptySet(elem, left, right.excl(x))
    else if (x < elem) new NonEmptySet(elem, left.excl(x), right)
    else left union right
  }

  override def isEmpty = false
}

