FROM openjdk:11
EXPOSE 9091
ENV EUREKA_SERVER=service-discovery
ENTRYPOINT ["java","-jar","/workspace/currency-exchange/target/currency-exchange-0.0.1-SNAPSHOT.jar"]