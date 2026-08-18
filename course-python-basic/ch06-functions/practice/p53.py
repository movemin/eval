# 정수 x 를 입력에서 읽습니다. 예: "10" → x=10
x = int(input())

# int는 불변 객체이기 때문에 함수 안에서 업데이트를 해도 새 객체가 만들어진다.
def add_one(n: int) -> int:
    """
    인자의 값이 1이 더하여 반환됩니다.
    단, 전역변수의 값 자체는 변하지 않습니다.

    Args:
        n (int): 1을 더할 정수 값  
    Returns:
        int: n + 1의 결과
    """
    n += 1
    return n

# 함수 출력: add_one(x)의 반환값 (x+1)
print(add_one(x))

# 원본 x 출력: 불변 객체이므로 함수 호출 후에도 값이 변하지 않음
print(x)