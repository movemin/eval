# 첫 줄: 처음 잔액. 둘째 줄: 연산 수 n. 이어지는 n 줄: "spend 300" / "earn 500" -> ("spend", 300) / ("earn", 500)
money = int(input())
n = int(input())
ops = []
for _ in range(n):
    op, amount = input().split()
    ops.append((op, int(amount)))


# 지갑 클래스
class Wallet:
    """지갑의 잔액을 관리하는 클래스"""

    # 생성자
    def __init__(self, money: int) -> None:
        self._money = money  # private

    # 속성 읽기
    @property
    def money(self) -> int:
        """현재 잔액을 읽는 메서드"""
        return self._money

    # 소비
    def spend(self, amount: int) -> bool:
        """소비를 관리하는 메서드"""
        if self._money >= amount:
            self._money -= amount
            return True
        return False
    
    # 소득
    def earn(self, amount: int) -> None:
        """버는 돈을 관리하는 메서드"""
        self._money += amount

    # 디버깅 시 나오는 반환값 -> 디버깅으로 현재 상태 확인
    def __repr__(self) -> str:
        return f'Wallet(money={self._money})'

# ---- 호출부 (수정 금지) ----
w = Wallet(money)
print("start:", w.money)
for op, amount in ops:
    if op == "spend":
        result = w.spend(amount)
    else:
        result = w.earn(amount)          # 반환문이 없으므로 None
    print(f"{op} {amount}: {result} / 잔액 {w.money}")