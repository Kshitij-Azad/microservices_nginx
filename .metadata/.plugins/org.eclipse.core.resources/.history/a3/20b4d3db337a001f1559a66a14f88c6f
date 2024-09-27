FROM openjdk:17-alpine
WORKDIR /opt
ENV PORT 9001
EXPOSE 9001
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar