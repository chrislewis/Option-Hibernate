import org.specs._
import entities._

class ConfigSpec extends Specification with ConfiguredTestEM {
  
  "A configured EntityManager" should {
    
    testEM.getTransaction().begin()
    
    "persist a known entity" in {
      val u = testEM.merge(new User("chris"))
      u.id must beGreaterThan(0L)
      
      testEM.refresh(u)
      u.firstName must be("chris")
    }
    
  }
  
}
