FROM openjdk:8-jdk-alpine

LABEL source="https://github.com/fiap-69aoj/netflix-gateway" \
      maintainer="ewertondsdias@gmail.com"

ADD ./target/help-desk-0.0.1-SNAPSHOT.jar help-desk.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=prod", "/help-desk.jar"]