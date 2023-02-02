FROM openjdk
RUN mkdir /app
WORKDIR /app
COPY target/Docker-0.0.1-SNAPSHOT.jar /app
EXPOSE 9090 
ENTRYPOINT ["java", "-jar", "Docker-0.0.1-SNAPSHOT.jar"]