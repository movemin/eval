from typing import NoReturn, get_type_hints

# 한 줄에 나이 정수들이 공백으로 구분되어 있습니다. 예: "20 -3 0" -> [20, -3, 0]
ages = [int(t) for t in input().split()]

# 타입 힌트를 정의하여 매개변수의 자료형이 다를 시 오류를 발생시켜 원인 파악 용이성 향상
def log(msg: str) -> None:
    """[LOG] 접두사와 함께 메시지를 출력한다. 반환값 없음."""
    print(f"[LOG] {msg}")

def fail(msg: str) -> NoReturn:
    """항상 ValueError를 발생시키며, 정상 흐름으로 반환되지 않는다 (NoReturn)."""
    raise ValueError(msg)
    
def check_age(age: int) -> int:
    """음수가 아니면 나이 그대로 반환, 음수면 fail()로 예외 발생"""
    return age if age >= 0 else fail("음수 나이")

# ---- 호출부 (수정 금지) ----
h = get_type_hints(log)
print(h.get("msg") is str, h.get("return") is type(None))
h = get_type_hints(fail)
print(h.get("msg") is str, h.get("return") is NoReturn)
h = get_type_hints(check_age)
print(h.get("age") is int, h.get("return") is int)
for age in ages:
    r = log(f"검사 {age}")
    print(r is None)
    try:
        print("통과", check_age(age))
    except ValueError:
        print("거부")
try:
    fail("직접 호출")
    print("도달하면 안 됨")
except ValueError:
    print("예외 발생")