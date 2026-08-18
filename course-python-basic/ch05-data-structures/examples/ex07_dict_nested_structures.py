# dict 안에 다른 자료구조 담기 (중첩 자료구조)
#
# dict의 값(value)에는 숫자·문자열뿐 아니라
# 리스트, 튜플, 또 다른 dict도 그대로 담을 수 있다.
# 그래서 현실의 복잡한 데이터를 하나의 구조로 묶어 표현할 수 있다.

# --- 1. 값이 리스트(list)인 dict ---
# 한 키에 여러 값을 담고 나중에 수정도 해야 한다면 list가 어울린다.
student = {
    "name": "김민수",
    "hobbies": ["축구", "독서", "게임"],   # 값이 list
}

print(student["hobbies"])          # ['축구', '독서', '게임']
print(student["hobbies"][0])       # 첫 번째 취미 → 축구

student["hobbies"].append("요리")   # list라서 항목을 추가할 수 있다.
print(student["hobbies"])          # ['축구', '독서', '게임', '요리']


print()
# --- 2. 값이 튜플(tuple)인 dict ---
# 좌표나 날짜처럼 위치별 의미가 정해진 묶음에는 tuple을 자주 사용한다.
city = {
    "name": "서울",
    "location": (37.5665, 126.9780),   # (위도, 경도) — 보통 바뀌지 않는 값
}

lat, lng = city["location"]            # 튜플 언패킹
print(f"위도 {lat}, 경도 {lng}")

# city["location"][0] = 0   # TypeError: 튜플은 수정할 수 없다.


print()
# --- 3. 값이 또 다른 dict인 dict (중첩 dict) ---
# 정보 안에 세부 정보가 또 있으면 dict 안에 dict를 넣는다.
user = {
    "name": "박서연",
    "address": {                       # 값이 dict
        "city": "부산",
        "zipcode": "48000",
    },
}

print(user["address"]["city"])         # 부산 (dict 안의 dict 접근)
print(user["address"]["zipcode"])      # 48000


print()
# --- 4. 셋 다 섞기 — 현실 데이터는 보통 이렇게 생겼다 ---
person = {
    "name": "최지우",
    "age": 28,
    "hobbies": ["등산", "사진"],                 # list
    "location": (35.1796, 129.0756),            # tuple
    "contact": {                                # dict
        "email": "jiwoo@example.com",
        "phone": "010-1234-5678",
    },
}

# 안쪽 값으로 들어갈수록 [ ]를 이어 붙인다.
print(person["name"])                  # 최지우
print(person["hobbies"][1])            # 사진
print(person["location"][0])           # 35.1796
print(person["contact"]["email"])      # jiwoo@example.com


print()
# --- 5. 핵심 정리 ---
# - dict의 값에는 어떤 자료구조든 담을 수 있다.
# - 안쪽 값에 접근할 때는 [키] 또는 [인덱스]를 계속 이어 붙인다.
#       person["contact"]["email"]
#       └ dict ─┘└ 안쪽 dict ┘
# - 여러 값을 담고 수정해야 하면 list, 고정된 묶음이면 tuple,
#   이름표가 붙은 정보를 표현하려면 dict를 사용한다.
