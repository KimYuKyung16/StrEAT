# A307 김민수 README

## 2024-08-26(월)

### 아이디어 회의
### 신용카드 관리 앱의 개선 - **실시간 혜택 최적화 및 자동 적용**

### **문제점 파악:**

- **혜택 복잡성:** 많은 신용카드 사용자들이 카드의 다양한 혜택(포인트 적립, 할인, 캐시백 등)을 충분히 활용하지 못하는 경우가 많습니다. 이는 복잡한 혜택 구조와 다양한 제휴사 할인 조건 등을 모두 기억하고 관리하는 것이 어렵기 때문입니다.
- **비효율적인 사용:** 사용자는 종종 최적의 혜택을 제공하는 카드를 선택하지 못하고, 이를 통해 얻을 수 있는 절감 혜택을 놓치곤 합니다. 예를 들어, 특정 카드가 주유소에서 더 높은 할인을 제공하지만 사용자는 이를 인지하지 못하고 다른 카드를 사용할 수 있습니다.

### **개선 아이디어:**

**AI 기반의 실시간 혜택 최적화 및 자동 적용 시스템**을 통해 사용자에게 최적의 혜택을 제공하는 신용카드를 자동으로 추천하고, 결제 시 이를 자동으로 적용하는 기능을 개발합니다.

### **기능 세부 사항:**

1. **AI 기반 혜택 분석 및 추천:**
    - **실시간 분석:** AI가 사용자의 위치, 결제 금액, 제휴사 정보를 실시간으로 분석합니다. 예를 들어, 사용자가 특정 매장에서 결제를 시도할 때, AI가 해당 매장에서 어떤 신용카드가 가장 큰 혜택(예: 높은 할인율, 포인트 적립 등)을 제공하는지 즉시 분석합니다.
    - **사용자 맞춤형 추천:** AI가 사용자의 과거 소비 패턴과 카드 사용 이력을 학습하여, 특정 상황에서 어떤 카드를 사용하는 것이 가장 유리한지를 추천합니다. 예를 들어, 사용자가 자주 가는 카페나 주유소에서 특정 카드가 유리하다면, 해당 카드를 추천합니다.
2. **자동 카드 선택 및 적용:**
    - **자동 결제 설정:** 사용자가 여러 신용카드를 등록해 두면, AI가 결제 시 가장 유리한 혜택을 제공하는 카드를 자동으로 선택해줍니다. 사용자는 별도의 선택 없이 결제 단계에서 최적의 카드를 사용하게 됩니다.
    - **혜택 최적화:** 결제가 완료되면, AI가 사용된 혜택을 다시 검토하여 사용자가 얼마나 절감했는지 또는 얼마나 많은 포인트를 적립했는지를 실시간으로 보여줍니다. 또한, 사용자가 얻은 혜택을 최대화하기 위해 다음에 어떤 카드를 사용할지 추천해줍니다.
3. **알림 및 피드백 시스템:**
    - **실시간 알림:** 사용자가 특정 조건(예: 특정 상점, 대규모 구매 등)에서 결제를 시도할 때, AI가 자동으로 최적의 카드 혜택을 제안하는 푸시 알림을 보냅니다.
    - **사용자 피드백:** 사용자가 받은 혜택에 대한 만족도와 피드백을 요청하여, AI가 학습할 수 있도록 합니다. 이를 통해 사용자의 선호도에 더 맞는 혜택을 추천할 수 있게 됩니다.
4. **혜택 관리 대시보드:**
    - **종합 혜택 관리:** 사용자가 지난달, 이번 달, 또는 연간 사용한 혜택을 한눈에 확인할 수 있는 대시보드를 제공합니다. AI는 이 데이터를 바탕으로 사용자가 놓친 혜택이나, 더 나은 혜택을 제공할 수 있었던 상황을 피드백합니다.
    - **예산 관리와 연계:** AI는 사용자의 소비 패턴을 분석해, 신용카드 사용에 따른 예산 관리도 함께 제공합니다. 예를 들어, 특정 카드를 자주 사용하면서도 예산을 초과하지 않도록 자동으로 경고하는 기능을 추가할 수 있습니다.

### **사용자 경험 개선 포인트:**

- **편리함:** 사용자는 더 이상 카드 혜택을 기억하거나 비교할 필요가 없습니다. AI가 자동으로 최적의 혜택을 제공하는 카드를 선택해 주기 때문에, 사용자 경험이 크게 향상됩니다.
- **절감 극대화:** 사용자는 자신의 카드 혜택을 최대한 활용할 수 있게 되어, 실질적인 금전적 이익을 얻을 수 있습니다.
- **데이터 기반 맞춤형 서비스:** 사용자의 소비 패턴과 선호도를 학습한 AI가 맞춤형 서비스를 제공하여, 사용자는 자신에게 꼭 맞는 금융 경험을 누릴 수 있습니다.

이 아이디어는 기존 신용카드 관리 앱에서 발견되는 불편함과 비효율성을 제거하고, 사용자가 카드 혜택을 최대한으로 누릴 수 있도록 돕는 기능을 추가하여, 차별화된 사용자 경험을 제공하는 방향으로 발전시킬 수 있습니다.

## 2024-08-27(화)

### RFID (Radio Frequency IDentification)
: 사물에 고유 코드가 기록된 전자태그를 부착하고 무선신호를 이용하여 해당 사물의 정보를 인식-식별하는 기술  
-> 무선식별, 전자태그, 스마트태그, 전자라벨 등으로 불림

### 예시

유통 및 물류 관리
• 재고 관리 : RFID를 사용하여 제품에 태그를 부착하고, 리더를 통해 실시간으로 재고를 추적함으로써 정확한 재고 정보를 제공합니다.

• 자동 물류 처리 : 물류 센터에서 제품을 운반하고 분류하는 과정을 자동화하여 물류 작업의 효율성을 높입니다.

제조업
• 제품 추적 및 생산 관리 : 제조업체는 제품에 RFID 태그를 부착하여 생산 라인을 추적하고, 제품의 제조 및 배송 단계에서 실시간 모니터링을 수행합니다.

소매업
• 지능형 매장 : 고객이 제품을 직접 가져가면 자동으로 청구서를 작성하고 결제하는 지능형 매장을 구현하기 위해 RFID 기술을 사용합니다.

• 고객 경험 향상 : RFID를 이용하여 상품을 쉽게 찾을 수 있도록 하거나, 할인 및 프로모션을 자동으로 적용하여 고객 경험을 향상시킵니다.

의료 및 병원 관리
• 환자 식별 및 의료기기 관리 : RFID를 사용하여 환자를 정확하게 식별하고 의료기기의 위치와 상태를 모니터링하여 의료 기관의 효율성을 향상시킵니다.

• 의약품 추적 : 제조에서부터 환자에게 이르는 과정에서 의약품의 추적성을 강화하여 안전성을 확보합니다.

차량 및 교통 시스템
• 자동 통행 요금 : RFID를 이용하여 자동으로 통행 요금을 부과하고 교통체증을 줄이기 위해 차량을 추적합니다.

• 차량 관리 및 유지보수 : 차량에 RFID 태그를 부착하여 유지보수 이력을 추적하고 차량의 위치를 모니터링하여 효율적인 운영을 돕습니다.

### RFID 장점
자동화 및 실시간 추적
RFID는 물체를 무선으로 신속하게 식별하고 데이터를 수집할 수 있어, 수동 프로세스에 비해 빠른 속도로 작동합니다. 또한, 물체의 위치와 상태를 실시간으로 추적할 수 있어, 물류, 생산, 및 재고 관리를 효율적으로 수행할 수 있습니다.

정확한 데이터 수집
바코드 스캔과 비교하여 더 빠르고 정확한 데이터 수집이 가능하며, 이로 인해 데이터 입력 오류가 감소합니다. RFID는 시각적 가시성이 없는 상황에서도 자동으로 물체를 식별할 수 있습니다

비전 및 가시성 향상
RFID를 활용하면 전체 공급망에서 물체의 이동을 투명하게 추적할 수 있어 가시성이 향상됩니다. 생산 라인이나 창고에서 RFID를 사용하여 실시간으로 작업 상태를 모니터링할 수 있습니다.

보안 강화
RFID는 물체의 무단 이동을 탐지하고, 보안이 필요한 지역에 적용되어 무단 접근을 방지할 수 있습니다. RFID는 태그에 개별적인 권한을 부여하여 특정 사용자나 그룹만이 접근 가능하도록 설정할 수 있습니다.


## 2024-08-28(수)

### 주제 선정
> 모바일 테이블오더 서비스

### 선정 배경
기존 테블릿 테이블 오더의 불편한점을 nfc를 통해 개인 모바일 기기로 가능


## 2024-08-29(목)

### 핵심 기능 정리
- 유저 기능
    1. NFC 접근 방법을 사용한 각자 주문
    2. 결제 기능
    3. 장바구니 기능

- 관리자 기능
    1. 테이블 합치기 
    2. 주문 정보 확인
    3. 좌석 배치도 설정
    4. 가게 매출 관리
    5. 단골 관리 → 후순위

- 공통 기능
    1. 채팅 기능


### 부가 기능 정리
#### 유저 기능
1. NFC 접근 방법을 사용한 각자 주문
- 본인 메뉴 계산
- 1/N 계산
- 지정 금액 계산

2. 결제 기능
- 가상 계좌를 이용한 송금 방식
- 카드 결제 방식
- 환불 → 후순위

3. 장바구니 기능
- 메뉴 조회, 추가, 삭제

#### 관리자 기능
1. 테이블 합치기
- 주문한 메뉴 리스트 통합해서 보여주고, 합쳐진 테이블 번호 리스트 출력 

2. 주문 정보 확인

3. 좌석 배치도 설정
- 초기 UI 기본적으로 제공
- 이후에 드래그로 요소 이동 → 후순위

4. 가게 매출 관리
- AI를 이용한 매출 관리 요약 → 받아온 데이터를 바탕으로 그래프 출력

5. 단골 관리

#### 공통 기능
1. 채팅 기능 → 양방향