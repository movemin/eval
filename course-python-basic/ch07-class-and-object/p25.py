# 첫 줄: 가격들 (예: "1500 3000" -> [1500, 3000]). 둘째 줄: 바꿀 통화 기호 (예: "$")
amounts = [int(x) for x in input().split()]
new_currency = input().strip()


# 클래스 작성
class Price:
    """가격 표시 통화 클래스"""
    currency = "원"

    # 생성자
    def __init__(self, amount):
        self._amount = amount

    # 가격 출력 메서드
    def show(self) -> str:
        """현재 가격을 현재 설정된 통화 단위로 반환합니다."""
        return f"{self._amount}{type(self).currency}"

    # 부모 클래스 cls를 전달받을려면 @classmethod 기입해야 한다.
    @classmethod
    def set_currency(cls, c: str) -> None:
        """공유 통화 단위를 바꿔주는 메서드입니다."""
        cls.currency = c


# ---- 호출부 (수정 금지) ----
prices = [Price(a) for a in amounts]
print(Price.currency)
for p in prices:
    print(p.show())
Price.set_currency(new_currency)
print(Price.currency)
for p in prices:
    print(p.show())
print("currency" in prices[0].__dict__)