# 첫 줄: 상품 수 n. 이어지는 n 줄: "상품명 가격". 마지막 줄: 변경할 세율 (예: "20" -> 20)
n = int(input())
rows = []
for _ in range(n):
    name, price = input().split()
    rows.append((name, int(price)))
new_rate = int(input())


# 공유 세율 클래스
class Item:
    """세금을 합산한 계산기 클래스"""

    # 세율은 모든 항목이 가지고 있는 값이므로 객체 지향형에 맞게 유지보수가 용이하도록 클래스 메모리에 저장
    tax_rate = 10

    # 생성자
    def __init__(self, name: str, price: int):
        self._name = name
        self._price = price

    # 캡술화된 속성을 쉽게 읽을 수 있도록 설계
    @property
    def price(self) -> int:
        return self._price
    
    @property
    def name(self) -> str:
        return self._name
    
    # 세금을 반영한 가격을 반환
    def price_with_tax(self) -> int:
        """세금과 가격을 합산한 값을 반환합니다."""
        # self.__class__.tax_rate 사용 시 상속 환경에서도 올바르게 동작
        return self._price + self._price * self.__class__.tax_rate // 100  # 공유 세율 적용


# ---- 호출부 (수정 금지) ----
items = [Item(name, price) for name, price in rows]
print("세율:", Item.tax_rate)
for it in items:
    print(it.name, it.price_with_tax())
Item.tax_rate = new_rate                 # 클래스 속성 변경 -> 기존 객체 전부에 반영되어야 한다
print("세율:", Item.tax_rate)
for it in items:
    print(it.name, it.price_with_tax())
print(items[0].tax_rate == Item.tax_rate, "tax_rate" in items[0].__dict__)