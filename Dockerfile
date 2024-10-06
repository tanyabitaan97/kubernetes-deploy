FROM eclipse-temurin:17

LABEL mentainer="tanyabitaan.97@gmail.com"

WORKDIR /app

COPY global-exception-handler-0.0.1-SNAPSHOT.jar /app/global-exception-handler-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "global-exception-handler-0.0.1-SNAPSHOT.jar"]