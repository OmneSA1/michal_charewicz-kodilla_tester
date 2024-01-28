rootProject.name = "kodilla-course"
include("kodilla-intro")
include("untitled")
include("kodilla-basic-tests")
include("kodilla-collections")
include("kodilla-collections-advanced")
include("kodilla-stream")
include("kodilla-advanced-tests")
include("kodilla-spring-basic")
include("kodilla-spring-basic:com.kodilla.spring.basic.spring_dependency_injection")
findProject(":kodilla-spring-basic:com.kodilla.spring.basic.spring_dependency_injection")?.name = "com.kodilla.spring.basic.spring_dependency_injection"
