import org.scalatest._
import org.scalatest.Matchers._

class P01Test extends FlatSpec {
  behavior of "last function"
  it should "find the last element of the array" in {
    P01.last(List(1,2,3)) should equal (3)
  }

  it should "produce NoSuchElementException when list is emty" in {
    intercept[NoSuchElementException] {
      P01.last(List())
    }
  }

}
