# 함수 정의
def first_negative(nums: list[int]) -> int | str:
    """
    정수 리스트를 인자값으로 하시면
    요소가 음수가 나오면 그 정수를 반환하고,
    음수가 없으면 '없음'으로 반환합니다.
    
    Args:
        nums (list[int])
    Returns:
        int: 음수를 반환
        str: 음수가 하나도 없을 시 '없음'으로 반환
    Examples:
        >>> first_negative([3, -1, 4, -2])
        -1
        >>> first_negative([1, 2, 3])
        '없음'
        >>> first_negative([0, 0, 0])
        '없음'
    """
    for num in nums:
        if num < 0:
            return num
    return "없음"


# 함수 인자값 정수 리스트로 입력받기
nums = [int(x) for x in input().split()]

# 함수 호출 및 결과값 출력
print(first_negative(nums))