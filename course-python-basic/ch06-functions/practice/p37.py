# 첫 값=요청 수량 n, 둘째 값=전역 재고 stock. 예: "5 10" → n=5, stock=10
parts = input().split()
n = int(parts[0])
stock = int(parts[1])

def in_stock(n):
    """매개변수가 전역변수보다 이하이면 가능, 아니면 불가라는 문자열을 반환합니다."""
    if n <= stock:
        return "가능"
    return "불가"   # 조건 불충족시 조기반환 패턴

print(in_stock(n))