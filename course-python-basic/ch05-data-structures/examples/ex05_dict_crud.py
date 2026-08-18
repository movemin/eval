# [실무] 딕셔너리(dict) — 생성 + CRUD
#
# dict: "키(key) → 값(value)" 쌍으로 저장하는 자료구조.
#       키를 알면 값을 빠르게(O(1)) 찾을 수 있어 실무에서 매우 자주 쓰인다.
#       (예: 사용자 정보, 설정값, API 응답(JSON), 카운팅, 캐시 …)
#
# CRUD = Create(추가) / Read(읽기) / Update(수정) / Delete(삭제)

# ============================================================
# 0. 생성 (초기화) — 자주 쓰는 방법들
# ============================================================
empty = {}                                   # 빈 dict (주의: 빈 set이 아니다!)
empty2 = dict()                              # 함수로도 만들 수 있다.

user = {"name": "김민수", "age": 20}          # 리터럴 (가장 흔함)
user2 = dict(name="박서연", age=22)           # 키워드 인자로 생성 (키가 문자열일 때 편함)
pairs = dict([("a", 1), ("b", 2)])           # (키, 값) 쌍 목록으로

keys = ["국어", "영어", "수학"]
scores = [90, 85, 95]
report = dict(zip(keys, scores))             # 두 리스트를 zip으로 묶어 dict 생성
counter = dict.fromkeys(keys, 0)             # 같은 기본값으로 초기화 → 모두 0

# 딕셔너리 컴프리헨션: 다른 데이터를 바탕으로 새 dict 만들기
square_map = {n: n * n for n in range(1, 4)}  # {1: 1, 2: 4, 3: 9}

print("생성:", user, report)
print("fromkeys:", counter, "| 컴프리헨션:", square_map)


# ============================================================
# 1. Create — 추가  (※ 추가와 수정은 문법이 같다: d[키] = 값)
# ============================================================
member = {"id": 1001, "name": "김민수"}
member["email"] = "kim@example.com"          # 없는 키 → 새로 추가됨
member.setdefault("role", "user")            # 키가 없을 때만 넣기 (있으면 유지)
member.update({"age": 20, "vip": False})     # 여러 키-값을 한 번에 추가/병합
print("\nCreate:", member)


# ============================================================
# 2. Read — 읽기 / 조회
# ============================================================
print("\n[Read]")
print("이름   :", member["name"])                 # [키]로 접근 (키가 없으면 KeyError)
print("연락처 :", member.get("phone", "없음"))     # .get()은 없어도 안전(기본값)
print("id 있나?:", "id" in member)                # 키 존재 확인
print("키 목록:", list(member.keys()))
print("값 목록:", list(member.values()))
for key, value in member.items():                 # 키와 값을 함께 순회할 때 가장 흔한 방식
    print(f"  {key}: {value}")


# ============================================================
# 3. Update — 수정  (존재하는 키에 대입하면 값이 바뀐다)
# ============================================================
member["name"] = "김민수(수정)"                   # 값 교체
member.update({"vip": True, "age": 21})          # 여러 값 한 번에 갱신
print("\nUpdate:", member)

# 예: 등장 횟수 세기 (처음 보는 단어는 0에서 시작해 +1)
text = "apple banana apple cherry banana apple"
freq = {}
for word in text.split():
    freq[word] = freq.get(word, 0) + 1
print("단어 빈도:", freq)


# ============================================================
# 4. Delete — 삭제
# ============================================================
removed = member.pop("email")                # 키로 삭제하고 삭제한 값을 반환 (없으면 KeyError)
member.pop("nickname", None)                 # 기본값을 주면 없어도 에러 안 남
del member["vip"]                            # del 문으로 삭제
print("\nDelete:", member, "| 꺼낸 값:", removed)

member.clear()                               # 전체 비우기
print("clear 후:", member)


# ============================================================
# 5. 실무 팁
# ============================================================
# - 값 읽기는 .get(키, 기본값)이 안전하다. 반드시 있어야 하는 값은 [키]로 빨리 실패하게 둔다.
# - 추가와 수정의 문법이 같다(d[키]=값): 키가 있으면 수정, 없으면 추가.
# - 카운팅/누적은 .get(키, 0)이나 setdefault를 쓰면 깔끔하다.
#   (더 편한 collections.Counter, defaultdict도 있다 — 이후 단계에서)
# - dict는 입력한 순서를 유지한다(파이썬 3.7+).
# - 두 dict 병합: d.update(other) 또는 합치기 연산자 d | other (3.9+).
