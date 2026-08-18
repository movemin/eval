# [실무] 사용자 프로필 — list가 담긴 dict 다루기
#
# 회원 한 명에게 태그, 주문 내역처럼 여러 항목이 연결되어 있다면
# dict의 값으로 list를 넣어 표현할 수 있다.

# 회원 한 명의 정보를 dict 하나로 묶는다.
member = {
    "id": 1001,
    "name": "김민수",
    "tags": ["신규회원", "이메일인증"],       # 태그가 여러 개이므로 list
    "orders": [                              # 주문 여러 건을 dict의 list로 표현
        {"item": "키보드", "price": 89000},
        {"item": "마우스", "price": 32000},
    ],
}

# --- 1. list 값 읽기 ---
print("이름:", member["name"])
print("태그:", ", ".join(member["tags"]))


print()
# --- 2. list에 항목 추가/제거 ---
member["tags"].append("VIP")               # 등급이 올라가 VIP 태그 추가
member["tags"].remove("신규회원")            # 더 이상 신규 회원이 아니므로 제거
print("변경된 태그:", member["tags"])


print()
# --- 3. dict가 담긴 list 순회하기 (주문 내역 출력) ---
print("[주문 내역]")
total = 0
for order in member["orders"]:             # 주문 하나가 dict 하나
    print(f"  - {order['item']}: {order['price']:,}원")
    total += order["price"]
print(f"  합계: {total:,}원")


print()
# --- 4. 새 주문 추가 ---
member["orders"].append({"item": "모니터암", "price": 55000})
print("주문 건수:", len(member["orders"]))   # 3


print()
# --- 5. 조건에 맞는 항목만 골라내기 (5만 원 이상 주문) ---
expensive = [o["item"] for o in member["orders"] if o["price"] >= 50000]
print("5만원 이상 주문:", expensive)
