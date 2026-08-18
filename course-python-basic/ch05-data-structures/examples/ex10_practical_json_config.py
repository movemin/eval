# [실무] 설정/API 데이터 — list·tuple·dict가 깊게 중첩된 dict
#
# 웹 API 응답(JSON)이나 설정 파일은 거의 항상 이 모양이다.
# dict 안에 list, list 안에 dict처럼 여러 단계로 중첩된다.
# 이 예제에서는 [키]와 [인덱스]를 이어 붙여 깊은 값에 접근하는 방법을 연습한다.

# 가상의 주문 API 응답 한 건을 dict로 표현했다.
response = {
    "status": "success",
    "order": {
        "id": "ORD-2026-0042",
        "customer": {                          # dict 안의 dict
            "name": "박서연",
            "coords": (37.5665, 126.9780),     # 배송지 좌표는 tuple로 표현
        },
        "items": [                             # dict 안의 list, 그 안의 dict
            {"name": "키보드", "qty": 1, "price": 89000},
            {"name": "마우스", "qty": 2, "price": 32000},
        ],
        "coupons": ["WELCOME10", "FREESHIP"],  # 단순 list
    },
}

# --- 1. 깊은 곳 값 하나 읽기 ---
# 바깥쪽에서 안쪽으로 [ ]를 이어 붙인다.
print("주문번호:", response["order"]["id"])
print("고객명:", response["order"]["customer"]["name"])
print("쿠폰 1번:", response["order"]["coupons"][0])

# list 안에 dict가 있으면 [인덱스] 뒤에 [키]를 이어 붙인다.
print("첫 상품명:", response["order"]["items"][0]["name"])


print()
# --- 2. 자주 쓰는 위치는 변수로 짧게 줄이기 ---
order = response["order"]
items = order["items"]


print()
# --- 3. 중첩된 list(dict)를 순회하면서 합계 구하기 ---
print("[주문 상품]")
total = 0
for it in items:
    line = it["qty"] * it["price"]             # 수량 × 단가
    total += line
    print(f"  {it['name']} x{it['qty']} = {line:,}원")
print(f"  상품 합계: {total:,}원")


print()
# --- 4. 안전하게 꺼내기 — .get() ---
# 외부 데이터에는 키가 빠져 있을 수 있으므로 .get()으로 기본값을 정해 둔다.
# 없는 키를 []로 바로 접근하면 KeyError가 발생한다.
memo = order.get("memo", "메모 없음")
print("배송 메모:", memo)                        # 키가 없으니 기본값 출력


print()
# --- 5. 깊은 값 수정 ---
order["customer"]["name"] = "박서연(수정)"        # 중첩 dict의 값 변경
order["items"][1]["qty"] = 3                     # 두 번째 상품 수량 변경
print("수정된 고객명:", order["customer"]["name"])
print("마우스 수량:", items[1]["qty"])


print()
# --- 6. 핵심 정리 ---
# - 중첩이 깊어도 규칙은 같다. dict면 [키], list/tuple이면 [인덱스]를 이어 붙인다.
# - 외부에서 받은 데이터(API/설정)는 키가 없을 수 있으니 .get()으로 안전하게 꺼낸다.
# - 접근식이 너무 길어지면 중간 단계를 변수로 나누어 읽기 쉽게 만든다.
