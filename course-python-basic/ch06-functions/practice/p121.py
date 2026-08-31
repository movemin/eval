# 함수 정의
def count_above(threshold: int, *nums: tuple[int]) -> int:
    """해당 가변 인자들 중 기준 초과 개수를 반환합니다.
    
    Args:
        threshold (int): 기준값
        nums (tuple[int]): 임의의 정수(들)
    Returns:
        int: 기준 초과 개수
    Examples:
        >>> count_above(5, 3, 6, 1, 8)
        2
        >>> count_above(0, -1, 1, 2)
        2
        >>> count_above(7)
        0
    """
    return sum(num > threshold for num in nums)  # bool 합산(True: 1, False: 0)


# 첫 토큰=기준값(threshold), 나머지=검사할 정수들. 예: "5 3 6 1 8" → threshold=5, nums=[3, 6, 1, 8]
parts = input().split()
threshold = int(parts[0])
nums = [int(x) for x in parts[1:]]

# ↓ 호출부 (수정하지 마세요) — threshold 는 위치 인자, 나머지는 * 로 풀어 전달
print(count_above(threshold, *nums))