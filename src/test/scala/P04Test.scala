import org.scalatest._
import org.scalatest.Matchers._

class P04Test extends FlatSpec {
  behavior of "length function"
  it should "find the lenghth of non nil list" in {
    P04.length(List(1, 1, 2, 3, 5, 8)) should equal(6)
  }
  it should "produce 0 for an empty list" in {
    P04.length(Nil) should equal(0)
  }
}
