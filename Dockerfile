FROM openjdk:8-jre-alpine

EXPOSE 8080

RUN sudo mkdir /usr/app

COPY ./target/java-maven-app-1.0-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT [ "java", "-jar", "java-maven-app-1.0-SNAPSHOT.jar" ]