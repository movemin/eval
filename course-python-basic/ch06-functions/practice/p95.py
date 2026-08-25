# 함수 정의
def power(base: int, exp: int = 2) -> int:
    """위치 인자에는 밑, 
    키워드 인자에는 2를 기본값으로 하는 지수를 입력받아
    거듭제곱을 반환합니다.
    
    Args:
        base: 밑
        exp: 지수
    Returns:
        int: 거듭제곱 (base의 exp승)
    Examples:
        >>> power(5)
        25
        >>> power(2, 3)
        8
        >>> power(10, 1)
        10
    """
    return base ** exp


# 한 줄을 공백으로 나눕니다.
parts = input().split()

# parts가 1개면 exp 생략 → 기본값 2 사용 / 2개면 두 번째 값이 지수
# parts[:2]: 명세 상 최대 2개 토큰만 사용함을 명시적으로 제한
print(power(*map(int, parts[:2])))