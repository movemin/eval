# 함수 정의
def sum_product(a: int, b: int) -> tuple[int, int]:
    """정수를 두 개 입력하시면 합계와 곱셈 결과가 튜플로 반환됩니다.

    Args:
        a (int): 첫번째 정수
        b (int): 두번째 정수
    Returns:
        tuple[int, int]: 합계, 곱셈
    Examples:
        >>> sum_product(3, 5)
        (8, 15)
        >>> sum_product(0, 9)
        (9, 0)
        >>> sum_product(-2, 4)
        (2, -8)
        >>> sum_product(-3, -4)
        (-7, 12)
    """
    return a + b, a * b


# import 시 메모리 절약 및 불필요한 코드 실행 및 테스트 코드를 위한 방어코드
if __name__ == '__main__':
    num1, num2 = [int(x) for x in input().split()]
    print(*sum_product(num1, num2))