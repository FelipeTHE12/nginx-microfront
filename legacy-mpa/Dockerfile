FROM openjdk:11-jdk-slim

WORKDIR /app
COPY ./build/libs/legacy-mpa-*.war application.war
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/application.war"]