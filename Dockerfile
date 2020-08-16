FROM openjdk:11-slim

COPY target/green-server.jar green-server.jar

EXPOSE 8080

ENTRYPOINT ["java", "-Xms128m",  "-Xmx300m", "-jar", "green-server.jar"]
