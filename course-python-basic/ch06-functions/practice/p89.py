# 함수 정의
def stats(nums: list[int]) -> tuple[int, int, int]:
    """
    정수 리스트를 인자값으로 주면
    차례대로 최솟값, 최댓값, 합계를 튜플방식으로 반환합니다.

    Args:
        nums (list[int]): 정수 리스트
    Returns:
        tuple[int, int, int]: 순서대로 최솟값, 최댓값, 합계
    Examples:
        >>> stats([1, 2, 3, 4])
        (1, 4, 10)
        >>> stats([-3, -1, -2])
        (-3, -1, -6)
    """
    if not nums:  # 빈 리스트 방어: 실무에서 유용한 엣지케이스 처리
        raise ValueError("nums 리스트는 비어 있을 수 없습니다.")
    return min(nums), max(nums), sum(nums)

# input().split() 의 각 칸을 정수로 바꿔 리스트로 만듭니다.
nums = [int(x) for x in input().split()]

# 함수를 호출하여 최종결과값 출력시 언패킹하여 출력
print(*stats(nums))