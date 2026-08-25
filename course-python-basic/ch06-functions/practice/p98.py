# 함수 정의
def range_sum(n: int, start: int = 1) -> int:
    """끝값과 시작값을 넣으면 그 구간 합을 반환합니다.

    Args:
        n (int): 끝값
        start (int): 시작값
    Returns:
        int: 구간 합
    Examples:
        >>> range_sum(5)
        15
        >>> range_sum(5, 3)
        12
        >>> range_sum(10)
        55
        >>> range_sum(7, 7)
        7
    """
    return (start + n) * (n - start + 1) // 2



# 한 줄을 공백으로 나눕니다. 첫 토큰=n, 둘째 토큰(있으면)=start. 토큰 1개면 start 는 기본값 1. (정수)
parts = input().split()

# 함수 호출 후 출력 -> 인자가 한 개일 것을 대비하여 인덱스 슬라이싱과 조건문 활용
if len(parts) == 1:
    print(range_sum(int(parts[0])))
else:
    print(range_sum(int(parts[0]), int(parts[1])))