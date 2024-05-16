FROM openjdk:17-jdk-slim as build
MAINTAINER coralieperez
COPY target/eurekaserver-0.0.1-SNAPSHOT.jar eurekaserver-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/eurekaserver-0.0.1-SNAPSHOT.jar"]

