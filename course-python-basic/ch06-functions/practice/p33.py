# 전역 color = 첫 단어, inner = 둘째 단어. 예: "빨강 파랑" → color="빨강", inner="파랑"
parts = input().split()
color = parts[0]
inner = parts[1]

# 함수 내부에서 대입연산자 -> 스택에 따라 지역변수 우선
# 생명주기가 끝나면 전역변수가 우선
def paint():
    """
    호출하면 지역 color에 inner 값을 할당하고 반환합니다
    지역변수이기 때문에 호출이 끝나도 전역변수는 원래 값을 가집니다.
    """
    color = inner
    return color

print(paint())
print(color)