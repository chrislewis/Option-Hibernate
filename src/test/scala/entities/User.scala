package entities

import javax.persistence._

import org.hibernate.annotations.Type

@Entity
class User(
  var firstName: String
  ) extends Model {
  
  @Type(`type` = "net.godcode.hibernate.StringOptionUserType")
  var phone: Option[String] = None
  
  def this() = this("")
  
  def this(firstName: String, phone: Option[String]) = {
    this(firstName)
    this.phone = phone
  }
  
}
