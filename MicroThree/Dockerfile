FROM openjdk:17-alpine
WORKDIR /opt
ENV PORT 9003
EXPOSE 9003
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar