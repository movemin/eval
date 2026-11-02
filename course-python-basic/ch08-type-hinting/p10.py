from typing import get_type_hints


def to_number(value: int | str) -> int:
    """매개변수를 정수형으로 바꾸는 메서드"""
    if isinstance(value, str):
        return int(value)
    return value


# 첫 줄: 정수, 둘째 줄: 숫자로만 된 문자열
a = int(input())
b = input().strip()


# ---- 호출부 (수정 금지) ----
print("정수 입력:", to_number(a))
print("문자열 입력:", to_number(b))
print("두 값의 합:", to_number(a) + to_number(b))
h = get_type_hints(to_number)
print("value 힌트가 int | str 인가:", h.get("value") == (int | str))
print("반환 힌트가 int인가:", h.get("return") is int)