# 함수 정의
def min_all(*nums: int) -> int:
    """가변인자를 받으면 그 인자들 중 최솟값을 반환합니다.
    
    Args:
        *nums: 최솟값을 구할 정수(들)
    Returns:
        int: 최솟값
    Examples:
        >>> min_all(3, 1, 4, 1, 5)
        1
        >>> min_all(5)
        5
        >>> min_all(-3, -1, -2)
        -3
    """
    return min(nums)  # 내장 min() 으로 튜플에서 최솟값 반환


# 입력을 정수 리스트로 만듭니다. 예: "3 1 4" → nums=[3, 1, 4]
nums = [int(x) for x in input().split()]

# ↓ 호출부 (수정하지 마세요)
print(min_all(*nums))