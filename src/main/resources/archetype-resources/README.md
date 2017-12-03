#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
# The ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)} Project

${symbol_pound}${symbol_pound} About

Describe your project here.

${symbol_pound}${symbol_pound} Technical Stack

- Java 1.8+
- Maven 3.3+
- Spring boot 1.5.6
- Spring batch with custom operation APIs and Spring cache manager
- Lombok abstraction
- H2 for explanation
- Swagger 2 API documentation
- Spring retry and circuit breaker for external service call
- REST API model validation 
- Spring cloud config for external configuration on GIT REPO
- Cucumber and Spring Boot test for integration test
- Jenkins Pipeline for multi branch project
- BICS continuous delivery and integration standards with Sonar check and release management
- Support retry in sanity checks  

${symbol_pound}${symbol_pound} Installation

-  to run locally , you need to configure the run configuration by passing :
1- VM parameter: -DLOG_PATH=../log
2- Set SPRING profile to LOCAL 

${symbol_pound}${symbol_pound} License

This software is licensed under the [BSD License][BSD]. For more information, read the file [LICENSE](LICENSE).

