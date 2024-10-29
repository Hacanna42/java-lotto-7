# java-lotto-precourse
## 프로젝트 설명
간단한 로또 발매기를 구현하는 과제입니다. 

손님은 로또를 구입할 금액을 입력할 수 있습니다. 로또 1장의 가격은 1,000원입니다.  
손님이 구매한 로또는 모두 자동(랜덤)으로 발행됩니다. 

로또 번호는 중복 없는 6개의 숫자 + 보너스 번호 1개로 구성되어 있고, 각 번호의 숫자 범위는 1~45까지입니다.

추첨기는 당첨 번호 6자리와 보너스 번호 1자리를 입력받습니다. 입력은 쉼표(,)를 기준으로 구분합니다.

사용자가 구매한 무작위 로또 번호와 당첨 번호를 비교하여 당첨 내역과 수익률을 출력하는 것이 프로그램의 목표입니다.

### 실행 결과 예시
```
구입금액을 입력해 주세요.
8000

8개를 구매했습니다.
[8, 21, 23, 41, 42, 43] 
[3, 5, 11, 16, 32, 38] 
[7, 11, 16, 35, 36, 44] 
[1, 8, 11, 31, 41, 42] 
[13, 14, 16, 38, 42, 45] 
[7, 11, 30, 40, 42, 43] 
[2, 13, 22, 32, 38, 45] 
[1, 3, 5, 14, 22, 45]

당첨 번호를 입력해 주세요.
1,2,3,4,5,6

보너스 번호를 입력해 주세요.
7

당첨 통계
---
3개 일치 (5,000원) - 1개
4개 일치 (50,000원) - 0개
5개 일치 (1,500,000원) - 0개
5개 일치, 보너스 볼 일치 (30,000,000원) - 0개
6개 일치 (2,000,000,000원) - 0개
총 수익률은 62.5%입니다.
```

<br>

- - -

<br>

## 과제 진행 과정
아래 순서대로 객체지향 설계를 할 생각입니다. (What/Who 사이클의 구체화)
1. 도메인을 단순화해서 이해한 **도메인 모델**을 그려본다.
2. 어떤 메시지가 필요한지 정하고, 그 메시지를 어떤 객체가 책임 질지 정한다.
3. 이렇게 얻은 객체들의 인터페이스를 정리한다.
4. 구현하면서 구체적인 설계를 채워나간다.
5. 개념, 명세, 구현의 세 관점이 모두 잘 드러나는지 검토한다.

<br>


### 도메인 모델과 메시지
![도메인모델with메시지](https://github.com/user-attachments/assets/c424c097-ca7a-43c5-aba0-0e45eeef716b)




<br>

- - -



## 구현할 기능 목록
- [x] 금액을 입력받는 기능
- [x] 당첨 번호를 설정하는 기능
- [x] 입력된 값을 검증하는 기능
- [x] 입력된 금액만큼 로또를 발행하는 기능
- [x] 로또를 랜덤 값으로 발행하는 기능
- [ ] 당첨 여부를 파악하는 기능
- [ ] 당첨 내역과 수익률을 구하는 기능
