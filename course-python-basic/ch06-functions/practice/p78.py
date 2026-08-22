# 함수 정의
def divide(a: int, b: int) -> tuple[int, int]:
    """정수를 두 개 입력하면 몫과 나머지가 반환됩니다.

    Args:
        a: 나뉘는 정수
        b: 나누는 정수
    Returns:
        tuple[int, int]: 몫, 나머지
    Examples:
        >>> divide(17, 5)
        (3, 2)
        >>> divide(0, 3)
        (0, 0)
    """
    return a // b, a % b  # 파이썬의 특징: 반환값들을 쉼표로 구분하면 튜플 자료형으로 다중 반환


# input().split() 으로 두 칸을 나눠 각각 정수로 바꿉니다. 예: "17 5" → num1=17, num2=5
num1, num2 = [int(x) for x in input().split()]

# 함수 호출 및 결과 출력
print(*divide(num1, num2))  # 반환값을 언패킹