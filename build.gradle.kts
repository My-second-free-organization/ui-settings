plugins { id("org.springframework.boot") version "3.2.3"; id("io.spring.dependency-management") version "1.1.4"; java }
group = "io.flowforge"; version = "2.4.0"
java { sourceCompatibility = JavaVersion.VERSION_21 }
repositories { mavenCentral() }
dependencies {
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("com.force.api:force-partner-api:60.0.0")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
}
