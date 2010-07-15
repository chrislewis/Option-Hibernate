import sbt._

class OptionHibernateProject(info: ProjectInfo) extends DefaultProject(info) {
  
  val jbossRepo = "JBoss" at "http://repository.jboss.org/maven2/"
  val scalaToolsSH = "Scala Tools Snapshots" at "http://nexus.scala-tools.org/content/repositories/snapshots/"
  
  val specs = "org.scala-tools.testing" % "specs_2.8.0" % "1.6.5-SNAPSHOT"
  
  val hibernate = "org.hibernate" % "hibernate-core" % "3.5.0-Final"
  val hem = "org.hibernate" % "hibernate-entitymanager" % "3.5.0-Final"
  val hibAnnotations = "org.hibernate" % "hibernate-annotations" % "3.5.0-Final"
  val hsql = "hsqldb" % "hsqldb" % "1.8.0.10"
  
  val sl4j = "org.slf4j" % "slf4j-api" % "1.5.8"
  val sl4jApi = "org.slf4j" % "slf4j-log4j12" % "1.5.0"
}

