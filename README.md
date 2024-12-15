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


## Layered Architecture

Layered Architecture는 애플리케이션을 여러 계층으로 나누어 각 계층의 책임을 분리하는 구조입니다. 주요 계층은 보통 다음과 같습니다:

### 1. **Presentation Layer (프레젠테이션 계층)**
   - **책임**: 사용자 인터페이스(UI)와의 상호작용을 처리.
   - **구성**: 웹 페이지, RESTful API 등 사용자 요청을 받고 응답을 반환.

### 2. **Business Logic Layer (비즈니스 로직 계층)**
   - **책임**: 실제 비즈니스 로직을 처리.
   - **구성**: 서비스 클래스, 비즈니스 규칙 및 프로세스.

### 3. **Data Access Layer (데이터 접근 계층)**
   - **책임**: 데이터베이스와의 상호작용을 처리.
   - **구성**: DAO(데이터 접근 객체) 또는 레포지토리.

### 4. **Database Layer (데이터베이스 계층)**
   - **책임**: 데이터 저장 및 관리.
   - **구성**: 실제 데이터베이스, 파일 시스템 등.

### 장점
   - **책임 분리**: 각 계층이 고유한 책임을 가지므로 코드가 더 명확하고 유지보수가 쉬워짐.
   - **유연성**: 각 계층을 독립적으로 변경하고 테스트할 수 있음.
   - **확장성**: 새로운 기능을 추가하거나 기존 기능을 개선하기 쉬움.

### 결론
Layered Architecture는 애플리케이션의 각 부분을 명확히 구분하여 유지보수성과 확장성을 향상시킬 수 있는 효과적인 설계 패턴입니다.

### Spring Security란?  
Spring Security는 **Spring Framework**의 강력한 보안 모듈로, 애플리케이션의 인증(Authentication)과 권한 부여(Authorization)를 처리하는 데 사용됩니다.

#### 주요 특징
1. **인증(Authentication)**: 사용자의 신원을 확인.  
2. **권한 부여(Authorization)**: 사용자가 애플리케이션에서 수행할 수 있는 작업을 제어.  
3. **CSRF 보호**: CSRF 공격 방지 기능 제공.  
4. **보안 필터 체인**: HTTP 요청을 필터링하여 보안을 강화.  
5. **확장성**: 다양한 인증 및 권한 부여 전략을 커스터마이징 가능.  
6. **OAuth 2.0 및 JWT 지원**: 현대적인 인증 방식 통합.  

> **Spring Boot와 함께 사용할 경우**, 최소한의 설정으로도 기본적인 보안 기능을 구현할 수 있습니다.

---

### JWT (JSON Web Token)란?  
JWT는 **JSON 포맷**으로 사용자에 대한 정보를 안전하게 표현하는 토큰입니다. 주로 **인증 및 권한 부여** 목적으로 사용됩니다.

#### 구조
1. **Header**: 토큰의 타입(JWT)과 해싱 알고리즘(HMAC, RSA 등).  
2. **Payload**: 사용자 정보나 클레임(Claim)을 포함.  
3. **Signature**: Header와 Payload를 조합한 후 비밀키로 암호화한 값.  

#### 특징
1. **Stateless**: 서버에서 세션 정보를 저장할 필요가 없으므로, 확장성이 뛰어남.  
2. **Self-contained**: 토큰 자체에 필요한 정보를 담고 있어, 별도의 데이터베이스 조회가 필요 없음.  
3. **보안**: 토큰이 암호화되지는 않지만, 서명(Signature)을 통해 무결성 검증 가능.  
4. **활용**
   - 인증(Authorization)  
   - 정보 교환(Data Exchange)  
   - Single Sign-On(SSO)  

---

### CORS (Cross-Origin Resource Sharing)란?  
CORS는 **브라우저**에서 실행되는 클라이언트가 **다른 출처(origin)**의 리소스에 접근하려고 할 때, 이를 제어하는 보안 정책입니다.

#### Origin의 구성
- **스키마**: HTTP/HTTPS  
- **호스트**: 도메인 이름 또는 IP 주소  
- **포트 번호**

> 예를 들어, 브라우저가 `http://example.com`에서 실행되는 클라이언트에서 `https://api.another.com`에 요청을 보낼 경우, 이는 **교차 출처 요청**에 해당합니다.

#### CORS 주요 요소
1. **Preflight Request**: 브라우저가 실제 요청 전에 서버의 CORS 설정을 확인하기 위해 OPTIONS 요청을 보냄.  
2. **Access-Control-Allow-Origin**: 서버가 허용하는 출처를 명시.  
3. **Access-Control-Allow-Methods**: 허용되는 HTTP 메서드(GET, POST 등).  
4. **Access-Control-Allow-Headers**: 요청에 사용할 수 있는 HTTP 헤더.  

#### CORS의 필요성
1. **보안**: 출처 간의 무분별한 데이터 요청을 제한.  
2. **협력**: 신뢰할 수 있는 출처에서만 리소스 접근을 허용하여, 클라이언트-서버 간 상호작용을 안정적으로 만듦.


# JUnit 개요

JUnit은 Java에서 유닛 테스트(Unit Test)를 작성하고 실행하기 위한 오픈 소스 테스트 프레임워크입니다. 코드의 개별 단위가 예상대로 동작하는지 검증하며, 테스트 주도 개발(TDD)을 지원합니다.

---

## 주요 특징
- **단위 테스트 작성**: 코드의 입력값과 출력값을 검증.
- **테스트 자동화**: 반복적인 테스트 작업 자동화.
- **애너테이션 기반 구성**:
  - `@Test`, `@BeforeEach`, `@AfterEach`, `@BeforeAll`, `@AfterAll` 등.
- **테스트 결과 리포팅**: 성공/실패 결과 제공 및 디버깅 지원.
- **확장성과 유연성**: JUnit 5(Jupiter)에서 모듈화된 아키텍처 제공.

---

## 주요 구성 요소
### 1. 애너테이션
- `@Test`: 테스트 메서드 정의.
- `@BeforeEach`: 각 테스트 전 실행.
- `@AfterEach`: 각 테스트 후 실행.
- `@BeforeAll`: 모든 테스트 전 1회 실행 (`static`).
- `@AfterAll`: 모든 테스트 후 1회 실행 (`static`).
- `@Disabled`: 테스트 비활성화.

### 2. Assertions (단언문)
- `assertEquals(expected, actual)`: 값 비교.
- `assertTrue(condition)`: 조건 검증.
- `assertThrows()`: 특정 예외 발생 확인.

### 3. 테스트 스위트(Test Suite)
- 여러 테스트 클래스를 그룹화하여 실행 가능.

---

## JUnit 사용의 이점

1. **버그 발견 용이**  
   코드 수정 시 이전 기능이 제대로 동작하는지 쉽게 검증할 수 있습니다.

2. **코드 품질 향상**  
   테스트 코드 작성으로 인해 자연스럽게 코드의 구조와 품질이 개선됩니다.

3. **유지보수 비용 절감**  
   유닛 테스트를 통해 시스템 변경 시 발생하는 오류를 조기에 발견할 수 있어 유지보수 비용이 절감됩니다.

4. **테스트 주도 개발(TDD) 지원**  
   테스트 기반으로 개발을 진행함으로써 개발 효율성을 높이고 신뢰성 있는 코드를 작성할 수 있습니다.


# AOP (Aspect-Oriented Programming)

## 1. AOP란?
핵심 로직과 부가 기능(로깅, 보안 등)을 분리하여 코드의 모듈성과 재사용성을 높이는 프로그래밍 패러다임.

---

## 2. 주요 개념
- **Aspect (관점)**: 부가 기능을 정의한 모듈 (예: 로깅, 인증).
- **Join Point (결합 지점)**: 부가 기능이 실행될 수 있는 지점 (예: 메서드 호출).
- **Advice (충고)**: Join Point에서 실행될 동작.
  - **Before**: 메서드 실행 전.
  - **After**: 메서드 실행 후.
  - **Around**: 메서드 실행 전후를 감쌈.
- **Pointcut (시점 정의)**: 어떤 Join Point에 Advice를 적용할지 정의.
- **Weaving (위빙)**: Aspect를 실제 코드에 적용하는 과정.

---

## 3. AOP의 장점
- **모듈성 향상**: 핵심 로직과 부가 기능 분리.
- **코드 중복 감소**: 부가 기능을 하나의 Aspect로 관리.
- **유지보수 용이**: 부가 기능 변경 시 Aspect만 수정.

---

## 4. Spring AOP
Spring 프레임워크에서 지원하며 프록시 기반의 AOP 구현을 사용. 주로 런타임 위빙 방식 사용.

### 사용 사례
- 로깅
- 보안 검사
- 트랜잭션 관리
- 성능 모니터링

## 5. 정리
AOP는 핵심 로직과 부가 기능을 분리하여 **코드의 가독성, 모듈성, 유지보수성**을 향상시키는 프로그래밍 기법입니다.  
Spring AOP는 DI(Dependency Injection)와 결합하여 로깅, 보안, 트랜잭션 관리 등 부가 기능을 간단하게 구현할 수 있습니다.

---

## Log 레벨 
Log 레벨은 로그 메시지의 중요도나 우선순위를 나타냅니다. Logback에서는 아래와 같은 기본 로그 레벨이 사용됩니다  

1. **TRACE**  
   - 가장 세부적인 로그 레벨로, 디버깅보다 더 상세한 정보를 기록합니다.  
   - 주로 시스템 내부의 모든 동작을 추적하고자 할 때 사용.

2. **DEBUG**  
   - 디버깅 정보를 기록하며, 개발 중 시스템 상태를 확인하는 데 사용합니다.

3. **INFO**  
   - 정상적인 애플리케이션의 작동 과정을 기록합니다.  
   - 사용자에게 유용한 정보를 제공하는 일반 로그.

4. **WARN**  
   - 잠재적인 문제를 나타냅니다.  
   - 시스템이 작동 중이지만 주의가 필요한 상황을 기록.

5. **ERROR**  
   - 오류로 인해 일부 기능이 실패했음을 나타냅니다.  
   - 즉각적인 주의가 필요하며, 문제 해결을 위한 정보를 기록.

---

### **사용 예**  
- **개발 환경**: `DEBUG` 또는 `TRACE`를 활성화해 상세 로그를 확인.  
- **운영 환경**: `INFO` 또는 `WARN` 수준만 기록해 성능을 최적화.

## Logbac
Logback은 Java 기반 애플리케이션의 **로깅 프레임워크**로, 성능이 뛰어나고 유연한 설정을 지원합니다. SLF4J와 통합되어 사용되며, 다음과 같은 주요 특징을 가집니다  
- **빠른 처리 속도**: 대규모 애플리케이션에서도 효율적인 로깅 가능.  
- **유연한 설정**: XML 또는 Groovy를 통해 로그의 출력 형식, 파일 롤링 정책 등을 정의 가능.  
- **다양한 출력 옵션**: 콘솔, 파일, 원격 서버 등 다양한 로그 출력 지원.  

---

## 스프링 예외 처리 방법

스프링에서는 예외를 처리하기 위해 다양한 방법을 제공합니다. 주요 방식은 아래와 같습니다:

### 1. **글로벌 예외 처리 (@ControllerAdvice)**
- 애플리케이션 전역에서 발생하는 예외를 처리합니다.
- 특정 예외를 공통 로직으로 처리할 수 있습니다.
- 예외 처리 메서드에 `@ExceptionHandler`와 HTTP 상태 코드를 지정할 수 있습니다.

### 2. **개별 컨트롤러 예외 처리 (@ExceptionHandler)**
- 특정 컨트롤러 내에서 발생하는 예외를 처리합니다.
- 각 컨트롤러 클래스에 개별적으로 정의하며, 세부적인 제어가 가능합니다.

### 3. **ResponseEntity를 활용한 예외 처리**
- 예외 처리 시 HTTP 상태 코드, 헤더, 응답 본문 등을 세부적으로 제어할 수 있습니다.
- RESTful API 구현 시 유용합니다.

---

### **사용 사례**
- **전역 처리**: `@ControllerAdvice`를 사용해 공통 예외 처리 로직 작성.
- **개별 처리**: 컨트롤러 수준에서만 예외 처리.
- **REST API**: `ResponseEntity`로 유연한 에러 응답 구현.

