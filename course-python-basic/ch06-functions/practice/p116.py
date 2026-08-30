# 함수 정의
def range_span(*nums: int) -> int:
    """가변 인자들의 최댓값에서 최솟값을 빼는 정수를 반환합니다.
    
    Args:
        nums (int): 최댓값과 최솟값을 구할 정수(들). 최소 1개 이상.
    Returns:
        int: 최댓값에서 최솟값을 뺀 결과값. 모두 같으면 0.
    Examples:
        >>> range_span(3, 1, 4, 1, 5)
        4
        >>> range_span(5)
        0
        >>> range_span(-3, -1, -2)
        2
        >>> range_span(10, 0)
        10
    """
    return max(nums) - min(nums)


# 입력을 정수 리스트로 만듭니다. 예: "3 1 4" → nums=[3, 1, 4]
nums = [int(x) for x in input().split()]

# ↓ 호출부 (수정하지 마세요)
print(range_span(*nums))