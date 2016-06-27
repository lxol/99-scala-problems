import org.scalatest._
import org.scalatest.Matchers._
class P02Test extends FlatSpec {
  behavior of "penultimate function"
  it should "produce last but one element of the list" in {
    P02.penultimate(List(1,2,3,4,5,6)) should equal(5)
  }
  it should "produce NoSuchElementException if list size <=1" in {
    intercept[NoSuchElementException] {
      P02.penultimate(List())
    }
    intercept[NoSuchElementException] {
      P02.penultimate(List(1))
    }
  }
}
