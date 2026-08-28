# 함수 정의
def price_with_options(base: int, tax: int = 10, ship: int = 0) -> int:
    """기본가와 세율, 배송비를 입력하면 결제금액을 반환합니다.

    Args:
        base (int): 기본가
        tax (int): 세율 (기본값: 10)
        ship (int): 배송비 (기본값: 0)
    Returns:
        int: 결제 금액
    Examples:
        >>> price_with_options(1000)
        1100
        >>> price_with_options(1000, 0)
        1000
        >>> price_with_options(1000, 5, 500)
        1550
        >>> price_with_options(2000, 10, 100)
        2300
    """
    return base + (base * tax) // 100 + ship


# 한 줄을 공백으로 나눕니다. 토큰 1/2/3 개에 따라 tax, ship 이 기본값으로 채워집니다. (모두 정수)
parts = list(map(int, input().split()[:3]))  # list로 변환해 두면 필요 시 재사용 가능

# 함수 호출 밑 반환값 출력 -> 언패킹하여 파이썬 관례 준수
print(price_with_options(*parts))