FROM openjdk:11
EXPOSE 9091
ENV EUREKA_SERVER=service-discovery
VOLUME [ "/DockerWorkspace" ]
ENTRYPOINT ["java","-jar","/DockerWorkspace/currency-exchange/target/currency-exchange-0.0.1-SNAPSHOT.jar"]