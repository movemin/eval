# 함수 정의
def sum_scaled(factor: int, *nums: int) -> int:
    """배수와 가변인자의 합과의 곱셈의 결과를 반환합니다.
    
    Args:
        factor (int): 배수
        nums (int): 합을 구할 가변 인자
    Returns:
        int: 배수와 가변 인자 합을 곱한 값
    Examples:
        >>> sum_scaled(2, 1, 2, 3)
        12
        >>> sum_scaled(0, 5, 5)
        0
        >>> sum_scaled(5)
        0
    """
    return factor * sum(nums)  # nums가 비어 있으면 sum()이 0을 반환하므로 별도 처리 불필요


# 첫 토큰=배수(factor), 나머지=더할 정수들. 예: "2 1 2 3" → factor=2, nums=[1, 2, 3]
parts = input().split()
factor = int(parts[0])
nums = [int(x) for x in parts[1:]]

# ↓ 호출부 (수정하지 마세요) — factor 는 위치 인자, 나머지는 * 로 풀어 전달
print(sum_scaled(factor, *nums))