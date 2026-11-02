from typing import Callable, get_type_hints

_CALC = Callable[[int, int], int]        # 호출부가 사용하는 검사 기준입니다. 수정하지 마세요.

# 한 줄: 정수 두 개
a, b = map(int, input().split())


# ---- 제공 함수 (수정 금지) ----
def add(x, y):
    return x + y


def mul(x, y):
    return x * y


def calc(f: Callable[[int, int], int], a: int, b: int) -> int:
    """
    함수를 입력받아 그 함수의 매개변수에 현재 함수의 매개변수를 넣어
    그 반환값을 반환
    """
    return f(a, b)


# ---- 호출부 (수정 금지) ----
print("더하기 콜백:", calc(add, a, b))
print("곱하기 콜백:", calc(mul, a, b))
h = get_type_hints(calc)
print("f 힌트가 Callable[[int, int], int]인가:", h.get("f") == _CALC)
print("a, b 힌트가 int인가:", h.get("a") is int, h.get("b") is int)
print("반환 힌트가 int인가:", h.get("return") is int)