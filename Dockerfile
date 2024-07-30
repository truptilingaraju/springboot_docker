FROM openjdk:17
ADD target/Springboot_Docker-0.0.1-SNAPSHOT.jar Springboot_Docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/Springboot_Docker-0.0.1-SNAPSHOT.jar"]