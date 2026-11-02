from typing import TypedDict, NotRequired, get_type_hints

# 다섯 줄: 첫 문항 번호/질문/힌트, 둘째 문항 번호/질문 (둘째 문항은 힌트 없음)
qid1 = int(input())
text1 = input().strip()
hint1 = input().strip()
qid2 = int(input())
text2 = input().strip()


# 질문 클래스 타입 설정
class Question(TypedDict):
    """질문을 관리하는 객체로, 속성은 질문자 아이디, 내용, 힌트로 구성됩니다."""
    qid: int
    text: str
    hint: NotRequired[str]


def format_question(q: Question) -> str:
    """객체의 아이디와 내용을 반환합니다."""
    return f"{q['qid']}번. {q['text']}"


def show_hint(q: Question) -> str:
    """힌트에 값이 있는지 여부를 반환합니다."""
    return q.get("hint", "힌트 없음")


# ---- 호출부 (수정 금지) ----
q1: Question = {"qid": qid1, "text": text1, "hint": hint1}
q2: Question = {"qid": qid2, "text": text2}          # 선택 키 hint 없이 만들어도 됩니다.
print(format_question(q1))
print("힌트:", show_hint(q1))
print(format_question(q2))
print("힌트:", show_hint(q2))
# 필수 키와 선택 키가 선언대로 나뉘었는지 확인합니다.
print("필수 키가 qid, text 두 개인가:", Question.__required_keys__ == frozenset({"qid", "text"}))
print("선택 키가 hint 하나인가:", Question.__optional_keys__ == frozenset({"hint"}))
h = get_type_hints(Question)
print("키 값 타입 (qid는 int, text는 str, hint는 str):", h.get("qid") is int, h.get("text") is str, h.get("hint") is str)
h = get_type_hints(format_question)
print("format_question은 Question을 받아 str을 반환하는가:", h.get("q") is Question and h.get("return") is str)