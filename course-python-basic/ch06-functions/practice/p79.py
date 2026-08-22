# 함수 정의
def min_max(nums: list[int]) -> tuple[int, int]:
    """정수를 요소로 가진 리스트를 입력받아 튜플로 최솟값과 최댓값을 반환합니다.

    Args:
        nums (list[int]): 정수를 요소로 하는 리스트
    Returns:
        tuple[int, int]: 최솟값과 최댓값
    Examples:
        >>> min_max([3, 1, 4, 1, 5])
        (1, 5)
        >>> min_max([5])
        (5, 5)
        >>> min_max([-3, -1, -2])
        (-3, -1)
    """

    return min(nums), max(nums)  # 파이썬답게 두 개의 값을 쉼표로 구분하여 반환


# input().split() 의 각 칸을 정수로 바꿔 리스트로 만듭니다. 예: "3 1 4" → nums=[3, 1, 4]
nums = [int(x) for x in input().split()]

# 함수 호출 및 결과값 출력 -> 출력시 언패킹하여 출력
print(*min_max(nums))