# Spring Setting
- [JDK 설치](#jdk-설치)
- [Vscode 설치](#vscode-설치)
- [Spring Boot PJT 생성](#spring-boot-pjt-생성)

<br/>    

# TDD Setting
- [TDD 설정](#TDD-설정)

<br/>    

## JDK 설치

### URL
https://jdk.java.net/java-se-ri/17

<br/>   

### 환경설정
- 시스템 환경변수 편집 - 환경변수 - 시스템 변수 - 새로만들기       
변수 이름 : JAVA_HOME    
값 : jdk 경로

<br/>   

- 시스템 변수 - path - 새로만들기    
입력 : %JAVA_HOME%\bin

<br/>   

- 설치 확인    
cmd
```
java -version
```

<br/>   

## Vscode 설치

### vscode 다운로드

### extensions 설치 
- Extension Pack for Java
- Spring Boot Extension Pack

<br/>   

## Spring Boot PJT 생성

- vscode 실행
- ctrl + shift - p
- spring initialize [maven or gradle]

<br/><br/>   

## TDD 설정

### Dependency 설정
- MAVEN(pom.xml)
```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-test</artifactId>
	<scope>test</scope>
</dependency>
```

<br/>   

- GRADLE(build.gradle)
```
testImplementation('org.springframework.boot:spring-boot-starter-test')
```

<br/>

### 어노테이션 설정
- WebMvcTest    

@Controller, @ControllerAdvice, @JsonComponent, Filter, WebMvcConfigurer, HandlerMethodArgmentResolver만 로드
=> @Controller, @RestController 가 설정 된 클래스들을 찾아 메모리에 생성

```
@WebMvcTest
```
- AutoConfigureMockMvc      

WebMVCTest에 추가로 @Service나 @Repository가 붙은 객체들도 모두 메모리에 올린다는 것

```
@SpringBootTest
@AutoConfigureMockMvc
```
