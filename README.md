# 🛍️ JPA Shop 프로젝트

Spring Boot, JPA를 활용한 쇼핑몰 예제 프로젝트
회원가입, 상품 등록, 주문, 재고 관리 등 전자상거래의 핵심 기능을 학습하고 실습

---

## 🛠️ 사용 기술 스택

- Java 17  
- Spring Boot  
- Spring Data JPA  
- H2 Database  
- Gradle  
- Thymeleaf  
- Lombok  
- QueryDSL  

---

## 📂 데이터베이스 구조(ERD)
![ERD](src/main/resources/static/img/jpashop-erd.png)

---

## 시연 화면
![MAIN](src/main/resources/static/img/jpahop-main.png)

### 회원가입
![MAIN](src/main/resources/static/img/join.gif)

### 상품 등록
![MAIN](src/main/resources/static/img/item.gif)

### 주문
![MAIN](src/main/resources/static/img/order.gif)

---

## ✨ 주요 기능

### 👤 회원 기능
- 회원가입  
- 회원 목록 조회  

### 📦 상품 기능
- 상품 등록 (도서, 영화, 음반 등)  
- 상품 수정  
- 상품 목록 조회  

### 🧾 주문 기능
- 상품 주문  
- 주문 내역 조회  
- 주문 취소  

### ⚙ 주요 기능
- JPA의 영속성 컨텍스트와 지연 로딩
- Cascade, orphanRemoval 등 연관관계 설정
- Spring의 의존성 주입과 트랜잭션 처리
- QueryDSL을 이용한 타입 안정성 있는 동적 쿼리 작성
- 테스트 코드로 기능 검증
- 주문 시 재고 감소 및 예외 처리
- AOP 기반 성능 측정 기능

---

## 🧪 테스트 실행

```bash
./gradlew test
