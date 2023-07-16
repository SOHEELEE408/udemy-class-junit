#섹션2: JUnit Review

## 5~6. Developing JUnit Test-Overview
### 단위 테스트 구조
* Set Up : 테스트 할 클래스의 인스턴스 생성
* Execute : 테스트 할 메서드를 실제로 호출
* Assert : 테스트 결과 검증

🔗 [인텔리제이 JUnit5 참고](https://www.jetbrains.com/help/idea/junit.html)

### Junit Assertions
* JUnit 검증 메서드는 <i>org.junit.jupiter.api.Assertions</i> 클래스에 정의되어 있다.
* Execute 단계의 로직이 단순한 경우, 검증 단계와 합칠 수 있다. ➡️코드를 줄일 수 있다.
```java

// when & then
assertEquals(expected, demoUtils.add(2, 4), "2+4는 6이다.");
assertNotEquals(unexpected, demoUtils.add(2, 4), "2+4는 8이 아니다.");

```
* 자주 사용하는 메서드
    - message 파라미터: 테스트 실패 시 표시할 메시지
  
    |메소드 명| 설명         |
    |--------|------------|
    |assertEquals| 동일한 값인지 확인 |
    |assertNotEquals| 값이 다른지 확인  |
    |assertNull| null인지 확인  |
    |assertNotNull| null이 아닌지 확인 |

🔗[JUnit User Guide - Writing-tests](https://junit.org/junit5/docs/current/user-guide/#writing-tests)

### JUnit Lifecycle Methods

* Before each test
  * 객체 생성, 공통으로 필요한 데이터 세팅
* Before all test
  * 데이터베이스 connection 얻기, 원격 서버 연결 등을 이 단계에서 수행
* After each test
  * 리소스 반환, 데이터 초기화
* After all test
  * 데이터베이스 connection 반환, 원격 서버 연결 해제
  
| Annotation  | 설명                 |
|-------------|--------------------|
| @BeforeEach | 각 단위 테스트 수행 전마다 실행 |
| @BeforeAll | 모든 테스트 수행 전에 한 번 실행 |
| @AfterEach  | 각 단위 테스트 수행 후마다 실행 |
| @AfterAll | 모든 테스트 수행 후에 한 번 실행 |

* @BeforeAll과 @AfterAll 메서드는 기본적으로 static으로 선언되어야 한다.
* 실행 순서
  * @BeforeAll ➡ @BeforeEach ➡ test Method ➡ @AfterEach ➡ @AfterAll