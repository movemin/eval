# 전역 name = 첫 단어, age = 둘째 단어. 예: "철수 20" → name="철수", age="20"
parts = input().split()
name = parts[0]
age = parts[1]

# LEGB에 따라 지역변수와 enclosing이 없으면 전역변수를 읽는다.
def describe():
    """호출하시면 전역변수인 이름과 나이가 반환됩니다."""
    return f"{name}({age})"

print(describe())