from typing import TypedDict, Required, get_type_hints

# 클래스 설계
class Options(TypedDict, total=False):
    """테마, 글자 크기, 언어를 관리하는 클래스"""
    theme: str
    font_size: int
    lang: Required[str]  # total=False 환경에서 lang만 필수로 지정

# 현재 객체의 언어와 테마, 글자의 속성을 문자열로 반환합니다.
def describe_options(opt: Options) -> str:
    """언어와 테마, 글자 순으로 문자열로 반환합니다."""
    return f"언어 {opt['lang']} / 테마 {opt.get('theme', '기본')} / 글자 {opt.get('font_size', 14)}"

# 첫 줄: "언어 테마 글자크기", 둘째 줄: 언어만
lang1, theme1, size_text = input().split()
size1 = int(size_text)
lang2 = input().strip()

# ---- 호출부 (수정 금지) ----
o1: Options = {"lang": lang1, "theme": theme1, "font_size": size1}
o2: Options = {"lang": lang2}                 # 필수 키만으로 만들어도 됩니다.
print(describe_options(o1))
print(describe_options(o2))
print("필수 키가 lang 하나인가:", Options.__required_keys__ == frozenset({"lang"}))
print("선택 키가 theme, font_size 두 개인가:", Options.__optional_keys__ == frozenset({"theme", "font_size"}))
h = get_type_hints(Options)
print("키 값 타입 (lang은 str, theme은 str, font_size는 int):", h.get("lang") is str, h.get("theme") is str, h.get("font_size") is int)
h = get_type_hints(describe_options)
print("describe_options는 Options를 받아 str을 반환하는가:", h.get("opt") is Options and h.get("return") is str)