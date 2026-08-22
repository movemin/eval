# 지역변수가 없으면 LEGB의 규칙에 따라 전역변수를 읽는다
# ---함수 정의---
def total() -> int:
    """해당 전역변수(list)의 합계를 반환합니다"""
    return sum(nums)

# 전역 nums 를 정수 리스트로 읽습니다. 예: "1 2 3 4" → nums=[1, 2, 3, 4]
nums = [int(x) for x in input().split()]


# ---함수 호출---
print(total())