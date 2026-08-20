# input().split() 으로 두 칸을 나눠 각각 정수로 바꿉니다. 예: "3 3" → a=3, b=3
num1, num2 = [int(x) for x in input().split()]

# 함수 정의
def is_equal(num1: int, num2: int) -> bool:
    """두 수가 같으면 True, 다르면 False를 반환합니다.
    
    Args:
        num1 (int)
        num2 (int)
    Returns:
        bool:
            서로 같은 정수: True
            서로 다른 정수: False
    """
    return num1 == num2  # 비교연산자는 불린형을 반환

# 함수 호출하여 반환값 출력
print(is_equal(num1, num2))