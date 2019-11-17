FROM openjdk:8-jdk-alpine

LABEL source="https://github.com/fiap-69aoj/netflix-help-desk" \
      maintainer="ewertondsdias@gmail.com"

ADD ./target/help-desk-0.0.1-SNAPSHOT.jar help-desk.jar
ADD ./docker-entrypoint.sh /

RUN chmod +x /docker-entrypoint.sh

EXPOSE 8081

ENTRYPOINT ["/docker-entrypoint.sh"]