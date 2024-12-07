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

# SOAP vs REST

SOAP(Simple Object Access Protocol)과 REST(Representational State Transfer)는 웹 서비스 통신에 사용되는 두 가지 주요 아키텍처 스타일입니다.

---

## 주요 차이점 요약

| 특징            | **SOAP**                         | **REST**                           |
|-----------------|---------------------------------|-----------------------------------|
| **프로토콜**    | 프로토콜                        | 아키텍처 스타일                   |
| **데이터 포맷** | XML                            | JSON, XML, Plain Text 등          |
| **상태 관리**   | 상태 유지 가능                  | 무상태(Stateless)                 |
| **보안**        | WS-Security 등 표준 지원         | HTTPS, OAuth, JWT 등 활용          |
| **전송 프로토콜**| HTTP, SMTP, TCP 등               | HTTP                              |
| **속도**        | 상대적으로 느림                 | 빠르고 가벼움                      |
| **활용**        | 금융, 트랜잭션, 보안이 중요한 시스템 | 모바일, 웹 애플리케이션, 공개 API  |

---

## 상세 차이점

### 1. 프로토콜 기반
- **SOAP**: 엄격한 규격의 프로토콜로 XML 기반 메시지 형식을 사용.
- **REST**: HTTP 프로토콜 기능을 활용한 아키텍처 스타일로, 리소스 중심 설계.

### 2. 데이터 포맷
- **SOAP**: XML만 지원.
- **REST**: JSON, XML 등 다양한 포맷 지원 (JSON을 주로 사용).

### 3. 상태 관리
- **SOAP**: 상태를 유지 가능 (세션 기반 작업 지원).
- **REST**: 무상태(Stateless) 설계로 요청 간 독립적.

### 4. 보안
- **SOAP**: WS-Security와 같은 표준으로 강력한 보안 지원.
- **REST**: HTTPS, OAuth, JWT 등으로 보안 처리 (SOAP만큼 고도화된 표준은 없음).

### 5. 전송 프로토콜
- **SOAP**: HTTP, SMTP, TCP 등 다양한 프로토콜 지원.
- **REST**: HTTP를 기반으로 동작.

### 6. 성능 및 확장성
- **SOAP**: 무거운 구조로 인해 상대적으로 느림.
- **REST**: 경량화 설계로 빠르고 확장성 높음.

### 7. 활용 사례
- **SOAP**: 금융, 결제 시스템, 기업용 애플리케이션.
- **REST**: 모바일, 소셜 네트워크, 공개 API.

---

## 결론
- **SOAP**: 보안 및 트랜잭션 처리에 적합한 복잡한 시스템.
- **REST**: 경량화, 빠른 응답이 필요한 현대 애플리케이션.


# HTTP (HyperText Transfer Protocol)

HTTP는 웹에서 클라이언트와 서버 간 데이터를 주고받기 위한 **비상태적(stateless)** 프로토콜입니다. 주로 브라우저, 모바일 앱 등이 사용하며, 인터넷의 기본 통신 규칙입니다.

---

## 주요 특징
- **비상태적:** 요청 간 상태 유지 X → 쿠키, 세션 등으로 상태 관리 가능.
- **텍스트 기반:** 사람이 읽기 쉬운 텍스트 형식으로 요청/응답 처리.
- **무연결:** 요청과 응답 후 연결 종료 → HTTP/1.1부터 연결 재사용(Persistent Connection) 지원.

---

## 동작 방식
1. **클라이언트가 요청(Request) 생성**
   - **구성 요소:** HTTP 메서드, URL, 헤더, 바디
2. **서버가 요청 처리 후 응답(Response) 반환**
   - **구성 요소:** 상태 코드, 헤더, 바디

---

## HTTP 메서드
- **GET:** 데이터 조회.
- **POST:** 데이터 생성/서버 작업 요청.
- **PUT:** 리소스 생성/업데이트.
- **DELETE:** 리소스 삭제.
- **HEAD:** 헤더만 요청.
- **OPTIONS:** 서버 지원 메서드 요청.
- **PATCH:** 리소스 일부 업데이트.

---

## HTTP 상태 코드
- **1xx (정보):** 요청 처리 중 (예: 100 Continue).
- **2xx (성공):** 요청 성공 (예: 200 OK, 201 Created).
- **3xx (리다이렉션):** 추가 작업 필요 (예: 301 Moved Permanently).
- **4xx (클라이언트 오류):** 요청 오류 (예: 400 Bad Request, 404 Not Found).
- **5xx (서버 오류):** 서버 처리 실패 (예: 500 Internal Server Error).

---

## HTTP 버전
- **HTTP/0.9:** 최초 버전, 단순 텍스트 전송.
- **HTTP/1.0:** 헤더, 상태 코드, 다양한 메서드 도입.
- **HTTP/1.1:** 연결 유지, 파이프라이닝 지원.
- **HTTP/2:** 바이너리 프로토콜, 멀티플렉싱 지원.
- **HTTP/3:** QUIC 프로토콜 기반, 대기 시간 감소 및 성능 향상.

---

## HTTP vs HTTPS
- **HTTP:** 암호화 X → 데이터 노출 가능성 있음.
- **HTTPS:** SSL/TLS로 암호화된 HTTP → 안전한 데이터 전송.

# REST Uniform Interface

REST의 **Uniform Interface**는 클라이언트와 서버 간 상호작용을 일관되게 유지하기 위한 핵심 원칙입니다. RESTful API를 단순하고 예측 가능하며 사용하기 쉽게 만드는 요소입니다.

## 구성 요소

1. **자원의 식별 (Identification of Resources)**
   - 리소스는 고유한 URL로 식별.
   - URL은 데이터를 표현하며, 데이터를 포함하지 않음.
   - 예:  
     - `/users/123` (사용자 ID 123의 리소스)

2. **표현을 통한 리소스 조작 (Manipulation of Resources Through Representations)**
   - 클라이언트는 JSON, XML 등의 형식으로 리소스 표현을 통해 조작.
   - 표현은 리소스의 상태를 나타냄.

3. **자체 설명 메시지 (Self-descriptive Messages)**
   - 요청 메시지는 필요한 정보를 자체적으로 포함.
   - HTTP 메서드와 헤더를 통해 의도를 명확히 전달.
   - 예:  
     ```http
     GET /users/123 HTTP/1.1
     Host: api.example.com
     Authorization: Bearer token
     ```

4. **HATEOAS (Hypermedia as the Engine of Application State)**
   - 클라이언트는 하이퍼링크를 따라 필요한 리소스를 동적으로 탐색.
   - 예:  
     ```json
     {
       "id": 123,
       "name": "John Doe",
       "links": [
         {"rel": "self", "href": "/users/123"},
         {"rel": "orders", "href": "/users/123/orders"}
       ]
     }
     ```

## 장점
- **일관성**: API가 예측 가능하고 쉽게 이해 가능.
- **확장성**: 클라이언트가 동적으로 새로운 기능 탐색 가능.
- **유지보수성**: 클라이언트와 서버의 결합도 낮음.
- **표준화**: HTTP 표준 활용으로 상호운용성 증가.

## 요약
Uniform Interface는 클라이언트와 서버가 독립적이면서도 효율적으로 협력할 수 있도록 표준화된 원칙을 제공합니다.

# Spring Boot 주요 어노테이션 요약

## 1. @RestController
- **설명**: RESTful 웹 서비스를 위한 컨트롤러.
- **특징**: 
  - `@Controller`와 `@ResponseBody`의 결합.
  - JSON, XML 데이터를 반환.
- **사용 예시**:
  ```java
  @RestController
  @RequestMapping("/api")
  public class MyController {
      @GetMapping("/hello")
      public String hello() {
          return "Hello, World!";
      }
  }
  ```

## 2. @RequestMapping
- **설명**: URL과 컨트롤러(클래스/메서드)를 매핑.
- **특징**: 
  - 클래스 레벨과 메서드 레벨에서 사용 가능.
  - HTTP 메서드(GET, POST 등)와 URL 패턴 지정 가능.
- **사용 예시**:
  ### 클래스 레벨에서 사용
  ```java
  @RequestMapping("/api")
  public class MyController {
      @RequestMapping(value = "/hello", method = RequestMethod.GET)
      public String hello() {
          return "Hello!";
      }
  }
  ```

## 3. @Service
- **설명**: 비즈니스 로직을 처리하는 서비스 레이어를 나타냄.
- **특징**: 
  - 스프링의 컴포넌트 스캔 대상.
  - 비즈니스 로직 구현 및 재사용 가능.
- **사용 예시**:
  ```java
  @Service
  public class MyService {
      public String processData() {
          return "Processed Data";
      }
  }
  ```
    
## 4. @Repository
- **설명**: 데이터 액세스 계층(DAO)을 나타내는 어노테이션.
- **특징**:
  - 데이터베이스 연산과 관련된 작업을 처리.
  - 데이터 접근 예외를 스프링의 `DataAccessException`으로 변환.
  - JPA, MyBatis 등 ORM 라이브러리와 함께 사용됨.
- **사용 예시**:
  ```java
  @Repository
  public interface MyRepository extends JpaRepository<MyEntity, Long> {
      List<MyEntity> findByName(String name);
  }
  ```

## 5. @X-Mapping (@GetMapping, @PostMapping 등)
- **설명**: HTTP 메서드별 매핑을 간편하게 처리하는 어노테이션.
- **특징**:
  - `@RequestMapping`의 축약형으로, HTTP 메서드와 URL 매핑을 간결하게 표현.
  - `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping` 등이 있음.
- **사용 예시**:
  ### @GetMapping
  - HTTP GET 요청을 처리하는 매핑.
  ```java
  @RestController
  @RequestMapping("/api")
  public class MyController {
      @GetMapping("/get")
      public String getMethod() {
          return "GET Method";
      }
  }
  ```

## 6. @Autowired
- **설명**: 스프링의 의존성 주입(Dependency Injection)을 자동으로 처리하는 어노테이션.
- **특징**:
  - 스프링 컨테이너에서 관리하는 빈(Bean)을 자동으로 주입.
  - **필드 주입**, **생성자 주입**, **세터 주입** 방식으로 사용할 수 있음.
  - 타입을 기준으로 의존성 주입을 처리.
- **사용 예시**:

### 생성자 주입 (권장)
- 생성자에 `@Autowired`를 사용하여 빈을 주입.
- **권장 방식**으로, 테스트 용이성과 불변성을 보장.

```java
@Service
public class MyService {
    private final MyRepository myRepository;

    @Autowired
    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public void execute() {
        myRepository.findAll();
    }
}
  ```

## 생성자 주입을 권장하는 이유

### 1. **불변성 보장**
   - 생성자 주입은 객체가 생성될 때 의존성을 설정하므로 객체의 불변성을 보장합니다.
   - `final` 키워드를 사용하여 객체의 상태 변경을 방지할 수 있습니다.

### 2. **의존성 명확화**
   - 생성자에서 의존성을 명시적으로 주입하므로, 클래스의 의존성을 한눈에 파악할 수 있습니다.
   - 코드 내에서 의존성을 쉽게 확인할 수 있습니다.

### 3. **테스트 용이성**
   - 테스트 시, 의존성을 생성자 주입을 통해 명시적으로 전달할 수 있어 테스트가 간편해집니다.
   - `@Mock` 객체 등을 생성자에 주입할 수 있어 테스트 코드가 간단해집니다.

### 4. **순환 의존성 예방**
   - 생성자 주입을 사용하면 순환 의존성을 컴파일 타임에 오류로 발견할 수 있습니다.
   - 순환 의존성 문제를 쉽게 조기에 발견할 수 있습니다.

### 5. **스프링의 권장 방식**
   - 스프링은 기본적으로 생성자 주입을 권장합니다. 필드 주입은 가능한 피하는 것이 좋습니다.

### 결론
생성자 주입은 **불변성**, **의존성 명확화**, **테스트 용이성**, **순환 의존성 예방** 등의 장점이 있어, 코드의 안정성, 유지보수성, 확장성을 높이는 데 유리합니다.


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
