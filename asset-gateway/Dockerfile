FROM openjdk:8-jdk-alpine as builder
ARG JAR_FILE=target/asset-gateway-2.4.2.jar

# cd /usr/local/asset-microservice
WORKDIR /usr/local/asset-microservice

# copy target/asset-gateway-2.4.2.jar /usr/local/asset-microservice/asset-gateway.jar
COPY ${JAR_FILE} asset-gateway.jar

# java -jar /usr/local/asset-microservice/asset-gateway.jar
ENTRYPOINT ["java","-jar","asset-gateway.jar"]