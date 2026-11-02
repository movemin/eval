# 상품 할인 관련 클래스
class Product:
    """상품을 할인한 최종 가격을 관리합니다."""

    # 생성자: 상품 할인을 위한 속성 추상화
    def __init__(self, name: str, price: int) -> None:
        self.name = name
        self.price = price

    def discounted(self, percent: int) -> int:
        """할인한 결과를 반환하는 메서드"""
        return self.price * (100 - percent) // 100  # 바로 식을 적음으로써 self.price 읽기만 하여 반환


# 상품 이름과 가격을 입력받고, 가격은 정수로 변환한 뒤 할인율 목록 저장
name, price = input().split()
price = int(price)
percents = [int(x) for x in input().split()]


# ---- 호출부 (수정 금지) ----
p = Product(name, price)
for percent in percents:
    print(f"{p.name} {percent}% 할인가 {p.discounted(percent)}")
print(f"정가 {p.price}")