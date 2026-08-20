# 두 정수를 읽습니다. 예: "3 5" → a=3, b=5
parts = input().split()
num1 = int(parts[0])
num2 = int(parts[1])


# docstring "두 정수의 합을 반환한다"를 작성한 인자 더하기 함수 작성
def add(a, b):
    """두 정수의 합을 반환한다."""
    return a + b

# docstring, 함수 출력
print(add.__doc__)
print(add(num1, num2))