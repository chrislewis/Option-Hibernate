import org.specs._
import entities._
import org.hibernate.cfg._
import org.hibernate.ejb.Ejb3Configuration

class ConfigSpec extends Specification {
  
  val em = new Ejb3Configuration()
    .addAnnotatedClass(classOf[User])
    .configure("/hibernate.cfg.xml")
    .buildEntityManagerFactory()
    .createEntityManager()
  
  "A configured EntityManager" should {
    "persist a known entity" in {
      val u = new User("chris")
      u.id must beOneOf(null, 0L)
      
      em.getTransaction().begin()
      em.persist(u)
      u.id must beGreaterThan(0L)
      
      em.refresh(u)
      u.firstName must be("chris")
    }
  }
  
}
