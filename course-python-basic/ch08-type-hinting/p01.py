from typing import get_type_hints

# 첫 줄: "단어 횟수" (예: "ha 3" -> word="ha", times=3). 둘째 줄: "a b" 정수 두 개. 셋째 줄: 나이 정수
word, times = input().split()
times = int(times)
a, b = map(int, input().split())
age = int(input())


def repeat(word: str, times: int) -> str:      # 완성된 예시 — 매개변수 힌트 + 반환 힌트
    return word * times


# 타입 힌트를 기입함으로써 유지보수시 원인 빠르게 파악
def average(a: int, b: int) -> float:
    return (a + b) / 2


# PEP 8: 최상위 함수 사이에는 빈 줄 2개를 두는 것이 관례입니다
def is_adult(age: int) -> bool:
    return age >= 19


# ---- 호출부 (수정 금지) ----
print(repeat(word, times))
print(average(a, b))
print(is_adult(age))
h = get_type_hints(repeat)
print(h.get("word") is str, h.get("times") is int, h.get("return") is str)
h = get_type_hints(average)
print(h.get("a") is int, h.get("b") is int, h.get("return") is float)
h = get_type_hints(is_adult)
print(h.get("age") is int, h.get("return") is bool)
x: int = "hello"            # 힌트와 다른 타입을 넣어도 오류 없이 실행된다 (힌트는 강제가 아님)
print(type(x).__name__)