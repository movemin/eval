# 함수 정의
def discount_price(price: int, rate: int = 10) -> int:
    """가격과 할인율을 입력하면 할인 적용 가격을 반환합니다.
    
    Args:
        price (int): 가격
        rate (int): 할인율
    Returns:
        int: 할인 적용 가격
    Examples:
        >>> discount_price(1000)
        900
        >>> discount_price(1000, 25)
        750
        >>> discount_price(1000, 0)
        1000
    """
    return price - price * rate // 100


# 한 줄을 공백으로 나눕니다. 토큰이 1개면 기본 할인율(10), 2개면 둘째 값이 할인율(%)입니다.
parts = input().split()

# 함수 호출 후 인자 언패킹하여 결과값 출력
print(discount_price(*map(int, parts)))