# 입력을 정수 리스트로 만듭니다. 예: "2 10" → nums=[2, 10]
nums = [int(x) for x in input().split()]

# 아래 함수는 이미 정의되어 있습니다 (수정하지 마세요).
def power(base, exp):
    return base ** exp

# 리스트를 언패킹하여 각 위치인자에 맞게 인자 전달하여 반환값 출력
print(power(*nums))