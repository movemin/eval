# 함수 정의
def max_two(num1: int, num2: int) -> int:
    """두 수 중 큰 값을 반환한다."""
    return num1 if num1 >= num2 else num2  # 삼항 연산자를 사용하여 함수 의도 명확화

# 두 정수를 읽습니다. 예: "10 2" → a=10, b=2
parts = input().split()
num1 = int(parts[0])
num2 = int(parts[1])

# 함수의 docstring 불러와서 출력
print(max_two.__doc__)

# 함수 호출해서 반환값 출력
print(max_two(num1, num2))