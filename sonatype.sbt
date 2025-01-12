publishTo := sonatypePublishToBundle.value

// Feathr Sonatype account was created before Feb 2021, hence this host.
sonatypeCredentialHost := "oss.sonatype.org"


// Your profile name of the sonatype account. The default is the same with the organization value
sonatypeProfileName := "com.linkedin.feathr"

// To sync with Maven central, you need to supply the following information:
publishMavenStyle := true

// Open-source license of your choice
licenses := Seq("APL2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))


// Project metadata
homepage := Some(url("https://github.com/feathr-ai/feathr"))
scmInfo := Some(
  ScmInfo(
    url("https://github.com/feathr-ai/feathr"),
    "scm:git@github.com:linkedin/feathr.git"
  )
)
developers := List(
    Developer(id="feathr_dev", name="Feathr Dev", email="feathrai@gmail.com", url=url("https://github.com/feathr-ai/feathr"))
)