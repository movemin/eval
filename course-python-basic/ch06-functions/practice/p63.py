# 정수 n 을 읽습니다. 예: "5" → n=5
n = int(input())

# 정수의 제곱을 반환하는 함수 정의
def square(n):
    """정수의 제곱을 반환한다."""
    return n * n

# 함수 docstring 반환값 출력
print(square.__doc__)

# 함수 호출하여 출력
print(square(n))