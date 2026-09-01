# key=value 토큰을 dict 로 파싱합니다. 예: "name=철수 age=20 city=서울" → opts={"name":"철수","age":"20","city":"서울"}
# 컴프리헨션을 사용하여 코드 간결성 향상
opts = {key: value for token in input().split() for key, value in [token.split("=")]}

# 아래 함수는 이미 정의되어 있습니다 (수정하지 마세요).
def profile(name, age, city):
    return name + "/" + age + "/" + city

# 딕셔너리를 풀어 각 파라미터에 맞게 인자를 전달하여 반환값 출력
print(profile(**opts))