# 함수 정의
def max_all(*nums: int) -> int:
    """인자들을 넣으면 그 인자들 중 최대값을 반환합니다.
    
    Args:
        *nums: 최대값들을 구할 정수(들)
    Returns:
        int: 최대값
    Examples:
        >>> max_all(3, 1, 4, 1, 5)
        5
        >>> max_all(5)
        5
        >>> max_all(-3, -1, -2)
        -1
    """
    return max(nums)


# 입력을 정수 리스트로 만듭니다. 예: "3 1 4" → nums=[3, 1, 4]
nums = [int(x) for x in input().split()]

# ↓ 호출부 (수정하지 마세요)
print(max_all(*nums))