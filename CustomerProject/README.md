## 개발 환경
 - Spring Framework
 - Spring Boot 2.5.5
 - JDK 8
 - IntelliJ IDE
 - Gradle Project
## 빌드 및 실행방법
- 개발 환경에 맞춰 해당 폴더를 import 한 후 run
- localhost:8080/h2-console 접속 시  DB Table이 생긴것을 확인 할 수 있음
- localhost:8080/swagger-ui.html 접속 시 swagger 화면 확인.

## 문제해결 방법
- 프로젝트 진행 시 발생하는 문제에 대하여 
    1. 원인 분석
       - 에러 로그를 확인하여 어느 코드에서 에러가 났는지, 왜 에러가 났는지 파악
    2. 해결 방법 
       - 간단한 코드 미싱 문제일 경우 바로 수정
       - 해당 지식이 필요한 경우 구글 검색 혹은 레퍼런스 검색
       - 최근에 작동되었던 상태에서 다시 수정해보기 
       - 동작 하는지 간단한 출력문으로 확인

## 진행 과정
- JAVA, SpringBoot, Mysql 등의 지식 습득 필요성
    - JAVA문법 및 SpringBoot 관련 유료 강의 및 유튜브 강의 시청함
    - Java 기본 문법과 블로그 만들기-API 생성하여 전달받은 데이터 값 보여주기, JPA 연관관계를 활용한 TABLE 만들기까지 진행. 
- 샘플 프로젝트가 열리지 않아 새로운 프로젝트를 만들어 똑같이 작성하면서 샘플 프로젝트에 대한 이해도를 높임
- 샘플 프로젝트를 활용하여 H2 DB에 CSV 파일을 모두 넣음.
- Column 값에 대하여 연관관계를 설정 하려던 중 TypeError 발생.
  - CSV(string) 과 연관관계 객체 값이 매칭 되지 않았고, Column 명을 찾지 못함.
- DB에 모두 String 값으로만 넣고 진행 불가
    - JPA, SQL, SpringBoot 등 아직 많은 공부 필요....

## 생각
- API1, API2, API3 = GET 형태
- API4 = Post 형태
- 연관 관계 맺어서 FK 생성 및 가져올수 있도록..
- 테이블 금액 합계는 DB에서 진행? JAVA 로 진행?
- [참고] 입력을 JSON 형태로 주고 받는 방법 : DTO 생성
- [참고] HttpStatus로 에러 코드 반환
