# 입력을 정수 리스트로 만듭니다. 예: "3 5" → coords=[3, 5]
coords = [int(x) for x in input().split()]

# 아래 함수는 이미 정의되어 있습니다 (수정하지 마세요).
def make_point(x, y):
    return "(" + str(x) + ", " + str(y) + ")"

# 입력값을 언패킹하여 각 파라미터의 위치인자에 맞게 인자 전달
print(make_point(*coords))