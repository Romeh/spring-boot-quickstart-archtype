BICS Spring Boot Batch Quickstart Maven Archetype
=========================================


Summary
-------
The project is a Maven archetype for BICS Spring Boot batch web application 
which has all BICS standards on place ready for development

that cover BICS Java REST API standards
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


Installation
------------

To install the archetype in your local repository execute following commands:

```sh
$ git clone git@bicsgit.bc:psd-java/bics-spring-boot-batch-quickstart.git
$ cd bics-spring-boot-batch-quickstart
$ mvn clean install
```

Create a project
----------------

```sh
$ mvn archetype:generate \
     -DarchetypeGroupId=com.bics.spring-boot--archetypes \
     -DarchetypeArtifactId=spring-boot-batch-quickstart \
     -DarchetypeVersion=1.0.0 \
     -DgroupId=com.bics \
     -DartifactId=myAppBatch \
     -Dversion=1.0.0-SNAPSHOT \
     -DinteractiveMode=false
```

Test on the browser via SWAGGER
-------------------

```sh
http://localhost:8080/swagger-ui.html
```
