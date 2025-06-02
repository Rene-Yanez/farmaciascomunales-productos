FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

COPY pom.xml ./
RUN apk add --no-cache maven
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn package -DskipTests

EXPOSE 8082
ENTRYPOINT ["java", "-jar", "target/productos-0.0.1-SNAPSHOT.jar"]

CMD ["java", "-jar", "target/productos-0.0.1-SNAPSHOT.jar"]