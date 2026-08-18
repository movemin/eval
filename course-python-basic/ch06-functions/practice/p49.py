# 전역 x=첫 값, a=둘째, b=셋째. 예: "10 20 30" → x=10, a=20, b=30
parts = input().split()
x = int(parts[0])
a = int(parts[1])
b = int(parts[2])

# global 선언하지 않고 전역변수와 같은 이름의 변수를 선언하면 지역변수가 생성되고,
# LEGB의 규칙에 따라 호출하면 지역변수의 x를 먼저 읽는다.
def without_global(v):
    """지역 대입만 수행 — 전역 x는 변경되지 않음"""
    x = v  # 새 지역변수

# global을 선언할 경우 전역변수가 직접 바뀐다.
def with_global(v):
    """global 선언 후 대입 — 전역 x를 직접 변경"""
    global x
    x = v  # 전역변수


without_global(a)
print(x)

with_global(b)
print(x)