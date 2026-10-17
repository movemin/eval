from typing import Optional, get_type_hints

# 첫 줄: 메뉴 수 n, 이어지는 n 줄: "이름 가격", 마지막 줄: 조회할 이름들
n = int(input())
menu = {}
for _ in range(n):
    name, price = input().split()
    menu[name] = int(price)
queries = input().split()


# 딕셔너리를 입력받고 get으로 값이 없으면 None 리턴
def find_price(menu: dict[str, int], name: str) -> int | None:
    """메뉴에서 상품 가격을 찾습니다."""
    return menu.get(name)


# ---- 호출부 (수정 금지) ----
for q in queries:
    print(q, "가격:", find_price(menu, q))
h = get_type_hints(find_price)
print("menu 힌트가 dict[str, int]인가:", h.get("menu") == dict[str, int])
print("name 힌트가 str인가:", h.get("name") is str)
print("반환 힌트가 int | None 인가:", h.get("return") == (int | None))
print("Optional[int] 표기와도 같게 판정되는가:", h.get("return") == Optional[int])