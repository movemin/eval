# int(input()) 으로 정수 한 개를 읽습니다. 예: 입력이 "1" 이면 m == 1
m = int(input())

# ---함수 정의---
def to_seconds(m: int):
    """
    분(minute)을 넣으면 초(second)로 반환됩니다.
    
    Args:
        분 (int)
    Returns:
        int: 초
    """
    return m * 60

# ---함수 호출---
print(to_seconds(m))