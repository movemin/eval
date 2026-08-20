# 함수 정의
def average(nums: list[int]) -> int:
    """
    정수로 이루어진 리스트를 입력하면 평균값이 반환됩니다.

    Args:
        nums (list[int]): 양*음수 정수 리스트
    Returns:
        int: 평균값
    Examples:
        >>> average([1, 2, 3, 4])
        2
        >>> average([10])
        10
        >>> average([-1, -2])
        -2
    """
    if not nums:  # 빈 리스트 방어: ZeroDivisionError 예방
        return 0
    return sum(nums) // len(nums)


# input().split() 의 각 칸을 정수로 바꿔 리스트로 만듭니다. 예: "1 2 3 4" → nums=[1, 2, 3, 4]
nums = [int(x) for x in input().split()]

# 함수 호출하여 출력
print(average(nums))