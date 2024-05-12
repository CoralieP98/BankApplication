FROM openjdk:17-jdk-slim as build
MAINTAINER coralieperez
COPY target/ms-loans-0.0.1-SNAPSHOT.jar ms-loans-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/ms-loans-0.0.1-SNAPSHOT.jar"]