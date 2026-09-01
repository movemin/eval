# key=value 토큰을 dict 로 파싱합니다. 예: "width=4 height=5" → opts={"width":"4","height":"5"}
# 딕셔너리 컴프리헨션으로 코드 간결성 향상
opts = {key: value for token in input().split() for key, value in [token.split("=")]}

# 아래 함수는 이미 정의되어 있습니다 (수정하지 마세요).
def box(width, height):
    return width + "x" + height

# 키워드와 인자를 언패킹하여 각 파라미터 위치에 맞게 전달하여 반환값 출력
print(box(**opts))