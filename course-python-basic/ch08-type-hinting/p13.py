from typing import get_type_hints


def unique_tags(tags: list[str]) -> set[str]:
    """리스트 형태로 값을 받아 set을 사용하여 중복값이 없는 set 자료형 반환"""
    return set(tags)


# 한 줄: 태그들
tags = input().split()


# ---- 호출부 (수정 금지) ----
print("중복 제거 태그:", sorted(unique_tags(tags)))
h = get_type_hints(unique_tags)
print("tags 힌트가 list[str]인가:", h.get("tags") == list[str])
print("반환 힌트가 set[str]인가:", h.get("return") == set[str])