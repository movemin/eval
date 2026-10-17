from typing import Any, get_type_hints


def describe(value: Any) -> str:
    """매개변수를 받아 문자열 타입으로 매개변수의 값과 그 값의 타입을 반환합니다."""
    return f"{value} ({type(value).__name__})"


# 첫 줄: 정수, 둘째 줄: 단어
n = int(input())
word = input().strip()


# ---- 호출부 (수정 금지) ----
print(describe(n))
print(describe(word))
print(describe([n, n]))
h = get_type_hints(describe)
print("value 힌트가 Any인가:", h.get("value") is Any)
print("반환 힌트가 str인가:", h.get("return") is str)