FROM openjdk:latest
COPY . /app
WORKDIR /app

RUN /app/gradlew clean build

CMD ["/app/gradlew", "bootRun"]