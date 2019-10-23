FROM tomcat:9.0.27-jdk11-openjdk

MAINTAINER Ocar Lee "leftwig871@gmail.com"

EXPOSE 8080

RUN rm -rf /usr/local/tomcat/webapps/*

COPY ./build/libs/demogradle-1.0.war /usr/local/tomcat/webapps/ROOT.war

CMD ["catalina.sh", "run"]

