FROM openjdk:17

WORKDIR ./app

COPY /target/RestPostgress-0.0.1-SNAPSHOT.jar /app

ENTRYPOINT ["java", "-jar", "RestPostgress-0.0.1-SNAPSHOT.jar"]