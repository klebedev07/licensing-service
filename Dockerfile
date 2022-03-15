
FROM openjdk:17-jdk
# The application's jar file
ARG JAR_FILE
# Add the application's jar to the container
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java  -jar app.jar"]
