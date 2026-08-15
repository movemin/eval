# 첫 값=가격(price0), 둘째 값=전역 세율 rate. 예: "1000 10" → price0=1000, rate=10
parts = input().split()
price0 = int(parts[0])
rate = int(parts[1])

# 세율은 전역변수 선언
def apply(price) -> int:
    """
    가격을 넣으면 세금이 계산됩니다
    """
    
    # 호출해서 변수를 읽기만 할 때 같은 이름의 내부 변수가 없다면 전역변수를 읽는다(LEGB)
    return price + price * rate // 100

print(apply(price0))