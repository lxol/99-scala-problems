// P02 (*) Find the last but one element of a list.
// Example:
// scala> penultimate(List(1, 1, 2, 3, 5, 8))
// res0: Int = 5

object P02 {
  def penultimate[A](l:List[A]):A = l match {
    case x::_::Nil => x
    case Nil => throw new NoSuchElementException
    case _::Nil  => throw new NoSuchElementException
    case x::tail => penultimate(tail)
  }

}
