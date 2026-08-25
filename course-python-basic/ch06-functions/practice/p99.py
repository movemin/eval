# 함수 정의
def increment(n: int, step: int = 1) -> int:
    """값과 증가폭을 입력하시면 증가폭이 반영된 값이 반환됩니다.
    
    Args:
        n (int): 값
        step (int): 증가폭
    Returns:
        int: 증가된 값
    Examples:
        >>> increment(10)
        11
        >>> increment(10, 5)
        15
        >>> increment(0)
        1
        >>> increment(100, -1)
        99
    """
    return n + step


# 한 줄을 공백으로 나눕니다. 토큰이 1개면 기본 증가폭(1), 2개면 둘째 값이 증가폭입니다. (정수)
parts = list(map(int, input().split()))

# 함수 호출 후 최종 결과값 출력
print(increment(*parts))