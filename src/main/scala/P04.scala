// P04 (*) Find the number of elements of a list.
// Example:
// scala> length(List(1, 1, 2, 3, 5, 8))t
// res0: Int = 6

object P04 {
  def length[A](ls:List[A]):Int = {
    def aux(n:Int, l:List[A]):Int = l match {
      case Nil => n
      case x::tail => aux(n+1, tail)
    }
    aux(0, ls)
  }
}
