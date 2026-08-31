# 함수 정의
def first_and_last_sum(*nums: int) -> int:
    """가변 인자를 받아 첫 인자와 마지막 인자의 합을 반환합니다.
    
    Args:
        nums (int): 첫 인자와 마지막 인자를 포함한 정수(들)
    Returns:
        int: 첫 인자와 마지막 인자의 합계
    Examples:
        >>> first_and_last_sum(1, 2, 3, 4)
        5
        >>> first_and_last_sum(5)
        10
        >>> first_and_last_sum(-1, 5, -3)
        -4
    """
    return nums[0] + nums[-1]  # 튜플의 첫 원소와 마지막 원소를 합산


# 입력을 정수 리스트로 만듭니다. 예: "1 2 3 4" → nums=[1, 2, 3, 4]
nums = [int(x) for x in input().split()]

# ↓ 호출부 (수정하지 마세요)
print(first_and_last_sum(*nums))