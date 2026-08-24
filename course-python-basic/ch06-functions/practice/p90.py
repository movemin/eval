# 함수 정의
def first_even(nums: list[int]) -> int | None:
    """정수 리스트를 인자값으로 한다면 
    짝수인 정수 요소를 찾아 그 값을 반환하고
    못 찾으면 None을 반환합니다.

    Args:
        nums (list[int]): 정수를 요소로 한 리스트
    Returns:
        int | None: 짝수인 첫 번째 요소, 없으면 None
    Examples:
        >>> first_even([1, 3, 5])
        None
        >>> first_even([7, 9, 11, 12])
        12
        >>> first_even([1, 1, 1])
        None
    """
    for num in nums:
        if num % 2 == 0:
            return num
    return None  # 명시적으로 None 반환 — 함수 끝에서 아무것도 찾지 못했음을 명확히 표현


# input().split() 의 각 칸을 정수로 바꿔 리스트로 만듭니다.
nums = [int(x) for x in input().split()]

# 함수 호출 및 결과값 출력
print(first_even(nums))