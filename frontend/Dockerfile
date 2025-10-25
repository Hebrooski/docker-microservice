# syntax=docker/dockerfile:1

FROM gradle:9.1.0-jdk25-alpine AS build
WORKDIR /app
COPY --chown=gradle:gradle . /app
RUN gradle clean build -x test

FROM openjdk:25-jdk-slim

COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "app.jar" ]

