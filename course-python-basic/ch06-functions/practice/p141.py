# 입력을 정수 리스트로 만듭니다. 예: "1 2 3 4" → data=[1, 2, 3, 4]
data = [int(x) for x in input().split()]

# 아래 함수는 이미 정의되어 있습니다 (수정하지 마세요).
def total(*nums):
    s = 0
    for n in nums:
        s += n
    return s

# 가변 인자에 맞게 리스트 언패킹하여 인자 전달 후 반환값 출력
print(total(*data))