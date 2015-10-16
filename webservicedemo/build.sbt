name := "webservicedemo"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean
)     

libraryDependencies += "org.springframework" % "spring-context" % "4.2.0.RELEASE"



libraryDependencies += "org.apache.cxf" % "cxf-rt-bindings-soap" % "3.1.2"

libraryDependencies += "org.apache.cxf" % "cxf-rt-frontend-jaxws" % "3.1.2"




play.Project.playJavaSettings
