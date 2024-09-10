# A307 김혜인

## 2024.09.02
* 아이디어 회의

| 구분 | 내용 |
| --- | --- |
| **해결하고 싶은 문제** | 1. 푸드트럭 앞에 줄이 길어 기다려야 하는 문제(푸드트럭 사이렌오더)<br>2. 계좌이체 표지판을 보고 직접 계좌를 입력하여 송금해야 하는 번거로움<br>3. 푸드트럭의 위치 정보가 실시간으로 업데이트되지 않아 알 수 없는 문제<br>4. 글로 적힌 메뉴판이 바래져 가독성이 떨어지는 문제 |
| **핵심 기능** | - **NFC를 이용한 간편 계좌 송금 (푸드트럭)** <br><br>- **매출 관리 (AI를 활용한 매출 리포트)** <br><br>- **주문 예약 시스템**<br>  1) 사이렌오더 같은 시스템 (= 테이블링)<br>  2) NFC를 이용한 주문 예약 (줄이 긴 푸드트럭/도깨비 야시장)<br>  3) 카드 결제/계좌 이체 선택 (선불 시스템)<br><br>- **개인별 메뉴 확인 및 리뷰** → **리뷰는 후순위**<br>  1) 알레르기 요소 있는 메뉴 정보 확인<br><br>- **GPS를 통한 위치 업데이트** |
| **부가 기능** | - **NFC를 이용한 간편 계좌 송금 (푸드트럭)** <br>  → 인증 필요<br><br>- **매출 관리 (AI를 활용한 매출 리포트)** <br>  → 사장님이 회원가입을 했을 경우 제공되는 기능<br>  → ~~대출 기능~~<br><br>- **영업 시작 버튼 클릭 시 해당 푸드트럭의 위치 표시 (GPS)** <br>  → 사업자 등록 번호가 있는 푸드트럭만 가입 가능<br><br>- **외국인을 위한 환율 시스템** (메뉴 가격이 해외 통화로 얼마인지 함께 표시)<br><br>- **대기 팀 수 표시** (주문 전/후 모두 표시)<br><br>- **NFC 태그를 이용한 음식 수령**<br>  → NFC 태그 인식(스마트폰) → 쿠키, 세션스토리지 등으로 주문 정보 전송 → 정보에 맞는 음식을 손님에게 전달 → 포장된 음식 태깅 처리 → 시스템에서 수령 완료 처리 |
| **핀테크 요소** | - 비밀번호 입력 시 키패드가 랜덤하게 바뀌는 보안 기능<br>- 매출 관리(AI 활용)<br>- NFC를 통한 간편 가상계좌 송금<br>- 간편결제 정보를 등록 후 스와이프 한 번으로 결제<br>- ~~마이데이터를 통해 혜택까지 얼마 남지 않은 카드를 우선 추천~~ |
| **최종 산출물** | PWA? |

---

## 2024.09.03

* 아이디어 구체화

| 구분             | 내용                                                                                      |
|------------------|-------------------------------------------------------------------------------------------|
| **서비스 이름**  | Tag & Eat / 푸바오 / 스트릿 / **스푸파**                                                     |
| **서비스 한줄 소개** | NFC를 활용해 줄 서지 않고 간편하게 주문·결제하며, 실시간 매장 위치 확인과 매출 관리를 지원하는 스마트 주문 예약 서비스 |
| **주요 이용자**  | - 줄 서는 공간이 협소하고 혼잡한 가게 <br> - 메뉴가 온라인 상에 정확하게 기재되어있지 않은 가게 <br> 위 항목에 포함되는 가게의 사장님/이용 고객(ex. 푸드트럭, 야시장) |
| **해결하고 싶은 문제** | 1. 푸드트럭 앞에 줄 엄청 서 있는 거 (푸드트럭 사이렌오더 필요) <br> 2. 계좌이체 표지판 보고 직접 계좌 입력해서 보내야 되는 것 <br> 2-1. 계좌이체 시 본인 계좌가 직접 노출된다. <br> 3. 푸드트럭 위치가 업데이트되지 않아 알 수 없는 것 <br> 4. 건물에 위치한 정식 식당이 아니거나 위치가 유동적인 경우 네이버 지도에 등록되어 있지 않다. <br> 4-1. 푸드트럭이나 포장마차의 경우 현재 오픈 여부를 알기 어렵다. <br> 4-2. 글로 적힌 메뉴판이 바래져 보이지 않거나 글자가 옅어진 경우 가독성이 떨어진다. <br> 5. ~~고객이 내 음식이 아닌데 잘못 가져갈 수도 있다.~~ **→** 해결이 어려움 <br> 6. 고객이 본인 주문번호를 헷갈리거나 까먹을 수 있다. |
| **해결 방법**    | 1. 주문 예약 시스템을 통해 해결할 수 있다. <br> 2. NFC를 이용한 간편 계좌 송금을 하게 한다. <br> 3. GPS를 통해 위치를 업데이트한다. <br> 4. 모바일 메뉴판을 통해 개인별로 메뉴 확인이 가능하게 한다. <br> 5. ~~수령 완료 처리 과정을 통해 음식을 잘못 가져갈 확률을 줄일 수 있다.~~ <br> 6. NFC 태그를 통해 고객의 주문번호가 자동으로 뜨기 때문에 고객이 주문번호를 기억할 필요가 없다. |
| **서비스 가치**  | 푸드트럭, 야시장과 같은 줄이 엄청나게 늘어선 곳에서 줄을 없애줌                         |
| **가설**         |                                                                                           |
| **핵심 기능**    | **1. NFC를 이용한 간편 계좌 송금 (푸드트럭)** <br> **2. 매출 관리 (AI를 활용한 매출 리포트)** <br> **3. GPS를 통한 위치 업데이트** <br> **4. 주문 예약 시스템** <br> **5. 개인별 메뉴 확인 및 리뷰** → **리뷰는 후순위** <br> **6. NFC 태그를 이용해 본인의 음식 수령** |
| **부가 기능**    | **1. NFC를 이용한 간편 계좌 송금 (푸드트럭)** <br> → 인증 필요 <br> **2. 매출 관리 (AI를 활용한 매출 리포트)** <br> → 사장님이 회원가입을 했을 경우 제공되는 기능 <br> → ~~대출 기능~~ <br> **3. GPS를 통한 위치 업데이트** <br> → 영업 시작 버튼 클릭 시 해당 푸드트럭의 위치 표시 (GPS) (= 서비스를 실행했을 때) <br> → 사업자 등록 번호가 있는 푸드트럭만 가입 가능 <br> **4. 주문 예약 시스템** <br> 1) 사이렌오더 같은 시스템 (= 테이블링) <br> 2) NFC를 이용한 주문 예약 (줄이 긴 푸드트럭/도깨비 야시장) <br> 3) 카드 결제/계좌 이체 선택 (선불 시스템) <br> → 앞에 몇 팀이 있는지 정도를 표시 (주문 전/주문 후 모두 표시) <br> **5. 개인별 메뉴 확인 및 리뷰** → **리뷰는 후순위** <br> → 알레르기 요소 있는 메뉴 정보 확인 <br> **6. NFC 태그를 이용해 본인의 음식 수령** <br> ⏰ **수령 과정** <br> NFC 태그 인식(스마트폰) → 쿠키, 세션스토리지 등등 주문정보 전송 → 정보에 맞는 음식 손님에게 전달 → 포장된 음식 태깅 처리 → 시스템에서 수령 완료 처리 <br> ⏰ **수령 완료 처리 방식** <br> 1) 회원 방식 <br> - NFC 태그 인식 → 시스템에서 자동으로 수령 완료 처리 → 손님의 주문 번호 확인 가능 → 해당 주문 번호에 맞는 음식 제공 <br> 2) 비회원 방식 <br> - 카카오톡 알림 → 직원에게 확인요청이라는 메신저 수락 → 주문 번호 확인 가능 <br> - **기타 기능** <br> ~~1) 외국인을 위한 환율 시스템..? (메뉴 가격이 해외돈으로 얼마인지 함께 표시)~~ |
| **핀테크 요소**  | - 비밀번호 입력 시 키패드 랜덤하게 바뀌는 거 (보안) <br> - **매출 관리(AI를 활용한 매출 리포트, GPS 매출 관리) → 지도 활용하면 좋을 것 같음.** <br> - NFC를 통한 간편 가상계좌 송금 <br> - 간편결제 정보를 등록해놓고 스와이프 한 번으로 결제 <br> - ~~마이데이터를 통해 실적이 혜택까지 얼마 남지 않은 카드를 우선 추천해준다.~~ |
| **목표 아님**    |                                                                                           |
| **최종 산출물**  | PWA?                                                                                      |


---

## 2024.09.04

* 기능 명세서 작성

| 1depth     | 2depth            | 3depth                    | 접근 권한   | 요구 기능                               | 상세                                                       | 우선순위 |
|------------|-------------------|---------------------------|-------------|----------------------------------------|------------------------------------------------------------|----------|
| 회원       | 회원가입           | 소셜 (카카오)              | 비회원      | -카카오톡 소셜 로그인 가능             | - 카카오톡 ID로 회원가입<br>- 랜덤 닉네임 배정              | 1        |
|            |                   |                           |             |                                        | * 카카오에서 가져올 데이터: 프로필 정보                      |          |
|            | 로그인             | 소셜 (카카오)              | 사장,손님   | -카카오톡 소셜 로그인 가능             | - 로그인 시 JWT 토큰 발급                                    | 1        |
|            | 회원정보 조회      |                           | 사장,손님   |                                        | - 위치 정보 보기<br>- 이용약관 보기                         | 1        |
|            | 회원정보 수정      |                           | 사장,손님   |                                        | - 닉네임 수정                                               | 1        |
|            | 회원 탈퇴          |                           | 사장,손님   |                                        | - 정보 수정 페이지에서 접근<br>- 회원 데이터 복구 불가, 리뷰 데이터 자동 삭제 안 됨 고지 | 1        |
| 점포       | 점포 등록          |                           | 사장        | 점포 인증 및 등록                      | - 사업자등록번호 (API로 진위여부 확인)<br>- 점포 위치 저장 (고정형/이동형)<br>- 점포와 연결된 계좌 정보 받기(API로 계좌 존재 여부 확인)<br>- 영업일 및 영업시간 등록 | 1        |
|            | 점포 관리          | 점포 조회                 | 사장        | 내 점포 조회                           |                                                            | 1        |
|            |                    | 점포 수정                 | 사장        | 내 점포 정보 수정                      | - 영업일 및 영업 시간 수정                                  | 1        |
|            |                    | 점포 삭제                 | 사장        | 내 점포 삭제                           |                                                            | 1        |
|            | 점포 목록 조회      |                           | 손님        | 메뉴 이름/GPS 에 따라 점포 검색 가능   | - 지도상에 마커 표시<br>- 메뉴 이름별 검색 기능             | 1        |
|            | 점포 상세 조회      | 점포 정보 조회            | 손님        | 선택한 점포 상세 확인                  | - NFC 태그로 접근/앱으로 접근                               | 1        |
|            |                    | 점포 메뉴 조회            | 손님        |                                        |                                                            | 1        |
|            |                    | 점포 리뷰 조회            | 손님        |                                        |                                                            | 1        |
|            | 메뉴 관리          | 메뉴 추가                 | 사장        | 메뉴 등록                              | - 초기 일괄 등록<br>- 메뉴 추가 등록                        | 1        |
|            |                    | 메뉴 조회                 | 사장        |                                        |                                                            | 1        |
|            |                    | 메뉴 수정                 | 사장        |                                        |                                                            | 1        |
|            |                    | 메뉴 삭제                 | 사장        |                                        |                                                            | 1        |
|            |                    | 메뉴 정보 업데이트        | 사장        | 메뉴 품절 정보 업데이트                | - 토글로 품절 상태<br>- 메뉴에 표시 여부                   | 1        |
| 영업       | 영업 관리          | 영업 개시                 | 사장        | 점포 위치 정보 및 개시 정보 업데이트   | - 영업 개시 여부 업데이트<br>- GPS를 활용한 점포 위치 업데이트 | 1        |
|            |                    |                           | 사장        | 점포 정보 등록                         | - 사진 등록 (선택)<br>- 사장님의 한마디 등록 (선택)         | 1        |
|            |                    | 영업 일시정지             | 사장        |                                        | - 일시정지 버튼 → 시간 표시(선택)<br>* 토글 방식            | 2        |
|            |                    | 영업 종료                 | 사장        |                                        | - 일 기준, 종료한 시점의 매출 정보와 GPS 기록 저장<br>* 위치 업데이트 기준 GPS 기록 저장 | 1        |
|            |                    | 영업 위치 업데이트        | 사장        |                                        | 영업 중 위치를 이동했을 때 정보 업데이트                    | 1        |
| 주문       | 주문 관리          | 주문 조회                 | 사장        |                                        | - 제조대기, 제조중, 제조완료, 픽업완료 4 단계로 주문 내역 조회 | 1        |
|            |                    | 주문 내역 조회            | 사장        |                                        |                                                            | 1        |
|            |                    | 리뷰 조회                 | 사장        |                                        |                                                            | 1        |
|            |                    | 주문 승인                 | 사장        |                                        |                                                            | 1        |
|            |                    | 주문 거절                 | 사장        |                                        |                                                            | 1        |
|            |                    | 주문 환불                 | 사장        | 주문 환불 처리                         | - 컴플레인이 들어올 시, 주문 환불 처리                      | 4        |
|            |                    | 주문 상태 변경            | 사장        | 승인 대기, 조리 중, 조리 완료(픽업대기) |                                                            | 1        |
|            |                    | 주문 조회                 | 손님        | 지금까지 주문한 내역 볼 수 있음        |                                                            | 1        |
|            |                    | 주문 상세 조회            | 손님        | 조리 대기, 조리 중, 조리 완료(픽업대기) |                                                            | 1        |
|            |                    | 주문 리뷰 등록            | 손님        |                                        | - 픽업 완료된 건에 대하여                                  | 5        |
|            |                    | 주문 리뷰 수정            | 손님        |                                        | - 리뷰가 있는 건에 대하여                                  | 5        |
|            |                    | 주문 리뷰 삭제            | 손님        |                                        | - 리뷰가 있는 건에 대하여                                  | 5        |
|            |                    | 주문 취소                 | 손님        |                                        | - 조리 시작전만 가능                                      | 4        |
|            |                    | 주문 상태 조회            | 손님        |                                        |                                                            | 1        |
|            |                    | 앞 팀 조회                | 손님        | 현재 앞에 몇 팀이 있는지 조회          | - 주문 전 → 현재 승인된 주문 모두 보기<br>- 주문 후 → 해당 주문 이전의 주문 수 체크 | 1        |
| 장바구니   | 장바구니 조회       |                           | 손님        | 장바구니 조회                          | 담은 메뉴들을 조회                                          | 1        |
|            |                    | 장바구니 수정             | 손님        | 메뉴 추가, 삭제, 수정                  | 담은 메뉴를 수정, 삭제, 추가 기능                           | 1        |
|            |                    | 메뉴 담기                 | 손님        | 메뉴판에서 메뉴 담기                   | - 같은 가게 메뉴만 담기<br>- (있을 경우) 옵션 설정<br>- 메뉴 추가, 삭제, 옵션 변경 | 1        |
|            |                    | 주문 요청                 | 손님        | 장바구니에 담은 메뉴 기반 주문 요청    | 주문 요청 → 결제 → 주문 완료 (승인 대기)                   | 1        |
| 결제       | 가상 계좌           |                           | 손님        |                                        | 토스 API 사용                                               | 1        |
|            | 계좌이체           |                           | 손님        |                                        | 토스 API 사용                                               | 5        |
|            | 카드 결제           |                           | 손님        |                                        | 토스 API 사용                                               | 1        |
| 매출관리   | GPS 기반 판매 위치 추천 |                           | 사장        |                                        | - 매출이 발생하는 GPS를 기반으로 매출이 높은 순으로 내림차순으로 정렬<br>- 근처 동일 업종의 점포가 다수 존재하면 알림<br>* 생성형 AI 사용 | 1        |
|            | AI 월별 통계 제공   |                           | 사장        | AI를 통한 일별, 메뉴별, 판매수량별, 판매금액별 통계자료 제공 | - 생성형 AI 사용                                            | 1        |
|            | 단골관리           |                           | 사장        | 회원일 경우, 몇 회 구매했는지, 최근 방문일 알림 | - 생성형 AI 사용                                            | 1        |


---

## 2024.09.05
* 와이어프레임 회의 진행 (그림)


---

## 2024.09.06
* 와이어프레임 제작 진행 중
![image](/uploads/3f216a73c4ea5bf587fae2695d78d848/image.png)

---

## 3주차

## 2024.09.09
* 와이어프레임 제작 (피그마)


## 2024.09.10
* 와이어프레임 제작 완료
* 목업 제장 진행 중
    * 메인 홈 뷰
    * 가게 상세
