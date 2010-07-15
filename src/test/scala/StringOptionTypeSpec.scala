import org.specs._
import entities._

class StringOptionTypeSpec extends Specification with ConfiguredTestEM {
  
  "An entity with persistent Option[String] fields" should {
    
    testEM.getTransaction().begin()
    
    "be initialized with None" in {
      testEM.merge(new User("chris")).phone must be(None)
    }
    
    "persist an Option[String]" in {
      testEM.merge(new User("chris", Some("123-111-2345")))
        .phone must_== Some("123-111-2345")
    }
    
  }
  
}
