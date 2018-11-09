FROM openjdk:8
ADD /target/hospital.jar hospital.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","hospital.jar"]