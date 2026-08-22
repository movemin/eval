# 함수 정의
def max_three(num1: int, num2: int, num3: int) -> int:
    """세 인자값 중 최대값을 반환합니다.
    
    Args:
        num1 (int): 첫번째 정수
        num2 (int): 두번째 정수
        num3 (int): 세번째 정수
    Returns:
        int: 최댓값
    Example:
        >>> max_three(1, 2, 3)
        3
    """
    return max(num1, num2, num3)


# input().split() 으로 세 칸을 나눠 각각 정수로 바꿉니다.
num1, num2, num3 = [int(x) for x in input().split()]

# 함수 호출하여 반환값 출력
print(max_three(num1, num2, num3))