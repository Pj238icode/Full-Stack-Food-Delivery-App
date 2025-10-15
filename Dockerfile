# Use an official OpenJDK runtime as a parent image
FROM eclipse-temurin:21-jdk-alpine

# Set a working directory inside the container
WORKDIR /app

# Copy the Maven build artifact (JAR) into the container
COPY target/foodiesapi-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the app runs on
EXPOSE 8081


# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
