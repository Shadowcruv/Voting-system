FROM maven:3.8.4 AS maven_build
WORKDIR /appfff
COPY pom.xml /appfff/
RUN mvn dependency:resolve
COPY ./ /appfff/
RUN mvn clean package -DskipTests

# Stage 2: Create the runtime image with OpenJDK
FROM openjdk:17-jdk-alpine
WORKDIR /app
ARG JAR_FILE=/appfff/target/VotingSystem-1.0-SNAPSHOT.jar
COPY --from=maven_build ${JAR_FILE} .
EXPOSE 8083
CMD ["java", "-jar", "VotingSystem-1.0-SNAPSHOT.jar"]