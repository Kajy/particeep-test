package basic

import com.particeep.test.basic.Refactoring
import com.particeep.test.basic.Refactoring.File
import org.scalatestplus.play.PlaySpec

class RefactoringTest extends PlaySpec {

  "Refactoring" should {
    "get categories" in {
      val files = List(
        File("name1", "movie"),
        File("name2", "picture"),
        File("name3", "random"),
        File("name4", "movie"),
        File("name5", "gif"),
        File("name6", "picture")
      )

      Refactoring.getCategories(files) mustBe List("movie", "picture", "random", "gif")
      Refactoring.getCategories(List.empty[File]) mustBe List.empty[String]
    }
  }
}
