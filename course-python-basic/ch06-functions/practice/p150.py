# 함수 정의
def pay(price: int, *fees: int, discount: int = 0) -> int:
    """기본 가격을 필수로 받고, 임의로 추가 요금들과 할인액을 받아
    최종 금액을 반환합니다.
    
    Args:
        price (int): 기본 가격 (필수)
        *fees (int): 추가 요금 (최소 0개 이상)
        discount (int): 할인 금액 (기본값: 0)
    Returns:
        int: 최종 금액
    Examples:
        >>> pay(1000, 100, 200)
        1300
        >>> pay(1000, 100, 200, discount=50)
        1250
        >>> pay(5000)
        5000
        >>> pay(1000, discount=100)
        900
    """
    return price + sum(fees) - discount


# 위치 토큰: 첫째=기본가, 나머지=추가요금. "discount=값" 은 키워드 전용 할인액.
# 예: "1000 100 200 discount=50" → price=1000, fees=[100,200], discount=50
raw = input().split()
pos = [t for t in raw if "=" not in t]
price = int(pos[0])
fees = [int(x) for x in pos[1:]]
discount = 0
for t in raw:
    if "=" in t:
        k, v = t.split("=", 1)
        if k == "discount":
            discount = int(v)

# ↓ 호출부 (수정하지 마세요) — discount 는 키워드 전용이라 이름으로 전달
print(pay(price, *fees, discount=discount))