# 첫 줄: "예금주 초기잔액" (예: "kim 1000" -> owner="kim", balance=1000)
# 둘째 줄: 입금액들 (예: "500 300" -> [500, 300])
owner, balance = input().split()
balance = int(balance)
deposits = [int(x) for x in input().split()]

# 계좌 입금 프로그램 설계도
class Account:
    """예금주와 잔액을 관리하는 계좌 클래스입니다."""  # 클래스 역할을 더 명확히 표현
    
    # 계좌주 및 초기 금액 속성 생성자
    def __init__(self, owner, balance):
        self.owner = owner
        self.balance = balance
    
    # 입금으로 인한 상태 변경 메서드
    def deposit(self, amount):
        self.balance += amount
    
    # 현재 잔액 리턴 메서드
    def get_balance(self):
        return self.balance

    # 강제 string 메서드
    def __str__(self):
        return str(self.balance)


# ---- 호출부 (수정 금지) ----
acc = Account(owner, balance)
print(f"{acc.owner} 초기 잔액 {acc.get_balance()}")
for amount in deposits:
    acc.deposit(amount)
    print(f"입금 {amount} -> 잔액 {acc.get_balance()}")