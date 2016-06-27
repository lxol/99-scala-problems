import org.scalatest._
import org.scalatest.Matchers._

class P03Test extends FlatSpec {
  behavior of "nth function"
  it should "find n-th element of the list" in {
    P03.nth(3, List(1,2,3,4,5,6)) should equal(4)
  }
  it should "find 1-st element of 1 element list" in {
    P03.nth(0, List(1)) should equal(1)
  }
  it should "produce NoSuchElementException for empty list" in {
    intercept[NoSuchElementException] {
      P03.nth(0, Nil)
    }
  }
  it should "produce NoSuchElementException for illegal index" in {
    intercept[NoSuchElementException] {
      P03.nth(2, List(0,1))
    }
  }
}
