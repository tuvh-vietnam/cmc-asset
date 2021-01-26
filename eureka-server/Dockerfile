FROM openjdk:8-jdk-alpine as builder
ARG JAR_FILE=target/eureka-server-2.4.2.jar

# cd /usr/local/asset-microservice
WORKDIR /usr/local/asset-microservice

# copy target/eureka-server-2.4.2.jar /usr/local/asset-microservice/eureka-server.jar
COPY ${JAR_FILE} eureka-server.jar

# java -jar /usr/local/asset-microservice/eureka-server.jar
ENTRYPOINT ["java","-jar","eureka-server.jar"]