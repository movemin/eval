# 전역 amount = 첫 값, rate = 둘째 값. 예: "1000 10" → amount=1000, rate=10
parts = input().split()
amount = int(parts[0])
rate = int(parts[1])

# LEGB -> 지역변수와 enclosing이 없으므로 전역변수를 읽는다
def tax_of() -> int:
    """
    호출하시면 전역변수에 저장된 금액과 세율에 따라 세금이 계산됩니다.
    전역변수를 읽기만 할 때는 global 키워드 없이도 LEGB 규칙에 따라 자동으로 접근됩니다.

    Returns:
        int: 금액 x 세율 // 100
    """
    return amount * rate // 100

# 이 파일이 다른 곳에 import되지 않고 '직접 실행'되었을 때만 아래 코드를 실행함
# (다른 파일에서 import할 때 테스트 코드가 자동 실행되는 것을 방지)
if __name__ == '__main__':
    print(tax_of())