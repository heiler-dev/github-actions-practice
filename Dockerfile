# jdk17 Image Start
FROM openjdk:17

ARG JAR_FILE=build/libs/*.jar

# jar 파일 복제
COPY ${JAR_FILE} app.jar

# 컨테이너 실행 시 항상 실행될 shell 명령어
ENTRYPOINT ["java", "-jar", "app.jar"]