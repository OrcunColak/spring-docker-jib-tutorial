# Read Me

The original idea is from  
https://medium.com/@ramanamuttana/dockerizing-java-spring-boot-applications-using-jib-a-guide-for-maven-and-gradle-04a90f844334

# Build Image

mvn clean install jib:dockerBuild
or
mvn package

Then
docker run -p 8080:8080 orcuncolakbey/spring-docker-jib-tutorial

# Build and Push

mvn clean install jib:build
or
mvn package -Pjib-push-to-dockerhub