# 함수 정의
def factorial(n: int) -> int:
    """정수를 입력하시면 그 정수의 팩토리얼이 반환됩니다.
    
    Args:
        n (int): 팩토리얼을 구할 값
    Returns:
        number (int): 팩토리얼
    Examples:
        >>> factorial(5)
            120
        >>> factorial(1)
            1
        >>> factorial(0)
            1
    """
    number = 1  # 어느 값으로 곱해도 처음에는 값이 그대로 나오게 초기화는 1로 선언

    # for문과 복합대입연산자를 통해 팩토리얼 구현
    for num in range(1, n + 1):
        number *= num

    return number


# int(input()) 으로 정수 한 개를 읽습니다. 예: 입력이 "5" 이면 n == 5
n = int(input())

# 함수 호출 및 출력
print(factorial(n))