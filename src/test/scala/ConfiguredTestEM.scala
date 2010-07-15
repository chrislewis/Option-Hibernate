
import entities._
import org.hibernate.ejb.Ejb3Configuration

trait ConfiguredTestEM {
  val testEM = new Ejb3Configuration()
    .addAnnotatedClass(classOf[User])
    .configure("/hibernate.cfg.xml")
    .buildEntityManagerFactory()
    .createEntityManager()
}
