FROM openjdk:17
ADD target/notification-service.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]