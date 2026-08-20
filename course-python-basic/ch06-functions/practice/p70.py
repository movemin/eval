# 함수 정의
def list_sum(nums: list[int]) -> int:
    """숫자 리스트를 넣으면 합계가 반환됩니다.

    Args:
        nums (list[int]): 정수의 집합
    Returns:
        int: 입력받은 정수의 리스트의 합
    Examples:
        >>> list_sum([-1, 1, -1, 1])
            0
        >>> list_sum([5])
            5
        >>> list_sum([1, 2, 3, 4])
            10
    """
    return sum(nums)


# input().split() 의 각 칸을 정수로 바꿔 리스트로 만듭니다. 예: "1 2 3 4" → nums=[1, 2, 3, 4]
nums = [int(x) for x in input().split()]

# 함수 호출
print(list_sum(nums))