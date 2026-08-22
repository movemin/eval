# 전역 name = 첫 단어, guest = 둘째 단어. 예: "주인 손님" → name="주인", guest="손님"
parts = input().split()
name = parts[0]
guest = parts[1]

# 파라미터 정의가 전역변수와 같더라도, 지역변수가 우선순위 -> 전역변수를 가린다
def greet(name):
    """매개변수를 받아 문자열을 반환합니다."""
    return "안녕, " + name

print(greet(guest))
print(name)