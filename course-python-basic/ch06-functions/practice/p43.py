# int(input()) 으로 정수 한 개를 읽습니다. 예: 입력이 "4" 이면 n == 4
n = int(input())

# ---함수 정의---
def is_even(n: int) -> bool:
    """
    파라미터에 인자를 정수를 넣어 호출하시면
    짝수일 경우 True, 홀수일 경우 False를 반환합니다.
    """
    return n % 2 == 0  # 비교연산자는 바로 boolean형 반환

# ---함수 호출---
print(is_even(n))