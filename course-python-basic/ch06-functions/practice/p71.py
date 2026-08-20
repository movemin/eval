# [알고리즘]
# 함수를 정의
# 함수의 코드는 반복문과 조건문으로
# 리스트의 요소가 0보다 클 경우 카운트 세서
# 그 카운트 변수를 반환하는 코드 만들기
def count_positive(nums: list[int]) -> int:
    """리스트를 넣으면 양수의 개수가 반환됩니다.

    Args:
        nums (list[int]): 정수의 리스트
    Returns:
        int: 양수의 개수
    Examples:
        >>> count_positive([1, -2, 3, -4, 5])
            3
        >>> count_positive([-1, -2, -3])
            0
        >>> count_positive([0, 0, 5])
            1
    """

    return sum(num > 0 for num in nums)  # Python 관용구


# input().split() 의 각 칸을 정수로 바꿔 리스트로 만듭니다. 예: "1 -2 3" → nums=[1, -2, 3]
nums = [int(x) for x in input().split()]

# 함수 호출하여 출력
print(count_positive(nums))