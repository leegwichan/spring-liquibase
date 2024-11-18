# Spring-Liquibase

해당 프로젝트는 Liquibase를 Spring과 같이 사용할 때 참고하기 위한 프로젝트이다. 

### 실행 환경

- Java 17 이상 설치
- Docker 설치
- 3307, 8080 포트에 실행되는 프로그램이 없어야 한다 

### 프로젝트 실행 방법

1. Docker와 [docker-compose.yml](./docker/docker-compose.yml)를 통해 MySQL을 실행시킨다
2. "before" profile로 실행하여, 1차 스키마가 정상적으로 만들어졌는지 확인한다
3. 실행시킨 Spring Boot를 종료 후, "after" profile로 실행하여 스키마가 정상적으로 변경되었는지 확인한다

### 주의할 점

- 처음부터 다시 시작하고 싶을 때는 생성된 Docker Container와 data 폴더를 지우고 다시 실행해야 한다
