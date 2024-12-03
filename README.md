# **Spring Framework 특징**
1. **컨테이너 역할**  
   - 객체의 생명주기를 관리하며, 객체 간의 의존성을 설정하고 관리.

2. **DI (Dependency Injection) 지원**  
   - 객체 간의 의존 관계를 설정 파일이나 어노테이션으로 정의하여 코드의 결합도를 낮춤.

3. **AOP (Aspect-Oriented Programming) 지원**  
   - 공통 관심사를 분리하여 로직 간섭 없이 횡단 관심사를 처리.

4. **POJO (Plain Old Java Object) 지원**  
   - 특정한 규약이나 프레임워크에 종속되지 않는 순수 자바 객체로 개발 가능.

5. **트랜잭션 처리 방법의 일관성**  
   - 선언적 트랜잭션 관리 방식으로 트랜잭션 처리 로직을 분리.

6. **영속성과 관련된 다양한 API 지원**  
   - JPA, Hibernate 등 여러 ORM 프레임워크와의 통합 가능.

# **Spring Framework 특징 (추가 설명)**

1. **컨테이너 역할**  
   - **객체 간의 의존성을 설정하고 관리**  
     Spring 컨테이너는 애플리케이션에서 사용되는 객체(bean)의 생성, 초기화, 소멸 등 생명주기를 관리함.  
     개발자는 의존 관계를 명시적으로 코드에 작성하는 대신, 설정 파일(XML)이나 어노테이션(@Autowired, @Inject 등)을 통해 의존성을 정의할 수 있음.  
     이를 통해 객체 간의 결합도를 낮추고 유연한 설계가 가능.

5. **트랜잭션 처리 방법의 일관성**  
   - **선언적 트랜잭션 관리 방식**  
     Spring에서는 선언적 트랜잭션 관리를 통해 비즈니스 로직과 트랜잭션 관리 로직을 분리할 수 있음.  
     주로 어노테이션 기반으로 트랜잭션 경계를 지정하며, 개발자는 비즈니스 로직에만 집중하면 됨.


---

# **Spring과 Maven**
- **Spring**: 자바 엔터프라이즈 애플리케이션 개발을 위한 경량 프레임워크.
- **Maven**: 프로젝트 빌드, 의존성 관리, 플러그인 지원 등 프로젝트의 생명주기 관리를 도와주는 빌드 툴.  
  Spring과 Maven은 함께 사용되어 의존성 설정, 빌드, 배포 과정을 단순화함.

# 스프링 환경설정 요약

## 1. JDK 설치
- 스프링을 실행하려면 JDK(Java Development Kit)가 필요합니다.

---

## 2. 사용할 IDE 선택
- **STS (Spring Tool Suite)**: 스프링 전용으로 구성된 IDE.
- **IntelliJ IDEA**: 강력한 기능을 제공하며, 특히 Ultimate 버전은 스프링 지원이 우수.

---

## 3. 프로젝트 생성
- [start.spring.io](https://start.spring.io)에서 스프링 프로젝트를 생성:
  - **Group**: 회사 도메인의 역순으로 작성 (예: `com.companyname`).
  - **Artifact**: 프로젝트 이름 작성 (예: `projectname`).

---

## 4. 프로젝트 기본 구조
- **`pom.xml`**: 프로젝트 의존성과 빌드 정보를 정의하는 파일(Maven 사용 시).
- **`mvnw`**: Maven Wrapper, 별도 Maven 설치 없이 사용 가능.
- **`*BootApplication.java`**: 프로젝트의 메인 실행 클래스.
- **`application.properties`**: 애플리케이션 환경설정 파일.
- **`*BootApplicationTest.java`**: 테스트 클래스.


# Spring Setting
- [JDK 설치](#jdk-설치)
- [Vscode 설치](#vscode-설치)
- [Spring Boot PJT 생성](#spring-boot-pjt-생성)
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
