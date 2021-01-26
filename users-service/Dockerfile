FROM openjdk:8-jdk-alpine as builder
ARG JAR_FILE=target/users-service-2.4.2.jar

# cd /usr/local/asset-microservice
WORKDIR /usr/local/asset-microservice

# copy target/users-service-2.4.2.jar /usr/local/asset-microservice/users-service.jar
COPY ${JAR_FILE} users-service.jar

# java -jar /usr/local/asset-microservice/users-service.jar
ENTRYPOINT ["java","-jar","users-service.jar"]