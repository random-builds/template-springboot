FROM redhat/ubi9-micro:9.4-6

LABEL mycompany.application.owner=myteam
LABEL mycompany.application.description=something

WORKDIR /work
COPY jre jre
COPY build/libs/*.jar app.jar

CMD ["jre/bin/java", "-jar", "app.jar"]