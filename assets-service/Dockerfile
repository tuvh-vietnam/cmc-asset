FROM openjdk:8-jdk-alpine as builder
ARG JAR_FILE=target/assets-service-2.4.2.jar

# cd /usr/local/asset-microservice
WORKDIR /usr/local/asset-microservice

# copy target/assets-service-2.4.2.jar /usr/local/asset-microservice/assets-service.jar
COPY ${JAR_FILE} assets-service.jar

# java -jar /usr/local/asset-microservice/asset-gateway.jar
ENTRYPOINT ["java","-jar","assets-service.jar"]