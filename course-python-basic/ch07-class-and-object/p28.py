# 첫 줄: 피자 수 n. 이어지는 n 줄: "이름 토핑수". 마지막 줄: 새 기본 가격
n = int(input())
orders = []
for _ in range(n):
    name, toppings = input().split()
    orders.append((name, int(toppings)))
new_price = int(input())


# 피자 가격 관리 설계
class Pizza:
    """피자 가격을 관리하는 클래스입니다."""

    # 클래스 속성: 기본 가격은 모든 피자가 공유되어야 관리하기 쉽다.
    base_price = 10000

    # 생성자
    def __init__(self, name: str, toppings: int) -> None:
        self._name = name
        self._toppings = toppings

    # 캡슐화된 인스턴스 속성 변수답게 부를 수 있게 설계
    @property
    def name(self) -> str:
        """현재 피자 메뉴를 반환합니다."""
        return self._name
    
    # 총 가격 반환
    def total(self) -> int:
        """기본 가격 + 옵션 가격을 포함한 총 가격을 반환합니다."""
        return type(self).base_price + self._toppings * 1500

    # 기본 가격 변경
    @classmethod
    def set_base_price(cls, p: int) -> None:
        """Pizza.set_base_price(new_price)식으로 기본 가격을 변경할 수 있습니다."""
        cls.base_price = p

    # 디버깅
    def __repr__(self) -> str:
        """디버깅 용
        '피자: name\n토핑: toppings\n기본가격: base_price\n총 가격: total'
        형식으로 반환합니다."""
        return (
            f"피자: {self._name}\n"
            f"토핑: {self._toppings}\n"
            f"기본가격: {Pizza.base_price}\n"
            f"총 가격: {self.total()}"
        )


# ---- 호출부 (수정 금지) ----
pizzas = [Pizza(name, toppings) for name, toppings in orders]
for p in pizzas:
    print(p.name, p.total())
Pizza.set_base_price(new_price)
print("기본 가격 변경:", Pizza.base_price)
for p in pizzas:
    print(p.name, p.total())