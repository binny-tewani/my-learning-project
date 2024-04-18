#FROM ubuntu:20.04
#
## Update package list and install MySQL server
#RUN apt-get update && \
#    apt-get install -y mysql-client && \
#   apt-get install -y iputils-ping
##    apt-get clean
#
#
#RUN apt-get update
# Use a base image with the Java runtime environment
FROM openjdk:11-jre-slim

# Copy the Maven project files into the container
ADD target/MyProject*.jar MyProject.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "MyProject.jar"]


#CMD ping -c 4 192.168.29.64
## Run the mysql command to connect to the MySQL server
#CMD mysql -h 192.168.29.64 -u root -pstrong_password -P 3308
