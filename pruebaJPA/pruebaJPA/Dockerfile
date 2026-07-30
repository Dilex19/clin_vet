FROM eclipse-temurin:25-jdk-jammy
ARG JAR_FILE=target/pruebaJPA-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app_pruebaJPA.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app_pruebaJPA.jar"]