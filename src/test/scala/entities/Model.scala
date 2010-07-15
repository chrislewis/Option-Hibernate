package entities

import javax.persistence._

@MappedSuperclass
abstract class Model {
  @Id @GeneratedValue
  var id: Long = _
}
