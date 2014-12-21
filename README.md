# Vert.x Example Maven Project

Example project for creating a Vert.x module with a Gradle build.

By default this module contains a simple Java verticle
which listens on the event bus and responds to `ping!` messages with `pong!`.

This example also shows you how to write tests in Java, Groovy, Ruby and Python

################ MongoDB ###############################
mvn vertx:runModIDEA

(mvn vertx:runModIDEA org.smartjava~vertx-service~1.0 -conf src/main/resources/config.json)

mvn installl -DskipTests=true

vertx runmod org.smartjava~vertx-service~1.0 -conf src/main/resources/config.json