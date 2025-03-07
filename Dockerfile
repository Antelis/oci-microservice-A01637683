FROM openjdk:17-jdk-slim
WORKDIR /oci-microservice-A01637683
COPY /target/*.jar oci-microservice-A01637683.jar
COPY /src/main/resources/Wallet_javadev101 /oci-microservice-A01637683/Wallet_javadev101
ENV TNS_ADMIN=/oci-microservice-A01637683/Wallet_javadev101
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "oci-microservice-A01637683.jar" ]