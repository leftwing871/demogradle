FROM tomcat:9.0.27-jdk11-openjdk

MAINTAINER Richard Chesterwood "contact@virtualpairprogrammers.com"

EXPOSE 8080

RUN rm -rf /usr/local/tomcat/webaps/*

COPY ./build/libs/demogradle-1.0.war /usr/local/tomcat/webapps/ROOT.war

CMD ["catalina.sh", "run"]

