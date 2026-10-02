# 첫 줄: 상품 수 n. 이어지는 n 줄: "상품명 가격" (예: "사과 1200" -> ("사과", 1200))
n = int(input())
rows = []
for _ in range(n):
    name, price = input().split()
    rows.append((name, int(price)))


# 장바구니 설계도
class Cart:
    """장바구니를 관리하는 클래스 입니다."""

    # 생성자
    def __init__(self):
        self._items = []
        self._price = 0

    def add(self, name, price):
        """장바구니에 물건과 가격, 총 가격, 담은 개수를 업데이트하는 메서드입니다."""
        self._items.append((name, price))
        self._price += price

    def count(self):
        """물건을 담은 개수를 반환합니다."""
        # 변수를 선언하지 않게 하여 메모리를 줄이고, 인스턴스 변수 비파괴적 관리
        return len(self._items)

    def total(self):
        """현재 총 가격을 반환합니다."""
        return self._price

    def most_expensive(self):
        """가장 높은 가격의 상품을 반환합니다."""
        # 람다: 간단한 식을 쓰는 함수 -> max 매개변수로 넣어 기준값을 price로 하기
        # max()는 동점 시 먼저 등장한 원소를 반환하므로 동점 처리가 자동으로 올바르게 동작
        return max(self._items, key=lambda item: item[1])[0]


# ---- 호출부 (수정 금지) ----
cart = Cart()
print(cart.count(), cart.total())
for name, price in rows:
    cart.add(name, price)
    print(cart.count(), cart.total(), cart.most_expensive())