FROM maven:3.9.6-eclipse-temurin-21

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

EXPOSE 9090

CMD ["sh", "-c", "java -jar $(find target -name '*.jar')"]