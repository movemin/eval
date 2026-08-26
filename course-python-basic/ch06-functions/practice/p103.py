# 함수정의
def clamp(value: int, low: int = 0, high: int = 100) -> int:
    """값과 하한, 상한을 입력하시면
    원칙상 값, 하한보다 낮을 경우 하한, 상한보다 높을 경우 상한으로
    반환됩니다.
    
    Args:
        value (int): 값
        low (int): 하한
        high (int): 상한
    Returns:
        int:
            값이 하한과 상한 사이에 있을 경우: 값
            값이 하한보다 낮을 경우: 하한
            값이 상한보다 높을 경우: 상한
    Examples:
        >>> clamp(50)
        50
        >>> clamp(150)
        100
        >>> clamp(-5)
        0
        >>> clamp(5, 10)
        10
        >>> clamp(50, 10, 40)
        40
        >>> clamp(200, 0, 100)
        100
    """
    # max/min 중첩으로도 동일하게 표현 가능
    return max(low, min(high, value))


# 한 줄을 공백으로 나눕니다. 토큰 1/2/3 개에 따라 low, high 가 기본값으로 채워집니다. (모두 정수)
parts = input().split()

# 함수 호출 -> 컴프리헨션을 사용함으로써 코드 축소 및 요소 정수화 -> 파이썬 관례에 따라 언패킹
print(clamp(*[int(part) for part in parts]))