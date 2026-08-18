# 조건문에 따라 "양수", "음수", "0" 반환
def sign(n: int) -> str:
    """
    부호 판별 함수입니다.
    
    Args:
        n: 정수(int)
    Returns:
        str: 0 초과: '양수'
             0 미만: '음수'
             0 일시: '0'
    """
    if n > 0:
        return "양수"
    elif n < 0:
        return "음수"
    return "0"  # 0일시 문자열 "0" 반환

# 부호를 판별할 정수 입력받기
n = int(input())

# 함수 호출: 부호 판별 결과값 반환문 출력
print(sign(n))