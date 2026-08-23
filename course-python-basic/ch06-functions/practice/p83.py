# 함수 정의
def safe_divide(a, b):
    """0으로 나누면 오류를 반환하는 안전한 나눗셈 함수입니다.
    
    Args:
        a (int): 나누어지는 정수 (제수)
        b (int): 나누는 정수 (피제수)
    Returns:
        str | int: b가 0이면 '오류', 아니면 a // b의 정수 몫
    Notes:
        b == 0 일 때 즉시 조기 종료하여 ZeroDivisionError를 방지합니다.   
    Examples:
        >>> safe_divide(10, 2)
        5
        >>> safe_divide(10, 0)
        '오류'
    """
    return "오류" if b == 0 else a // b


# input().split() 으로 두 칸을 나눠 각각 정수로 바꿉니다.
num1, num2 = [int(x) for x in input().split()]

# 함수 호출
print(safe_divide(num1, num2))