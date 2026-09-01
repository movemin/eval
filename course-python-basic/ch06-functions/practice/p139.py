# key=value 토큰을 dict 로 파싱합니다. 예: "greeting=안녕 name=철수" → opts={"greeting":"안녕","name":"철수"}
opts = {}
for token in input().split():
    k, v = token.split("=")
    opts[k] = v

# 아래 함수는 이미 정의되어 있습니다 (수정하지 마세요).
def greet(greeting, name):
    return greeting + ", " + name + "!"

# 키워드 인자로 언패킹 하여 각 키워드에 맞게 인자 전달
print(greet(**opts))