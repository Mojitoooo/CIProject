FROM openjdk:11
EXPOSE 8089
ADD source destExamThourayaS2-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/ExamThourayaS2-0.0.1-SNAPSHOT.jar"]
