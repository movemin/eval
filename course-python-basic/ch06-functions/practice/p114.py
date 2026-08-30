# 함수 정의
def count_even(*nums: int) -> int:
    """가변 인자 중 짝수의 개수를 반환합니다.
    
    Args:
        nums (int): 짝수의 개수를 구할 대상값(들)
    Returns:
        int: 짝수의 개수
    Notes:
        0도 짝수로 취급합니다.
    Examples:
        >>> count_even(1, 2, 3, 4)
        2
        >>> count_even(7)
        0
        >>> count_even(0, 1, 2)
        2
        >>> count_even(0)
        1
    """
    # bool이 0/1로 평가되는 성질을 활용한 대안 표현 (현재 코드와 동일 결과)
    return sum(num % 2 == 0 for num in nums)


# 입력을 정수 리스트로 만듭니다. 예: "1 2 3 4" → nums=[1, 2, 3, 4]
nums = [int(x) for x in input().split()]

# ↓ 호출부 (수정하지 마세요)
print(count_even(*nums))