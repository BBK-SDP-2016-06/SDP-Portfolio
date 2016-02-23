//Question 8

/*
Part b - Now we have our LinkedList class, let’s give it some useful methods.
Define the following:

  i. a method called length that returns the length of the list;
  ii. a method apply that returns the nth item in the list;
  iii. a method contains that determines whether or not an item is in the
  list.

In each case, start by writing an abstract method definition in LinkedList.
Think about the types of the arguments and the types of the results. Then
implement the method for Empty –– it should be pretty easy to provide a
default implementation for an empty list. Finally, implement the method
on Pair. The implementation will be recursive and defined in terms of head
and tail.

Hint: If you need to signal an error in your code (there’s one situation in
which you will need to do this), consider throwing an exception (although
we will dispense with this approach later in the course). Here is an
example: throw new Exception("Bad things happened")
 */
sealed trait LinkedList[A] {
  def head: A
  def tail: LinkedList[A]
  def length: Int
  def apply(index: Int): A
  def contains(elem: A): Boolean
}
final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A] {
  def length = 1 + tail.length
  def apply(index: Int) = if (index == 0) head else tail.apply(index - 1)
  def contains(elem: A) = if (head.equals(elem)) true else tail.contains(elem)
}
final case class Empty[A]() extends LinkedList[A] {
  def head = throw new NoSuchElementException("Nil.head")
  def tail = throw new NoSuchElementException("Nil.tail")
  def length = 0
  def apply(index: Int) = throw new NoSuchElementException("Empty list")
  def contains(elem: A) = false
}
//Testing
val list: LinkedList[Int] = Pair(1, Pair(5, Pair(10, Pair(7, Pair(20, Empty())))))
list.length
list.apply(0)
list.apply(3)
list.contains(2)
list.contains(20)
