# 🛍️ JPA Shop 프로젝트

Spring Boot, JPA를 활용한 쇼핑몰 예제 프로젝트입니다.  
회원가입, 상품 등록, 주문, 재고 관리 등 전자상거래의 핵심 기능을 학습하고 실습하는 데 목적이 있습니다.

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
![ERD](resources/static/img/jpashop-erd.png)

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

### ⚙ 기타 기능
- 주문 시 재고 감소 및 예외 처리  
- AOP 기반 성능 측정 기능  
- 테스트 코드 기반 기능 검증  

---

## 🧪 테스트 실행

```bash
./gradlew test
