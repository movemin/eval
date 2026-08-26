# 함수 정의
def total_price(unit_price: int, count: int = 1) -> int:
    """단가와 수량을 인자값으로 하여 총액 계산합니다.
    수량은 입력되지 않을 시 기본값으로 1개로 설정됩니다.

    Args:
        unit_price (int): 단가
        count (int): 수량 (기본값: 1)
    Returns:
        int: 총액
    Examples:
        >>> total_price(5000)
        5000
        >>> total_price(5000, 3)
        15000
        >>> total_price(1200)
        1200
        >>> total_price(300, 0)
        0
    """
    return unit_price * count


# 한 줄을 공백으로 나눕니다. 토큰이 1개면 기본 수량(1), 2개면 둘째 값이 수량입니다. (정수)
parts = input().split()

# *[int(p) for p in parts] 로 언패킹하면 토큰 수에 관계없이 간결하게 처리됩니다.
# 단, 입력이 항상 1~2개 토큰임을 전제합니다.
print(total_price(*[int(p) for p in parts]))