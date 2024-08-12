FROM openjdk:17
ADD target/springdocker.jar springdocker.jar
ENTRYPOINT ["java", "-jar", "/springdocker.jar"]