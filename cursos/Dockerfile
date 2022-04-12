FROM openjdk:11.0.14.1-jre-buster
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080