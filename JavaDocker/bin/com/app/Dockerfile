# Use an existing Docker image as a base
FROM openjdk:11-slim

# Set the working directory in the container
WORKDIR /JavaDocker

# Create directory structure for the package
RUN mkdir -p com/app

# Copy the Java application source code into the container at /JavaDocker/com/app
COPY HelloWorld.java /JavaDocker/com/app

# Compile the Java application
RUN javac com/app/HelloWorld.java

# Define the default command to run the Java application
CMD ["java", "-classpath", ".", "com.app.HelloWorld"]